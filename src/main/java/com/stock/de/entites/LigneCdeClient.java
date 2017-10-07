package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LigneCdeClient implements Serializable {
	
	@Id
	@GeneratedValue
	private Long IdLigneCdeClient;

	public Long getIdLigneCdeClient() {
		return IdLigneCdeClient;
	}

	public void setIdLigneCdeClient(Long idLigneCdeClient) {
		IdLigneCdeClient = idLigneCdeClient;
	}
	
	
	

}
