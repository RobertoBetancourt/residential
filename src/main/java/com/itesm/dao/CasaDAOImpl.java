package com.itesm.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import com.itesm.model.Casa;
import com.itesm.model.Propiedad;

@Component("casa")
public class CasaDAOImpl implements PropiedadDAO {
private JdbcTemplate jdbcTemplate;
	
	public CasaDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Propiedad> obtenerPropiedades(int idUsuario) {
		SimpleJdbcCall spCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("obtenerCasas")
				.returningResultSet("result-set-1", BeanPropertyRowMapper.newInstance(Casa.class));
		Map<String, Object> m = spCall.execute(new MapSqlParameterSource().addValue("idUsuario", idUsuario));	
		return (List<Propiedad>) m.get("result-set-1");
	}
}
