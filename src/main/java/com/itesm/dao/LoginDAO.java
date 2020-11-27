package com.itesm.dao;

import java.util.Map;

public interface LoginDAO {
	public Map<String, Object> validarCredenciales(String usuario, String contrasenia);
}
