package factory;

import model.Coin;
import model.SmallTable;
import model.Table;
import model.YellowCoin;

public class ParisCasinoFactory implements AbstractFactory{

	@Override
	public Table createTable() {
		return new SmallTable();
	}

	@Override
	public Coin createCoin() {
		return new YellowCoin();
	}

}
