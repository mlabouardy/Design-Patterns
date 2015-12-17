package model;

import bridge.Color;

public class Triangle extends AbstractShape{

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle ");
		color.applyColor();
	}

}
