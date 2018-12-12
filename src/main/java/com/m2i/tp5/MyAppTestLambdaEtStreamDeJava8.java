package com.m2i.tp5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyAppTestLambdaEtStreamDeJava8 {

	public static void main(String[] args) {
		List<Info> listeInfos = new ArrayList<Info>();
		listeInfos.add(new Info("info1","texte de info1"));
		listeInfos.add(new Info("info2","texte de info2"));
		
		
		List<Info> listeInfoMaj
		         = listeInfos.stream()
		          .map((info)-> { info.setTitre(info.getTitre().toUpperCase()); 
		                          info.setTexte(info.getTexte().toUpperCase());
		                          return info;} )
		          .collect(Collectors.toList());
		
		listeInfoMaj.stream()
		     .forEach(System.out::println);
	}

}
