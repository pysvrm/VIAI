package mx.com.vrm.viai.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

	private static final Logger logger = LoggerFactory.getLogger(SpringSecurityConfiguration.class);


	@Autowired	
	UserDetailsService userDetailsService;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {			 
	 auth.userDetailsService(userDetailsService).passwordEncoder(passwordencoder());;
		
	}	


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/login").permitAll().antMatchers("/home/**")
				//***ONE ROLE***.access("hasRole('ROLE_ADMIN','ROLE_USER')").and().formLogin().loginPage("/login").usernameParameter("ssoId")
				//***MANY ROLES***
				.access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')").and().formLogin().loginPage("/login").usernameParameter("ssoId")		
				.passwordParameter("password").defaultSuccessUrl("/home").and().csrf().and().exceptionHandling()
				.accessDeniedPage("/Access_Denied");
	}
	
	
	@Bean(name="passwordEncoder")
    public PasswordEncoder passwordencoder(){
    	return new BCryptPasswordEncoder();
    }
}
