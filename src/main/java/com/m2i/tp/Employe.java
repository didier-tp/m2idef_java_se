package com.m2i.tp;

public class Employe extends Personne {
	private Integer salaire;

	public Integer getSalaire() {
		return salaire;
	}

	public void setSalaire(Integer salaire) {
		this.salaire = salaire;
	}
	
	public void augmenterSalaire(Double pourcentage) {
		salaire = (int) ( (double) salaire * (1 + (pourcentage / 100))); 
	}
	
	
	@Override
	public String toString() {
		return "Employe avec salaire=" + salaire  + " heritant de " + super.toString();
	}

	
	
	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, Integer salaire) {
		super(nom,prenom);//on repasse nom et prenom au constructeur de Personne(nom, prenom)
		this.salaire = salaire;
	}
	
	
	
}
