package com.m2i.tp2;

public abstract class Porte implements Pesable {
	private String couleur = "blanc";
	private Double poidsComplets; //poids complet avec poignée (+get/set)
	
	public abstract void ouvrir();//sera codé dans les sous classes
	public abstract void fermer();//sera codé dans les sous classes
	
	
   //méthode imposée par l'interface Pesable
	public Double getPoids() {
		return poidsComplets;
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Double getPoidsComplets() {
		return poidsComplets;
	}
	public void setPoidsComplets(Double poidsComplets) {
		this.poidsComplets = poidsComplets;
	}
	
	
	
}
