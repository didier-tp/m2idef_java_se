package com.m2i.tp5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyAppTp5 {

	public static void main(String[] args) {
		testCollection();
		testCollection2();
		testCollection3();
	}
	
	public static void testCollection3() {
		Map<String,Double> mapSaisonTemperature = new HashMap<String,Double>();
		mapSaisonTemperature.put("hiver", 8.0);
		mapSaisonTemperature.put("printemps", 14.0);
		mapSaisonTemperature.put("ete", 19.0);
		mapSaisonTemperature.put("automne", 12.0);
		
		Double tempMoyenneEte = mapSaisonTemperature.get("ete");
		System.out.println("tempMoyenneEte="+tempMoyenneEte);
		
		Set<String> ensembleClefs = mapSaisonTemperature.keySet(); 
		for(String clef : ensembleClefs) {
			System.out.println("clef existante="+clef);
		}
		
	}
	
	public static void afficherCollection(Collection<? extends Object> c) {
		//etant donné que List hérite de Collection 
		//et que Set hérite également de Collection
		//on peut appeler afficherCollection(liste); 
		//ou bien afficherCollection(ensembleInfos);
		
		// ? extends Object signifie type element quelconque héritant de Object
		for(Object obj : c) {
			System.out.println(obj.toString());
		}
	}
	
	public static void testCollection2() {
		List<Info> liste = new ArrayList<Info>(); 
		 //new List<Info> impossible car List est une interface et pas concrete
		Info infoX = new Info("infoX","texteX");
		Info infoY = new Info("infoY","texteY");
		liste.add(infoX); liste.add(infoY);
		afficherCollection(liste);
		liste.remove(infoX); System.out.println("---");
		afficherCollection(liste);
	}
	
	public static void testCollection() {
		//ArrayList listeInfos = new ArrayList(); //liste d'objets quelconques
		ArrayList<Info> listeInfos = new ArrayList<Info>(); //liste de Info
		listeInfos.add(new Info("info1","texte info1"));
		listeInfos.add(new Info("info2","texte info2"));
		Info info3 = new Info();
		info3.setTitre("info3"); info3.setTexte("texte info3");
		listeInfos.add(info3);
		//parcours via les indices (sur List ou tableau)
		for(int i=0;i<listeInfos.size();i++) {
			System.out.println(listeInfos.get(i));
		}
		
		HashSet<Info> ensembleInfos = new HashSet<Info>();
		ensembleInfos.add(new Info("infoA","texte infoA"));
		ensembleInfos.add(new Info("infoB","texte infoB"));
		//impossible de parcourir un "Set/ensemble" via une boucle for sur
		//les indices car .get(i) n'existe pas sur les "Set"
		
		//Parcours avec itérateurs possible dès les années 1999,2000,2001
		Iterator<Info> it = ensembleInfos.iterator();
		while(it.hasNext()) {
			//Info info = (Info) it.next(); //si Iterator sans <Info>
			Info info =  it.next();
			System.out.println(info);
		}
		
		//parcours avec nouvelle boucle for au sens forEach
		//possible à partir du jdk 1.5 et 2005:
        // for(TypeElement varElement : CollectionQuiSeraParcourue)
		for(Info info: ensembleInfos) {
			System.out.println(info);
		}

	}

}
