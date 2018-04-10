package com.formacion.HibernateSpring;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.formacion.HibernateSpring.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {
	
	@Query("SELECT p FROM User p WHERE LOWER(p.name) = LOWER(:name)")
    public List<User> find(@Param("name") String lastName);
}
