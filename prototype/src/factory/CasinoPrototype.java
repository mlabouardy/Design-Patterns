package factory;

import model.Coin;
import model.HugeTable;
import model.Table;
import model.YellowCoin;

public class CasinoPrototype extends FactoryPrototype{

	public CasinoPrototype() {
		super(new HugeTable(), new YellowCoin());
	}

}
