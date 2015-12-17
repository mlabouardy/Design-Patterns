package app;


import model.Rectangle;
import model.RedRectangle;
import model.Shape;
import model.ShapeDecorator;

public class Main {

	public static void main(String[] args) {
		Shape rectangle=new Rectangle();
		ShapeDecorator decorator=new RedRectangle(rectangle);
		decorator.draw();
	}

}
