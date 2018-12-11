package com.m2i.tp2;

public class MyPorteApp {

	public static void main(String[] args) {
		testPorte();
	}
	
	public static void testPorte() {
		Porte porte = null;
		//porte = new Porte(); //impossible ici car Porte est "abstract"
		PortePivotante portePivotante1 = new PortePivotante();
		PorteCoulissante porteCoulissante1 = new PorteCoulissante();
		porte = portePivotante1;
		porte.ouvrir();
		porte.fermer();
		System.out.println("-------------");
		porte = porteCoulissante1;
		porte.ouvrir();
		porte.fermer();
	}

}
