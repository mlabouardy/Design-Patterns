package app;

import model.User;

public class Main {

	public static void main(String[] args) {
		User user=new User("Mohamed");
		User user2=new User("Youssef");
		user.sendMsg("Hello");
		user2.sendMsg("Whats up");
	}

}
