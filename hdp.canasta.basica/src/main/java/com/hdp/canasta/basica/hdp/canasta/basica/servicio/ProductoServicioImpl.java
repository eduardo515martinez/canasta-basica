package com.hdp.canasta.basica.hdp.canasta.basica.servicio;

import com.hdp.canasta.basica.hdp.canasta.basica.entidad.ProductoEntity;
import com.hdp.canasta.basica.hdp.canasta.basica.dao.ProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl implements ProductoServicio {

    @Autowired
    private ProductoDao productoDao;
    @Override
    public List<ProductoEntity> listarProductos() {
        return (List<ProductoEntity>) productoDao.findAll();
    }

    @Override
    public ProductoEntity guardarProducto(ProductoEntity producto) {
        return productoDao.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoDao.deleteById(id);
    }

    @Override
    public List<ProductoEntity> encontrarProductosPorAnio(int anio) {
        return productoDao.findAllByAnio(anio);
    }
}
