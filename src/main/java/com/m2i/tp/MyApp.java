package com.m2i.tp;

public class MyApp {
	
	
	
	
	
	public static void main(String[] args) {
		//m1(); //appel de m1();
		//m2(); //appel de m2();
		//m3();
		m4();
		m5();
		MyApp myApp = new MyApp();
		myApp.m6();
	}
	
	public void m6() {
		//pythagore
		double largeur=4;
		double longeur=6;
		double hypothenuse = Math.sqrt( Math.pow(largeur, 2) + Math.pow(longeur, 2));
		System.out.println("hypothenuse=" + hypothenuse);
		System.out.println("PI="+Math.PI);
	}
	
	public static void m4() {
		String ch1="fichier1.json";
		int posSeparateur;
		//récupérer dans "posSeparateur" la position du premier "." trouvé dans ch1;
		posSeparateur = ch1.indexOf(".");
		String p1,p2;
		//récupérer dans p1 et p2 les sous parties de ch1 avant et apres le "."
		p1=ch1.substring(0, posSeparateur);
		p2=ch1.substring(posSeparateur+1,ch1.length());
		
		System.out.println("P1="+p1.toUpperCase());//Afficher p1 en majuscule
		System.out.println("p2="+p2);
		String ch2="bordeaux";
		String ch2Bis; // construire ch2Bis en fonction de ch2
		               // en transformant le premier caractère en majuscule
		ch2Bis=ch2.substring(0,1).toUpperCase()+ch2.substring(1,ch2.length());
		MyUtil.afficher("ch2Bis="+ch2Bis);
	}
	
	public static void m5() {
		//construire un tableau tab de 10 "int"
		int[] tab = new int[10];
		//via une boucle , placer i*i comme valeur dans chaque tab[i]
		for(int i=0;i<tab.length;i++)
			tab[i]=i*i;
		//afficher les éléments du tableau tab dans l'ordre inverse
		for(int i=tab.length - 1; i>=0;i--)
			System.out.print(tab[i] + " ");
		
		String tabChaines[] = { "abc" , "def" , "Ijk" , "suite" , "fin" };
		//trouver le premier indice d'une chaine commencant par une majuscule
		String regExpMajusculeAuDebut="[A-Z].*";
		int i=0;
		int indice=-1;//valeur par défaut (par convention) si rien de trouver
		while(i<tabChaines.length) {
			if(tabChaines[i].matches(regExpMajusculeAuDebut)) {
				indice=i; break;
			}
			i++;
		}
		if(indice!=-1)
			System.out.println("\n indice="+indice + " " + tabChaines[indice]);
	}
	
	public static void m3() {
		Adresse adr1 = new Adresse("12 rue elle " , "75012" , "Paris");
		adr1.setCodePostal("75013");
		System.out.println("adr1="+adr1);
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
