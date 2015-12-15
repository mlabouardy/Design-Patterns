package model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<Item> items;
	
	public Menu(){
		items=new ArrayList<>();
	}
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public void showItems(){
		for(Item item:items)
			System.out.println(item.name());
	}
	
	public float price(){
		float sum=0;
		for(Item item:items)
			sum+=item.price();
		return sum;
	}

}
