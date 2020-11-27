package com.itesm.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itesm.dao.AvisoDAO;
import com.itesm.dao.LoginDAO;
import com.itesm.model.Aviso;

@Controller
public class LoginController {
	@Autowired
	private LoginDAO loginDAO;
	
	@Autowired
	private AvisoDAO avisoDAO;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		Map<String, Object> credentials = loginDAO.validarCredenciales(request.getParameter("username"), request.getParameter("password"));
		int idUsuario = (int) credentials.get("id_usuario");
		int idRol = (int) credentials.get("id_rol");

		if(idUsuario > 0) {
			List<Aviso> avisos = avisoDAO.obtenerAvisos();
			mav.addObject("idUsuario", idUsuario);
			mav.addObject("idRol", idRol);
			mav.addObject("avisos", avisos);
			mav.setViewName("avisos");
		} else {
			mav.setViewName("login-error");
		}
		
		return mav;
	}
}
