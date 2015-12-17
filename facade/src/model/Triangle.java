package model;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Draw "+getClass().getSimpleName());
	}

}
