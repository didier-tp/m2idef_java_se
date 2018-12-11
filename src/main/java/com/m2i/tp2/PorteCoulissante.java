package com.m2i.tp2;

public class PorteCoulissante extends Porte {
	
	private String glissiere ="glissiere";
	private int translation = 0; //en cm  (0 cm = fermé , 80cm = ouvert)
	
	public void faireGlisser(int tr) {
		this.translation = tr;
		System.out.println("apres glissement , translation =" + translation);
		if(this.translation==0) 
			System.out.println("porte coulissante fermée");
		else if(this.translation>=80) 
			   System.out.println("porte coulissante ouverte");
	}

	public String getGlissiere() {
		return glissiere;
	}

	public void setGlissiere(String glissiere) {
		this.glissiere = glissiere;
	}

	public int getTranslation() {
		return translation;
	}

	public void setTranslation(int translation) {
		this.translation = translation;
	}

	@Override
	public void ouvrir() {
		faireGlisser(80);
	}

	@Override
	public void fermer() {
		faireGlisser(0);
	}

}
