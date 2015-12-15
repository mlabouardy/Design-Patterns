package model;

public interface Coin extends Cloneable{

	int getValue();
	int getColor();
	Coin clone();
	
}
