package model;

import visitor.ItemVisitor;

public abstract class AbstractItem implements Item{
	private String name;
	private float price;
	
	public AbstractItem(String name, float price){
		this.name=name;
		this.price=price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public float getPrice() {
		return price;
	}
	
	public void accept(ItemVisitor visitor){
		visitor.visit(this);
	}

}
