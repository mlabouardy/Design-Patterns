package model;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer{
	
	private String name;
	
	public User(String name){
		this.name=name;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Group){
			Group group=(Group)o;
			System.out.println(name+" there's a new post available !");
		}
	}

}
