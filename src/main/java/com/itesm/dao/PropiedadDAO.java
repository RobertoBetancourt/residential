package com.itesm.dao;

import java.util.List;

import com.itesm.model.Propiedad;

public interface PropiedadDAO {
	public List<Propiedad> obtenerPropiedades(int idUsuario);
}
