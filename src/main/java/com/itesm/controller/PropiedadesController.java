package com.itesm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.itesm.dao.PropiedadDAO;

@Controller
public class PropiedadesController {
	@Autowired
	@Qualifier("apartamento")
	private PropiedadDAO apartamentoDAO;
	
	@Autowired
	@Qualifier("casa")
	private PropiedadDAO casaDAO;
	
	@RequestMapping(value="/propiedades/idRol={idRol}", method = RequestMethod.GET)
	public ModelAndView propiedades(@PathVariable int idRol) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("apartamentos", apartamentoDAO.obtenerPropiedades(idRol));
		mav.addObject("casas", casaDAO.obtenerPropiedades(idRol));
		mav.setViewName("propiedades");
		return mav;
	}
}
