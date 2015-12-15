package factory;

import model.Coin;
import model.Table;

public abstract class FactoryPrototype implements AbstractFactory{
	
	private Table table;
	private Coin coin;
	
	public FactoryPrototype(Table table, Coin coin){
		this.coin=coin;
		this.table=table;
	}

	@Override
	public Table createTable() {
		return table.clone();
	}

	@Override
	public Coin createCoin() {
		return coin.clone();
	}

}
