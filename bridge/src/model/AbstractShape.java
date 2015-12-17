package model;

import bridge.Color;

public abstract class AbstractShape implements Shape{
	protected Color color;
	
	public AbstractShape(Color color){
		this.color=color;
	}
	

}
