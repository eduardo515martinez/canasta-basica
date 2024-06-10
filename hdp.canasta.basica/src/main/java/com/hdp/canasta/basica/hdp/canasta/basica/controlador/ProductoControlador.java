package com.hdp.canasta.basica.hdp.canasta.basica.controlador;

import com.hdp.canasta.basica.hdp.canasta.basica.dao.ProductoDao;
import com.hdp.canasta.basica.hdp.canasta.basica.entidad.CategoriaEntity;
import com.hdp.canasta.basica.hdp.canasta.basica.entidad.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoControlador {
    @Autowired
    private ProductoDao productoDao;
    @GetMapping
    public List<ProductoEntity> listarProductos(){
        return (List<ProductoEntity>) productoDao.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductoEntity agregarProducto(@RequestBody ProductoEntity producto){
        return productoDao.save(producto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarProducto(@PathVariable Long id){
        productoDao.deleteById(id);
    }

    @GetMapping("/filtro-por-fecha")
    public List<ProductoEntity> obtenerProductosPorAnio(@RequestParam int anio) {
        return productoDao.findAllByAnio(anio);
    }
}
