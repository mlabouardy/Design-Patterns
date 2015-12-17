package model;

public abstract class Game {
	
	abstract void init();
	abstract void start();
	abstract void end();
	
	public void play(){
		init();
		start();
		end();
	}

}
