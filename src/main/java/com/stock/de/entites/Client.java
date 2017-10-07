package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client implements Serializable {
	
	@Id
	@GeneratedValue
	private Long IdClient;

	public Long getIdClient() {
		return IdClient;
	}

	public void setIdClient(Long idClient) {
		IdClient = idClient;
	}
	
	

}
