package model;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Draw "+getClass().getSimpleName());
	}

}
