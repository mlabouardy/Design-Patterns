package model;

import bridge.Color;

public class Rectangle extends AbstractShape{
	
	public Rectangle(Color color){
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Rectangle");
		color.applyColor();
	}

}
