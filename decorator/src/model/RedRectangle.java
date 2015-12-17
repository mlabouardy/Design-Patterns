package model;

public class RedRectangle extends ShapeDecorator{

	public RedRectangle(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("Red rectangle");
	}

}
