package app;

import model.Image;
import model.ProxyImage;

public class Main {

	public static void main(String[] args) {
		Image img=new ProxyImage("icon.png");
		img.display();
		img.display();
	}

}
