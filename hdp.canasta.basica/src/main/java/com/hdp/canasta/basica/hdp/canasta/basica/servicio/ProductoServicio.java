package com.hdp.canasta.basica.hdp.canasta.basica.servicio;

import com.hdp.canasta.basica.hdp.canasta.basica.entidad.ProductoEntity;

import java.util.List;

public interface ProductoServicio {

    public List<ProductoEntity> listarProductos();

    public ProductoEntity guardarProducto(ProductoEntity producto);

    public void eliminarProducto(Long id);

    public List<ProductoEntity> encontrarProductosPorAnio(int anio);

}
