package com.m2i.tp6;

import java.util.List;
/**
 * DAO=Data Access Object
 */
public interface DaoProduit {
	public List<Produit> rechercherProduits();
	public void ajouterProduit(Produit p);
	//...
	
}
