package com.m2i.tp3;

public class Calcul {
	
	public int division(int a, int b) throws MyException {
		if(b==0)
			//throw new RuntimeException("division par zero interdite ");
			//throw new IllegalArgumentException("division par zero interdite ");
			throw new MyException("division par zero interdite ");
		/*else sous endendu sachant que throw est comme un return */
		return (a/b);
	}

}
