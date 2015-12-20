package model;

import java.util.Date;

public class Chat {

	public static void send(User user, String msg){
		System.out.println(new Date().toString()+" - "+user.getName()+":"+msg);
	}
}
