package model;

public abstract class CoinAbstract implements Coin{
	private int color;
	private int value;
	
	public CoinAbstract(int color, int value) {
		this.color=color;
		this.value=value;
	}
	
	@Override
	public int getValue() {
		return value;
	}

	@Override
	public int getColor() {
		return color;
	}
	
	
	public Coin clone(){
		Coin coin=null;
		try {
			coin=(Coin)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return coin;
	}

}
