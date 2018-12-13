package com.m2i.tp6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DaoProduitCsvFile implements DaoProduit {

	@Override
	public List<Produit> rechercherProduits() {
		List<Produit> listeProduits = new ArrayList<Produit>();
		String path="C:\\Users\\Administrateur\\workspace\\projetJavaMaven\\src\\main\\resources\\produits.csv";
		try {
			FileInputStream is1 = new FileInputStream(path);
			InputStreamReader is2 = new InputStreamReader(is1);
			BufferedReader is3 = new BufferedReader(is2);
			is3.readLine();//on ignore la première ligne d'entete
			String ligneLue = null;
			do {
				ligneLue=is3.readLine();
				if(ligneLue!=null) {
				     String[] tabParties = ligneLue.split(";");
				     Produit produit = new Produit();
				     produit.setNumero(Long.parseLong(tabParties[0]));
					 produit.setLabel(tabParties[1]);
					 produit.setPrix(Double.parseDouble(tabParties[2]));
					 listeProduits.add(produit);
				}
			}while(ligneLue!=null);
			is3.close();is2.close();is1.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listeProduits;
	}

	@Override
	public void ajouterProduit(Produit p) {
		// à coder la semaine des 4 jeudis

	}

}
