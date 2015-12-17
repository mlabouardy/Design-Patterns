package model;

import java.util.List;

public class ChannelIterator implements Iterator{
	private List<Channel> channels;
	private int current=-1;
	
	public ChannelIterator(List<Channel> channels) {
		this.channels=channels;
	}
	
	@Override
	public boolean hasNext() {
		if(channels.size()-1>current){
			return true;
		}
		return false;
	}

	@Override
	public void next() {
		current++;
	}

	@Override
	public Channel current() {
		if(current<channels.size())
			return channels.get(current);
		return null;
	}

}
