package model;

public class User {
	private String name;
	
	public User(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void sendMsg(String msg){
		Chat.send(this, msg);
	}
}
