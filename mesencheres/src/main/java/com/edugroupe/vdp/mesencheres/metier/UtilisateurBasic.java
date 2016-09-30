package com.edugroupe.vdp.mesencheres.metier;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class UtilisateurBasic {
	
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	Set<Article> articles;
	Set<SessionEnchere> sessions;
	
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	@OneToMany(mappedBy="proprietaire")
	public Set<Article> getArticles() {
		return articles;
	}
	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
	
	@ManyToMany(mappedBy="participants")
	public Set<SessionEnchere> getSessions() {
		return sessions;
	}
	public void setSessions(Set<SessionEnchere> sessions) {
		this.sessions = sessions;
	}
	public UtilisateurBasic(int id, String nom, String prenom, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public UtilisateurBasic(){
		this(0,"","","");
	}
	@Override
	public String toString() {
		return "UtilisateurBasic [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}
	
}
