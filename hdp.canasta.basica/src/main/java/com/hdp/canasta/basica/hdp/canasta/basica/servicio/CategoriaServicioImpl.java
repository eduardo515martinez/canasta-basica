package com.hdp.canasta.basica.hdp.canasta.basica.servicio;

import com.hdp.canasta.basica.hdp.canasta.basica.dao.CategoriaDao;
import com.hdp.canasta.basica.hdp.canasta.basica.entidad.CategoriaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicioImpl implements CategoriaServicio{

    @Autowired
    private CategoriaDao categoriaDao;
    @Override
    public List<CategoriaEntity> listarCategorias() {
        return (List<CategoriaEntity>) categoriaDao.findAll();
    }

    @Override
    public CategoriaEntity guardar(CategoriaEntity categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    public void eliminar(Long id) {
        categoriaDao.deleteById(id);
    }
}
