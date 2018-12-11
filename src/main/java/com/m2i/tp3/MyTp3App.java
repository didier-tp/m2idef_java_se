package com.m2i.tp3;

import java.util.Scanner;

public class MyTp3App {

	public static void main(String[] args) {
		/*
		int a1=6;
		int b1=3;
		Calcul calcul = new Calcul();
		int res1=calcul.division(a1, b1);
		System.out.println("res1="+res1);
		*/
		int a1=0;
        int b2=0;
        int res2=0;
        Calcul calcul = new Calcul();
        Scanner reader = new Scanner(System.in);
     
				try {
					System.out.print("a:");
					a1=reader.nextInt(); //on récupère dans la variable a1 le prochain nombre entier
					                     //qui sera saisi au clavier
					System.out.print("b:");
					b2=reader.nextInt(); //on récupère dans la variable b1 le prochain nombre entier
					                     //qui sera saisi au clavier
					res2=calcul.division(a1, b2);
					System.out.println("res2="+res2);
				} catch (MyException e) {
					//e.printStackTrace();
					System.err.println(e.getMessage());
				}
		
        System.out.println("suite ...");
        reader.close();
		
	}

}
