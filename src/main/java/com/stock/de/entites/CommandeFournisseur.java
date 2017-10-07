package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CommandeFournisseur implements Serializable {
	
	@Id
	@GeneratedValue
     private Long IdCommandeFournisseur;

	public Long getIdCommandeFournisseur() {
		return IdCommandeFournisseur;
	}

	public void setIdCommandeFournisseur(Long idCommandeFournisseur) {
		IdCommandeFournisseur = idCommandeFournisseur;
	}
	
	
}
