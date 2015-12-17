package model;

public class Volume {
	private final int MAX=5;
	private int volume;
	
	public void up(){
		if(volume<=MAX)
			volume++;
		System.out.println("current volume: "+volume);
	}
	
	public void down(){
		if(volume>0)
			volume--;
		System.out.println("current volume: "+volume);
	}
}
