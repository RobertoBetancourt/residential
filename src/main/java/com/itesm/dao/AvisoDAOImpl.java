package com.itesm.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import com.itesm.model.Aviso;

@Component
public class AvisoDAOImpl implements AvisoDAO {
	private JdbcTemplate jdbcTemplate;
	
	public AvisoDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Aviso> obtenerAvisos() {
		SimpleJdbcCall spCall = new SimpleJdbcCall(jdbcTemplate).
				withProcedureName("obtenerAvisos").
				returningResultSet("result-set-1", BeanPropertyRowMapper.newInstance(Aviso.class));
		Map<String, Object> m = spCall.execute(new HashMap<String, Object>(0));		
		return (List<Aviso>) m.get("result-set-1");
	}

}
