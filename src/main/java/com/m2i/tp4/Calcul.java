package com.m2i.tp4;

public class Calcul {

	public double racineCarree(double x) {
		if(x<0)
			throw new RuntimeException("x negatif invalide pour racine carree");
		return Math.sqrt(x);
	}

}
