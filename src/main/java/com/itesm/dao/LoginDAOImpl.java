package com.itesm.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

@Component
public class LoginDAOImpl implements LoginDAO {
	private JdbcTemplate jdbcTemplate;
	
	public LoginDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Map<String, Object> validarCredenciales(String usuario, String contrasenia) {
		SimpleJdbcCall spCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("validarLogin");
		SqlParameterSource in = new MapSqlParameterSource().addValue("usuario", usuario).addValue("contrasenia", contrasenia);
		Map<String, Object> out = spCall.execute(in);
		return out;	
	}
	
}
