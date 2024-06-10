package com.hdp.canasta.basica.hdp.canasta.basica.servicio;

import com.hdp.canasta.basica.hdp.canasta.basica.entidad.CategoriaEntity;

import java.util.List;

public interface CategoriaServicio {
    public List<CategoriaEntity> listarCategorias();

    public CategoriaEntity guardar(CategoriaEntity categoria);

    public void eliminar(Long id);

}
