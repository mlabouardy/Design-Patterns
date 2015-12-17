package model;

public class VolumeDownCommand implements Command {
	private Volume volume;
	
	public VolumeDownCommand(Volume volume){
		this.volume=volume;
	}
	
	@Override
	public void execute() {
		volume.down();
	}
}
