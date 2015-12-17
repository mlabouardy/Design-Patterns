package model;

import java.util.ArrayList;
import java.util.List;

import visitor.ItemVisitor;

public class Computer implements Item{
	private String name;
	private List<Item> items;

	public Computer(String name){
		this.name=name;
		this.items=new ArrayList();
	}
	
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public void removeItem(Item item){
		items.remove(item);
	}
	
	public List<Item> children(){
		return items;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public float getPrice() {
		float price=0;
		for(Item item:items)
			price+=item.getPrice();
		return price;
	}
	
	public void accept(ItemVisitor visitor){
		visitor.visit(this);
	}

}
