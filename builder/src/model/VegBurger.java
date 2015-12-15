package model;

public class VegBurger extends Burger{

	@Override
	public float price() {
		return 4.5f;
	}

	@Override
	public String name() {
		return "Vegeterian Burger";
	}

}
