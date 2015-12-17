package model;

import visitor.ItemVisitor;

public interface Item {

	public String getName();
	public float getPrice();
	public void accept(ItemVisitor visitor);
	
}
