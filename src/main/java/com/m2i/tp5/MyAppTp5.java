package com.m2i.tp5;

import java.util.ArrayList;

public class MyAppTp5 {

	public static void main(String[] args) {
		testCollection();

	}
	
	public static void testCollection() {
		ArrayList listeInfos = new ArrayList();
		listeInfos.add(new Info("info1","texte info1"));
		listeInfos.add(new Info("info2","texte info2"));
		for(int i=0;i<listeInfos.size();i++) {
			System.out.println(listeInfos.get(i));
		}
	}

}
