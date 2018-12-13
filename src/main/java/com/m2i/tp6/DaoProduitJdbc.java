package com.m2i.tp6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class DaoProduitJdbc implements DaoProduit {
	
	public Connection seConnecter() {
		Connection cn=null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");//pour V8 de MySql
			//String dbUrl="jdbc:mysql://localhost/baseprod";
			String dbUrl="jdbc:mysql://localhost:3306/baseprod?serverTimezone=UTC";
			cn=DriverManager.getConnection(dbUrl, "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
	}
	@Override
	public List<Produit> rechercherProduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterProduit(Produit p) {
		// TODO Auto-generated method stub

	}

}
