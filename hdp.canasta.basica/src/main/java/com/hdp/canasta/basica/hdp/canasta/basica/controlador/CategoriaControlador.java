package com.hdp.canasta.basica.hdp.canasta.basica.controlador;

import com.hdp.canasta.basica.hdp.canasta.basica.entidad.CategoriaEntity;
import com.hdp.canasta.basica.hdp.canasta.basica.servicio.CategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaControlador {
    @Autowired
    private CategoriaServicio categoriaServicio;
    @GetMapping
    public List<CategoriaEntity> listarCategorias(){
        return categoriaServicio.listarCategorias();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoriaEntity agregarCategoria(@RequestBody CategoriaEntity categoria){
        return categoriaServicio.guardar(categoria);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarCategoria(@PathVariable Long id){
        categoriaServicio.eliminar(id);
    }


}
