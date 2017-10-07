package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MvtStk implements Serializable {

	@Id
	@GeneratedValue
	private Long IdMvtStk;

	public Long getIdMvtStk() {
		return IdMvtStk;
	}

	public void setIdMvtStk(Long idMvtStk) {
		IdMvtStk = idMvtStk;
	}
	
	
}
