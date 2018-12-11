package com.m2i.tp2;

public class MyPorteApp {

	public static void main(String[] args) {
		//testPorte();
		testPesable();
	}
	
	public static void testPesable() {
		Bagage valiseEnCarton = new Bagage();
		valiseEnCarton.setPoidsContenu(1.5);
		PortePivotante pp = new PortePivotante();
		pp.setPoidsComplets(45.0);
		
		double poidsTotal = 0;
		Pesable chosePesable = null;
		chosePesable =valiseEnCarton;
		poidsTotal += chosePesable.getPoids();//polymorphisme
		chosePesable =pp;
		poidsTotal += chosePesable.getPoids();//polymorphisme
		System.out.println("le poids total (porte + bagage) vaut " + poidsTotal);
		
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
