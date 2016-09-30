package com.edugroupe.vdp.mesencheres.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Article {
	int id;
	String nom;
	String description;
	int miseDeDepart;
	int enchereMinimum;
	UtilisateurBasic proprietaire;
	SessionEnchere session;
	
	
	@OneToOne(mappedBy="article")
	public SessionEnchere getSession() {
		return session;
	}
	public void setSession(SessionEnchere session) {
		this.session = session;
	}
	@ManyToOne
	public UtilisateurBasic getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(UtilisateurBasic proprietaire) {
		this.proprietaire = proprietaire;
	}
	@Id @GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMiseDeDepart() {
		return miseDeDepart;
	}
	public void setMiseDeDepart(int miseDeDepart) {
		this.miseDeDepart = miseDeDepart;
	}
	public int getEnchereMinimum() {
		return enchereMinimum;
	}
	public void setEnchereMinimum(int enchereMinimum) {
		this.enchereMinimum = enchereMinimum;
	}
	public Article(int id, String nom, String description, int miseDeDepart, int enchereMinimum) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.miseDeDepart = miseDeDepart;
		this.enchereMinimum = enchereMinimum;
	}
	public Article(){
		this(0,"","",0,0);
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", description=" + description + ", miseDeDepart=" + miseDeDepart
				+ ", enchereMinimum=" + enchereMinimum + "]";
	}
	
	
}
