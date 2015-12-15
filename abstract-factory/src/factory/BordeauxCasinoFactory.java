package factory;

import model.Coin;
import model.HugeTable;
import model.RedCoin;
import model.Table;

public class BordeauxCasinoFactory implements AbstractFactory{

	@Override
	public Table createTable() {
		return new HugeTable();
	}

	@Override
	public Coin createCoin() {
		return new RedCoin();
	}

}
