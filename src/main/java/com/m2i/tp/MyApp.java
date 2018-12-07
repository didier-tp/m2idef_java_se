package com.m2i.tp;

public class MyApp {
	public static void main(String[] args) {
		//m1(); //appel de m1();
		m2(); //appel de m2();
	}
	
	public static void m2() {
		String ch1="abc";
		String ch2="ab"; 
		String ch3=ch2+"c";
		//tester si ch1 à la même valeur que ch3:
		if(ch1.equals(ch3)) 
			System.out.println("ch1 et ch3 ont les memes valeurs");
		else 
			System.out.println("ch1 et ch3 ont des valeurs différentes");
		
		Personne p2 = new Personne("Therieur" , "alain");
		System.out.println("p2=" + p2);
		p2.setTaille(170);
		System.out.println("la taille de p2 est " + p2.getTaille());
		p2.setTaille(-50);
		System.out.println("la taille de p2 est " + p2.getTaille());
	
		
		Personne p1 =null;		p1 = new Personne();
		System.out.println("p1=" + p1.toString());
		//changer le nom , prenom , taille de p1 
		p1.setNom("Bon"); p1.setPrenom("Jean") ; p1.setTaille(160); p1.setPoids(50.5); 
		p1.setNumero(1L); // 1 est valeur de type int , 1L est une valeur de type long 
		//faire grandir p1 de 5 (sous entendu en cm)
		p1.grandir(5);
		//réafficher via println() et toString() les nouvelles valeurs de p1
		//System.out.println("p1=" + p1.toString());
		System.out.println("p1=" + p1);//équivalent à la ligne précédente.
		p1.afficher();
	}
	
	public static void m1() {
		String chaine1 = "Hello world ";
		char c = 'a';
		System.out.println(chaine1);
		String chVal1="123";
		String chVal2="100";
		int val1 ;
		int val2; 
		//convertir chVal1 en val1 , ...2
		val1 = Integer.parseInt(chVal1);
		val2 = Integer.parseInt(chVal2);
		//calculer val1 + val2
		int res = val1+val2;
		//afficher le resultat
		System.out.println("res="+res);
	}

}
