package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable {
	
	@Id
	@GeneratedValue
	private Long IdUtilisateur;

	public Long getIdUtilisateur() {
		return IdUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		IdUtilisateur = idUtilisateur;
	}
	
	

}
