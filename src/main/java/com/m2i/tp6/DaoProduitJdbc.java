package com.m2i.tp6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
	
	public List<Produit> rechercherProduits() {
		List<Produit> listeProduits = new ArrayList<Produit>();
		Connection cn = seConnecter();
		ResultSet rs = null;
		try {  Statement st = cn.createStatement();
			  String reqSql = "SELECT * FROM produit";
			 rs = st.executeQuery(reqSql);
			while(rs.next()) {
				Produit produit = new Produit();
				produit.setNumero(rs.getLong("numero"));
				produit.setLabel(rs.getString("label"));
				produit.setPrix(rs.getDouble("prix"));
				listeProduits.add(produit);
			}
			rs.close();	st.close();//fermetures dans l'ordre inverse des ouvertures
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeCn(cn);
		}
		return listeProduits;
	}
	
	
	
	public void ajouterProduit(Produit p) {
		Connection cn = seConnecter();
		try {  
			  Statement st = cn.createStatement();
			  String reqSql = 
			    "INSERT INTO produit(numero,label,prix) VALUES(?,?,?)";
			  st.executeUpdate(reqSql);
			st.close();//fermetures dans l'ordre inverse des ouvertures
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeCn(cn);
		}
	}
	
	//fonction utilitaire/réutilisable de fermeture cachant le try/catch obligatoire
		public static void closeCn(Connection cn) {
			try {
				cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

}
