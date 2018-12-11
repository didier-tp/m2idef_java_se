package com.m2i.tp2;

public abstract class Porte {
	private String couleur = "blanc";
	
	public abstract void ouvrir();//sera codé dans les sous classes
	public abstract void fermer();//sera codé dans les sous classes

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
