package model;

public class Channel {
	private float frequency;
	private String name;
	
	public Channel(float frequency, String name) {
		this.frequency = frequency;
		this.name = name;
	}
	
	public float getFrequency() {
		return frequency;
	}
	
	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return frequency + "," + name;
	}
	
	

}
