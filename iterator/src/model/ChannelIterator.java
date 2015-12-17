package model;

import java.util.List;

public class ChannelIterator implements Iterator{
	private List<Channel> channels;
	private int current=0;
	
	public ChannelIterator(List<Channel> channels) {
		this.channels=channels;
	}
	
	@Override
	public boolean hasNext() {
		if(channels.size()>current){
			return true;
		}
		return false;
	}

	@Override
	public Channel next() {
		if(hasNext())
			return channels.get(current++);
		return null;
	}

}
