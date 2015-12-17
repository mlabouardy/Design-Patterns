package model;

import java.util.ArrayList;
import java.util.List;

public class TVSatelite {
	private List<Channel> channels;
	
	public TVSatelite(){
		this.channels=new ArrayList<>();
	}
	
	public void newChannel(Channel channel){
		channels.add(channel);
	}
	
	public void removeChannel(Channel channel){
		channels.remove(channel);
	}
	
	public Iterator iterator(){
		return new ChannelIterator(channels);
	}

}
