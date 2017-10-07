package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vente implements Serializable {
	
	@Id
	@GeneratedValue
	private Long IdVente;

	public Long getIdVente() {
		return IdVente;
	}

	public void setIdVente(Long idVente) {
		IdVente = idVente;
	}

	

}
