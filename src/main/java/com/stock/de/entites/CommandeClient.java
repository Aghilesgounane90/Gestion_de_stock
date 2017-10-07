package com.stock.de.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CommandeClient implements Serializable {
	
	@Id
	@GeneratedValue
	private Long idCommandeClient;
	
	private String Code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@OneToMany(mappedBy = "commandeClient" )
	private List<LigneCdeClient> LigneCdeClients;
	
	

	public CommandeClient() {
		super();
	}

	public Long getIdCommandeClient() {
		return idCommandeClient;
	}

	public void setIdCommandeClient(Long idCommandeClient) {
		this.idCommandeClient = idCommandeClient;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneCdeClient> getLigneCdeClients() {
		return LigneCdeClients;
	}

	public void setLigneCdeClients(List<LigneCdeClient> ligneCdeClients) {
		LigneCdeClients = ligneCdeClients;
	}
}
