package com.example.restservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "usuario")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	private String email;

    
    private String curso;
    private Integer creditos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    //
    public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


    public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

//

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}