package model;

public class Coke extends Drink{

	@Override
	public float price() {
		return 1.5f;
	}

	@Override
	public String name() {
		return "Coke";
	}

}
