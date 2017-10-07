package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fournisseur implements Serializable {
	
	@Id
	@GeneratedValue
	private Long IdFournisseur;

	public Long getIdFournisseur() {
		return IdFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		IdFournisseur = idFournisseur;
	}
	
	

}
