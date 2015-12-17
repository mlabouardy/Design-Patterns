package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Group extends Observable{
	private String name;
	private List<User> users;
	private List<String> news;
	
	public Group(String name){
		this.name=name;
		this.users=new ArrayList();
		this.news=new ArrayList<>();
	}
	
	public void subscribe(User user){
		users.add(user);
		addObserver(user);
	}
	
	public void unsubscribe(User user){
		users.remove(user);
		deleteObserver(user);
	}
	
	public void newInfo(String info){
		news.add(info);
		setChanged();
		notifyObservers();
	}

}
