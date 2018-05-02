package mx.com.vrm.viai.configuration;

import static mx.com.vrm.viai.configuration.Constants.LOGIN_URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

	private static final Logger logger = LoggerFactory.getLogger(SpringSecurityConfiguration.class);

	@Autowired
	UserDetailsService userDetailsService;

	public SpringSecurityConfiguration(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordencoder());
		;

	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.
//			authorizeRequests()
//			.antMatchers("/", "/home")
//			.permitAll().antMatchers("/home/**")
//				//***MANY ROLES***
//				.access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
//				.and()
//				.formLogin()
//				.loginPage("/home")
//				.usernameParameter("ssoId")		
//				.passwordParameter("password")
//				.defaultSuccessUrl("/principal")
//				.and()
//				.csrf()
//				.and()
//				.exceptionHandling()
//				.accessDeniedPage("/Access_Denied");
//	}
	
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		/*
		 * 1. Se desactiva el uso de cookies
		 * 2. Se activa la configuración CORS con los valores por defecto
		 * 3. Se desactiva el filtro CSRF
		 * 4. Se indica que el login no requiere autenticación
		 * 5. Se indica que el resto de URLs esten securizadas
		 */
//		httpSecurity
//			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//			.and()
//				.cors()
//			.and()
//				.csrf().disable()
//				.authorizeRequests()
//				.antMatchers(HttpMethod.POST, LOGIN_URL, "/home/**").permitAll()
//				.anyRequest()
//				.authenticated()
//				.antMatchers("/", "/login","/home").permitAll()
//				.antMatchers("/principal/**")
//				.access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
//				.and()
//				.formLogin()
//				.loginPage("/home")
//				.usernameParameter("ssoId")		
//				.passwordParameter("password").defaultSuccessUrl("/home")
//				.and().exceptionHandling()
//				.accessDeniedPage("/Access_Denied")
//			.and()
//				.addFilter(new JWTAuthenticationFilter(authenticationManager()))
//				.addFilter(new JWTAuthorizationFilter(authenticationManager()))
//			;
		
		
		httpSecurity
		.authorizeRequests()
			.antMatchers(HttpMethod.POST, LOGIN_URL).permitAll()
			//***MANY ROLES***
			//.anyRequest()
			//.authenticated()
			.antMatchers("/","/home").permitAll()
			.antMatchers("/principal/**")
			.access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
			.and()
			.formLogin()
			.loginPage("/home")
			.usernameParameter("ssoId")		
			.passwordParameter("password")
			.defaultSuccessUrl("/principal")
			.and()
			.csrf().disable()
			.exceptionHandling()
			.accessDeniedPage("/Access_Denied")
			.and()
			.cors()
			.and()
			.addFilter(new JWTAuthenticationFilter(authenticationManager()))
			.addFilter(new JWTAuthorizationFilter(authenticationManager()));	
		
		
		
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Se define la clase que recupera los usuarios y el algoritmo para
		// procesar las passwords
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordencoder());
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
		return source;
	}

	@Bean(name = "passwordEncoder")
	public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
}
