package com.m2i.tp.aviation;

import com.m2i.tp.Personne;

public class AvionA380 {
	private Integer numAvion; //null par défaut sur attribut
	public static final int NB_PERS_MAX=853;
	private Integer nbPers=0;
	//nb: tabPersonnes est ici un tableau de références sur des Personnes
	//sur les NB_PERS_MAX cases utilisables , seules nbPers=0 sont utilisées au debut
	private Personne[] tabPersonnes = new Personne[NB_PERS_MAX];
	
	public void ajouterPersonne(Personne p) {
		//p référence un objet de type Personne ou bien un cas particulier (ex: Employe)
		if(nbPers<NB_PERS_MAX)
		   tabPersonnes[nbPers++]=p;
		else System.out.println("plus de place disponible");
	}
	
	public void afficherAvionAvecPersonnes() {
		System.out.println("avionA380 numero " + numAvion);
		System.out.println("\t comportant " + nbPers +  " personnes .");
		for(int i=0;i<nbPers;i++) {
			Personne personneOuEmployeOuAutre = tabPersonnes[i];
			System.out.println("\t " + personneOuEmployeOuAutre.toString());//polymorphisme
			//sans polymorphisme , il aurait fallu ecrire:
			// if(personneOuEmployeOuAutre instanceof Employe)
			    // afficherEmploye
			//else if , else if ...
		}
	}
	
	

	public AvionA380() {
		super();
	}

	public Integer getNumAvion() {
		return numAvion;
	}

	public void setNumAvion(Integer numAvion) {
		this.numAvion = numAvion;
	}

	public Integer getNbPers() {
		return nbPers;
	}

	public void setNbPers(Integer nbPers) {
		this.nbPers = nbPers;
	}

	public Personne[] getTabPersonnes() {
		return tabPersonnes;
	}

	public void setTabPersonnes(Personne[] tabPersonnes) {
		this.tabPersonnes = tabPersonnes;
	}
	
	

}
