package com.edugroupe.vdp.mesencheres.metier;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SessionEnchere {
	int id;
	Article article;
	Set<Enchere> encheres;
	Set<UtilisateurBasic> participants;
	int EnchereMaximumAuto;
	
	@Id @GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToMany
	public Set<UtilisateurBasic> getParticipants() {
		return participants;
	}
	public void setParticipants(Set<UtilisateurBasic> participants) {
		this.participants = participants;
	}
	
	@OneToOne
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
	@OneToMany(mappedBy="session")
	public Set<Enchere> getEncheres() {
		return encheres;
	}
	public void setEncheres(Set<Enchere> encheres) {
		this.encheres = encheres;
	}
	public int getEnchereMaximumAuto() {
		return EnchereMaximumAuto;
	}
	public void setEnchereMaximumAuto(int enchereMaximumAuto) {
		EnchereMaximumAuto = enchereMaximumAuto;
	}
	public SessionEnchere(int id, int enchereMaximumAuto) {
		super();
		this.id = id;
		EnchereMaximumAuto = enchereMaximumAuto;
	}
	
	public SessionEnchere(){
		this(0,0);
	}
	@Override
	public String toString() {
		return "SessionEnchere [id=" + id + ", EnchereMaximumAuto=" + EnchereMaximumAuto + "]";
	}
	
}
