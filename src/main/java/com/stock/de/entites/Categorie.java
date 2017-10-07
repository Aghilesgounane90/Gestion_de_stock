package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categorie implements Serializable {

	@Id
	@GeneratedValue
	private Long IdCategorie;

	public Long getIdCategorie() {
		return IdCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		IdCategorie = idCategorie;
	}
	
	
}
