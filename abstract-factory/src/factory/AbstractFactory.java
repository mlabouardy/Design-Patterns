package factory;

import model.Coin;
import model.Table;

public interface AbstractFactory {

	Table createTable();
	Coin createCoin();
	
}
