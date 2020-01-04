package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {
	/* Apenas classe abstratas podem implementar uma interface, sem cumprir o
	 contrato, deixando tal contrato para as filhas.*/

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
