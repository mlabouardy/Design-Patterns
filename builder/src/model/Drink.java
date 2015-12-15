package model;

public abstract class Drink implements Item{

	@Override
	public Packing pack() {
		return new Bottle();
	}
	
}
