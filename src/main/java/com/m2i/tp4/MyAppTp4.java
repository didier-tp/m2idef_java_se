package com.m2i.tp4;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class MyAppTp4 {
	//objet technique de log4j servant à générer des lignes de log
	private static Logger logger = Logger.getLogger(MyAppTp4.class);

	public static void main(String[] args) {
		String chX=null;
        double x=0;
        chX = JOptionPane.showInputDialog("x:");//saisie en mode graphique
        x = Double.parseDouble(chX);
        System.out.println("x=" + x);
        try {
			Calcul calcul = new Calcul();
			double res = calcul.racineCarree(x);
			JOptionPane.showMessageDialog(null, res ); //affichage dans boite de dialogue
		} catch (Exception e) {
			logger.error(e.getMessage());//générer une nouvelle ligne de log
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage() );
		}

	}

}
