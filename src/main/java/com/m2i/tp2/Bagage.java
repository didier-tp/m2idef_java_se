package com.m2i.tp2;

public class Bagage implements Pesable{
	
	private Double volume=1.0;//en litre //avec get/set
	private Double poidsVide=0.5;//en kg //avec get/set
	private Double poidsContenu = 0.0; //en kg //avec get/set
	

	public Double getPoids() {
		return poidsVide + poidsContenu;
	}


	public Double getVolume() {
		return volume;
	}


	public void setVolume(Double volume) {
		this.volume = volume;
	}


	public Double getPoidsVide() {
		return poidsVide;
	}


	public void setPoidsVide(Double poidsVide) {
		this.poidsVide = poidsVide;
	}


	public Double getPoidsContenu() {
		return poidsContenu;
	}


	public void setPoidsContenu(Double poidsContenu) {
		this.poidsContenu = poidsContenu;
	}
	
	
}
