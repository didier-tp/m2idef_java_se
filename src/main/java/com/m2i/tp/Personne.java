package com.m2i.tp;

public class Personne {
	private String nom;
	private String prenom;
	private Long numero;
	private Integer taille = 0;
	private Double poids;
	
    //constructeur avec zéro paramètre (constructeur par defaut)
	//à programmer quasi systématiquement pour etre sûr qu'il existe
	public Personne() {
		super();
		poids=0.0;
	}

	//autres constructeurs (facultatifs)
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", numero=" + numero + ", taille=" + taille + ", poids="
				+ poids + "]";
	}
	
	public void afficher() {
		System.out.println("Personne de nom="+nom + "...");
	}


	public void grandir(int progression) {
		//this.taille = this.taille + progression;
		this.taille += progression;
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

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Integer getTaille() {
		return taille;
	}

	public void setTaille(Integer taille) {
		if(taille <0 || taille >300) {
			System.out.println("taille invalide non prise en compte");
			return; //fin (ne pas executer les lignes de code qui suivent dans cette fonction)
		}
		this.taille = taille;
	}

	public Double getPoids() {
		return poids;
	}

	public void setPoids(Double poids) {
		this.poids = poids;
	}
	
	
	
}
