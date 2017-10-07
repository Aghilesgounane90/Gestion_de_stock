package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCdeClient implements Serializable {
	
	@Id
	@GeneratedValue
	private Long IdLigneCdeClient;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeClient")
	private CommandeClient commandeClient;

	public Long getIdLigneCdeClient() {
		return IdLigneCdeClient;
	}
	

	public LigneCdeClient() {
		super();
	}



	public void setIdLigneCdeClient(Long idLigneCdeClient) {
		IdLigneCdeClient = idLigneCdeClient;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}
}
