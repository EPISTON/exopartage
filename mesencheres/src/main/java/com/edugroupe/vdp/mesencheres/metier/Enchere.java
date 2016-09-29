package com.edugroupe.vdp.mesencheres.metier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Enchere {
	int id;
	int nouveauMontant;
	Date dateEnchere;
	SessionEnchere session;
	
	@ManyToOne
	public SessionEnchere getSession() {
		return session;
	}
	public void setSession(SessionEnchere session) {
		this.session = session;
	}
	@Id @GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNouveauMontant() {
		return nouveauMontant;
	}
	public void setNouveauMontant(int nouveauMontant) {
		this.nouveauMontant = nouveauMontant;
	}
	public Date getDateEnchere() {
		return dateEnchere;
	}
	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	public Enchere(int id, int nouveauMontant, Date dateEnchere) {
		super();
		this.id = id;
		this.nouveauMontant = nouveauMontant;
		this.dateEnchere = dateEnchere;
	}
	public Enchere(){
		this(0,0,new Date());
	}
	@Override
	public String toString() {
		return "Enchere [id=" + id + ", nouveauMontant=" + nouveauMontant + ", dateEnchere=" + dateEnchere + "]";
	}
	
	
}
