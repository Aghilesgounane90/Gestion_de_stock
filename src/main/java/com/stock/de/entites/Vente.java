package com.stock.de.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vente implements Serializable {
	
	@Id
	@GeneratedValue
	private Long idVente;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date deteVente;
	
	@OneToMany(mappedBy="vente")
	private List<LigneVente> ligneVentes;
	
	public Vente() {
		super();
	}

	public Long getIdVente() {
		return idVente;
	}

	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDeteVente() {
		return deteVente;
	}

	public void setDeteVente(Date deteVente) {
		this.deteVente = deteVente;
	}

	public List<LigneVente> getLigneVentes() {
		return ligneVentes;
	}

	public void setLigneVentes(List<LigneVente> ligneVentes) {
		this.ligneVentes = ligneVentes;
	}
}
