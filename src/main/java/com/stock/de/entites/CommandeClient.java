package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CommandeClient implements Serializable {
	
	@Id
	@GeneratedValue
	private Long IdCommandeClient;

	public Long getIdCommandeClient() {
		return IdCommandeClient;
	}

	public void setIdCommandeClient(Long idCommandeClient) {
		IdCommandeClient = idCommandeClient;
	}
	
	

}
