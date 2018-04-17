package mx.com.vrm.viai.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mx.com.vrm.viai.dto.PropiedadesInicialesDTO;
import mx.com.vrm.viai.dto.PropiedadesUsuariosDTO;
//import mx.com.vrm.viai.model.CdpCDetalle;
//import mx.com.vrm.viai.model.CdpCUsuario;
//import mx.com.vrm.viai.model.CpdCPolitica;
import mx.com.vrm.viai.service.PoliticasService;
import mx.com.vrm.viai.service.SeccionesService;
import mx.com.vrm.viai.service.UsuariosService;

@Controller
@RequestMapping("/")
public class AppController {

	
	SeccionesService seccionesService;

	
	PoliticasService politicasService;

	
	UsuariosService usuariosService;

	private static final Logger logger = LoggerFactory.getLogger(AppController.class);

	public List<PropiedadesInicialesDTO> listaPropiedadesDTO = new ArrayList<PropiedadesInicialesDTO>();
	public List<PropiedadesUsuariosDTO> listaPropiedadesUsuarios = new ArrayList<PropiedadesUsuariosDTO>();

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		{
			logger.info("Inicio de controller");
			Map<String, Object> myModel = new HashMap<String, Object>();
			myModel.put("propiedades", listaPropiedadesDTO);
			myModel.put("usuarios", listaPropiedadesUsuarios);
			return new ModelAndView("login", "modelPropiedades", myModel);
		}
	}



	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		System.out.println("HOLA MUNDO HOME2");
		return "home";
	}

	private String getPrincipal() {
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {	
			userName = principal.toString();
		}
		return userName;
	}

	@RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
	public String accessDeniedPage(ModelMap model) {
		model.addAttribute("user", getPrincipal());
		return "Access_Denied";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login?logout";
	}
}