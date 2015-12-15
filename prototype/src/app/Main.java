package app;

import factory.CasinoPrototype;
import factory.FactoryPrototype;
import model.Coin;
import model.Table;

public class Main {

	public static void main(String[] args) {
		FactoryPrototype prototype=new CasinoPrototype();
		Coin coin=prototype.createCoin();
		Table table=prototype.createTable();
		System.out.println(coin.getColor()+" "+coin.getValue());
	}

}
