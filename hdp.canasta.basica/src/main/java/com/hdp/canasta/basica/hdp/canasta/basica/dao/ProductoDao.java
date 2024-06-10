package com.hdp.canasta.basica.hdp.canasta.basica.dao;

import com.hdp.canasta.basica.hdp.canasta.basica.entidad.ProductoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoDao extends CrudRepository<ProductoEntity, Long> {
    @Query("SELECT p FROM ProductoEntity p WHERE YEAR(p.fecha) = :anio")
    List<ProductoEntity> findAllByAnio(@Param("anio") int anio);
}
