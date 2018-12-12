package com.m2i.tp6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe de simulation en mémoire sans base de données
 */
public class DaoProduitSimu implements DaoProduit {
	private Long numeroMax = null; //pour simuler auto_increment
	private Map<Long,Produit> mapProduits = new HashMap<Long,Produit>();
	
	public DaoProduitSimu() {
		mapProduits.put(1L, new Produit(1L,"cahier",2.5));
		mapProduits.put(2L, new Produit(2L,"stylo",1.5));
		mapProduits.put(3L, new Produit(3L,"trousse",3.5));
		mapProduits.put(4L, new Produit(4L,"classeur",7.5));
		numeroMax=4L;
	}
	//avant appel le numero du produit est null (inconnu)
	//apres appel , ce numero sera connu (auto incrémenté)
	public void ajouterProduit(Produit p) {
		p.setNumero(++numeroMax);//simuler auto_increment
		mapProduits.put(p.getNumero(), p);
	}

	public List<Produit> rechercherProduits() {
		return new ArrayList<Produit>( mapProduits.values() );
	}
}
