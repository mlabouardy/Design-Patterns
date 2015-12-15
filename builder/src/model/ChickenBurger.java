package model;

public class ChickenBurger extends Burger{

	@Override
	public float price() {
		return 7.0f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}

}
