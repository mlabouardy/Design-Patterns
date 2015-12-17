package model;

public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	private Shape triangle;
	
	public ShapeMaker(){
		this.circle=new Circle();
		this.rectangle=new Rectangle();
		this.triangle=new Triangle();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
	public void drawTriangle(){
		triangle.draw();
	}

}
