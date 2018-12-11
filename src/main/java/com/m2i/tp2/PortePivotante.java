package com.m2i.tp2;

public class PortePivotante extends Porte {
	
	private String axe_pivotement ="axe_pivotement";
	private int angle_rotation = 0; //en degré  (0 degré = fermé , 90 degrés = ouvert)
	
	public void fairePivoter(int angleRotation) {
		this.angle_rotation = angleRotation;
		System.out.println("apres pivotement , angle rotation =" + this.angle_rotation);
		if(this.angle_rotation==0) 
			System.out.println("porte pivotante fermée");
		else if(this.angle_rotation>=85) 
			   System.out.println("porte pivotante ouverte");
	}

	
	@Override
	public void ouvrir() {
		fairePivoter(90);
	}

	@Override
	public void fermer() {
		fairePivoter(0);
	}


	public String getAxe_pivotement() {
		return axe_pivotement;
	}


	public void setAxe_pivotement(String axe_pivotement) {
		this.axe_pivotement = axe_pivotement;
	}


	public int getAngle_rotation() {
		return angle_rotation;
	}


	public void setAngle_rotation(int angle_rotation) {
		this.angle_rotation = angle_rotation;
	}
	
	

}
