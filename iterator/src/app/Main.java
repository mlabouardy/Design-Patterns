package app;

import model.Channel;
import model.Iterator;
import model.TVSatelite;

public class Main {

	public static void main(String[] args) {
		TVSatelite tv=new TVSatelite();
		tv.newChannel(new Channel(1552.2f, "Mbc 2"));
		tv.newChannel(new Channel(1287.2f, "TV 5"));
		tv.newChannel(new Channel(1482.7f, "Cartoon Network"));
		tv.newChannel(new Channel(2523.1f, "France 24"));
		tv.newChannel(new Channel(1923f, "2M"));
		Iterator iterator=tv.iterator();
		while(iterator.hasNext()){
			iterator.next();
			System.out.println(iterator.current());
		}
	}

}
