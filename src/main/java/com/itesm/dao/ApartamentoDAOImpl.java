package com.itesm.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import com.itesm.model.Apartamento;
import com.itesm.model.Propiedad;

@Component("apartamento")
public class ApartamentoDAOImpl implements PropiedadDAO {
	private JdbcTemplate jdbcTemplate;
	
	public ApartamentoDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Propiedad> obtenerPropiedades(int idUsuario) {
		SimpleJdbcCall spCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("obtenerApartamentos")
				.returningResultSet("result-set-1", BeanPropertyRowMapper.newInstance(Apartamento.class));
		Map<String, Object> m = spCall.execute(new MapSqlParameterSource().addValue("idUsuario", idUsuario));	
		return (List<Propiedad>) m.get("result-set-1");
	}

}
