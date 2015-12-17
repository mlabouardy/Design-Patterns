package app;

import bridge.Color;
import bridge.RedColor;
import bridge.YellowColor;
import model.Rectangle;
import model.Shape;

public class Main {
	public static void main(String[] args) {
		Color red=new RedColor();
		Color yellow=new YellowColor();
		Shape rectangle=new Rectangle(red);
		rectangle.applyColor();
	}
}
