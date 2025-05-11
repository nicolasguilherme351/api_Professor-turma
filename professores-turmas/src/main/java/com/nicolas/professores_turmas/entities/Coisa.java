package com.nicolas.professores_turmas.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Coisa  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	private Integer idadeDoCoisa;
	private String name;
	
	public Coisa() {
	}
	
	public Coisa(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdadeDoCoisa() {
		return idadeDoCoisa;
	}

	public void setIdadeDoCoisa(Integer idadeDoCoisa) {
		this.idadeDoCoisa = idadeDoCoisa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
