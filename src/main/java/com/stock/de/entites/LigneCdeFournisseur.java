package com.stock.de.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCdeFournisseur implements Serializable {
	
	@Id
	@GeneratedValue
	private Long idLigneCdeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	

	public LigneCdeFournisseur() {
		super();
	}

	public Long getIdLigneCdeFournisseur() {
		return idLigneCdeFournisseur;
	}

	public void setIdLigneCdeFournisseur(Long idLigneCdeFournisseur) {
		this.idLigneCdeFournisseur = idLigneCdeFournisseur;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
}
