package app;

import model.Group;
import model.User;

public class Main {

	public static void main(String[] args) {
		User mohamed=new User("mohamed");
		User youssef=new User("Youssef");
		Group group=new Group("Master");
		group.subscribe(mohamed);
		group.subscribe(youssef);
		group.newInfo("Stage informations");
		group.unsubscribe(youssef);
		group.unsubscribe(mohamed);
		group.newInfo("CC 1");
		User mouad=new User("Mouad");
		group.subscribe(mouad);
		group.newInfo("CC 2");
	}

}
