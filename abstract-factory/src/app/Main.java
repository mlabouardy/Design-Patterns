package app;

import factory.AbstractFactory;
import factory.BordeauxCasinoFactory;
import model.Coin;
import model.Table;

public class Main {

	public static void main(String[] args) {
		AbstractFactory factory=new BordeauxCasinoFactory();
		Coin redCoin=factory.createCoin();
		Table hugeTable=factory.createTable();
		System.out.println(redCoin.getColor()+" "+redCoin.getValue());
	}

}
