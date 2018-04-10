package com.formacion.HibernateSpring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Nacionalidad {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String ciudad;
    private String pais;
    private String idiomaHabla;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getIdiomaHabla() {
		return idiomaHabla;
	}

	public void setIdiomaHabla(String idiomaHabla) {
		this.idiomaHabla = idiomaHabla;
	}
   
}

