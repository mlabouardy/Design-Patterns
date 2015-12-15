package builder;

import model.ChickenBurger;
import model.Coke;
import model.Menu;
import model.Pepsi;
import model.VegBurger;

public class MenuBuilder implements Builder{

	@Override
	public Menu createVegMenu(){
		Menu menu=new Menu();
		menu.addItem(new VegBurger());
		menu.addItem(new Pepsi());
		return menu;
	}

	@Override
	public Menu createChickenMenu() {
		Menu menu=new Menu();
		menu.addItem(new ChickenBurger());
		menu.addItem(new Coke());
		return menu;
	}
}
