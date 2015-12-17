package model;

public class VolumeUpCommand implements Command{

	private Volume volume;
	
	public VolumeUpCommand(Volume volume){
		this.volume=volume;
	}
	
	@Override
	public void execute() {
		volume.up();
	}

}
