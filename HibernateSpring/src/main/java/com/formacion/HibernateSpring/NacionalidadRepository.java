package com.formacion.HibernateSpring;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.formacion.HibernateSpring.Nacionalidad;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface NacionalidadRepository extends CrudRepository<Nacionalidad, Long> {
	
	@Query("SELECT N.ciudad FROM Nacionalidad N INNER JOIN User U ON U.pais = N.pais WHERE U.name = :name")
    public List<String> findCities(@Param("name") String name);
}
