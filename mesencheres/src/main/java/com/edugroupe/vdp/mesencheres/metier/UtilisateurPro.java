package com.edugroupe.vdp.mesencheres.metier;

import javax.persistence.Entity;

@Entity
public class UtilisateurPro extends UtilisateurBasic {
	String raisonSociale;

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	@Override
	public String toString() {
		return "UtilisateurPro [raisonSociale=" + raisonSociale + ", toString()=" + super.toString() + "]";
	}

	public UtilisateurPro(int id, String nom, String prenom, String adresse, String raisonSociale) {
		super(id, nom, prenom, adresse);
		this.raisonSociale = raisonSociale;
	}
	
	public UtilisateurPro(){
		this(0,"","","","");
	}
}
