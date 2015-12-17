package app;

import model.CPU;
import model.Computer;
import model.Item;
import model.Keyboard;
import model.Monitor;
import visitor.DisplayItems;
import visitor.ItemVisitor;

public class Main {

	public static void main(String[] args) {
		Computer computer=new Computer("Sony VAIO");
		Item keyboard=new Keyboard("DELL", 15.2f);
		Item monitor=new Monitor("Samsung", 120.0f);
		Item cpu=new CPU("Intel i7",250f);
		computer.addItem(keyboard);
		computer.addItem(monitor);
		computer.addItem(cpu);
		System.out.println(computer.getPrice()+" euros");
		ItemVisitor visitor=new DisplayItems();
		computer.accept(visitor);
	}

}
