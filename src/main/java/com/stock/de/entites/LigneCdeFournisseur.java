package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LigneCdeFournisseur implements Serializable {
	
	@Id
	@GeneratedValue
	private Long IdLigneCdeFournisseur;

	public Long getIdLigneCdeFournisseur() {
		return IdLigneCdeFournisseur;
	}

	public void setIdLigneCdeFournisseur(Long idLigneCdeFournisseur) {
		IdLigneCdeFournisseur = idLigneCdeFournisseur;
	}
	
	
	

}
