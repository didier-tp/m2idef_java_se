package com.m2i.tp6;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyAppTp6 {

	public static void main(String[] args) {
		//testSimpleAuDebutEtCompliqueAlaFin();
		//testDaoSimu();
		testDaoJdbc();
	}
	private static void testDaoJdbc() {
		DaoProduitJdbc daoProduitJdbc = new DaoProduitJdbc();
		Connection cn =daoProduitJdbc.seConnecter();
		System.out.println("connexion etablie="+cn.toString());
	}

	private static void testDaoSimu() {
		DaoProduit daoProduitSimu = new DaoProduitSimu();
		daoProduitSimu.ajouterProduit(new Produit(null,"gomme",2.3));
		List<Produit> listProduits = daoProduitSimu.rechercherProduits();
		System.out.println(listProduits.toString());
	}

	private static void testSimpleAuDebutEtCompliqueAlaFin() {
	   List<Produit> listProduits = new ArrayList<Produit>();
	   listProduits.add(new Produit(1L,"cahier",2.5));
	   listProduits.add(new Produit(2L,"stylo",1.25));
	   listProduits.add(new Produit(3L,"classeur",3.30));
	   listProduits.add(new Produit(4L,"trousse",7.40));
	   System.out.println("listProduits initial="+listProduits);
	   //En tp , boucler sur les éléments de listProduits
	   //et changer le prix de chaque produit (remise de 5%)
	   //   changer le label (à transfomer en MAJUSCULES)
	   for(Produit prod : listProduits) {
		   prod.setPrix(prod.getPrix()*0.95);
		   prod.setLabel(prod.getLabel().toUpperCase());
	   }
	   //ré-afficher la liste , après modifications des éléments référencés
	   System.out.println("listProduits après modif="+listProduits);
	   
	   //Partie compliquée:
	   
	   Comparator<Produit> comparateurPoduitSelonOrdreAlphabetique
	      = new /* classe anonyme imbriquee qui implemente */ Comparator<Produit>() {

					@Override //méthode imposée par interface Comparator<T>
					public int compare(Produit p1, Produit p2) {
						return p1.getLabel().compareTo(p2.getLabel());
					}
	        };//fin de la classe anomyme imbriquée
	   Collections.sort(listProduits, comparateurPoduitSelonOrdreAlphabetique);
	   System.out.println("listProduits apres tri alphabetique="+listProduits);
	   
	   Comparator<Produit> comparateurProduitSelonPrix
	      = new /* classe anonyme imbriquee qui implemente */ Comparator<Produit>() {

					@Override //méthode imposée par interface Comparator<T>
					public int compare(Produit p1, Produit p2) {
						return p1.getPrix().compareTo(p2.getPrix());
					}
	        };//fin de la classe anomyme imbriquée
	   Collections.sort(listProduits, comparateurProduitSelonPrix);
	   System.out.println("listProduits apres tri selon prix croissant="+listProduits);
	}

	
	
	

}
