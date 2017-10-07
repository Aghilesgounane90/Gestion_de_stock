package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LigneVente implements Serializable {
	
	@Id
	@GeneratedValue
	private Long IdLigneVente;

	public Long getIdLigneVente() {
		return IdLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		IdLigneVente = idLigneVente;
	}

	

}
