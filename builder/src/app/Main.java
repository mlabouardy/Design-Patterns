package app;

import builder.Builder;
import builder.MenuBuilder;
import model.Menu;
import model.Pepsi;

public class Main {

	public static void main(String[] args) {
		Builder builder=new MenuBuilder();
		Menu menu1=builder.createChickenMenu();
		Menu menu2=builder.createVegMenu();
		menu1.showItems();
	}

}
