package model;

import java.util.HashMap;

public class ShapeFactory {

	private static HashMap<String, Circle> circles=new HashMap();
	
	public static Circle getCircle(String color){
		Circle circle=circles.get(color);
		if(circle==null){
			circle=new Circle(color);
			circles.put(color, circle);
		}
		return circle;
	}
}
