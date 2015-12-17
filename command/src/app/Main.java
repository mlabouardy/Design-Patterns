package app;

import model.Command;
import model.RemoteControl;
import model.Volume;
import model.VolumeDownCommand;
import model.VolumeUpCommand;

public class Main {

	public static void main(String[] args) {
		Volume volume=new Volume();
		Command up=new VolumeUpCommand(volume);
		Command down=new VolumeDownCommand(volume);
		RemoteControl remote=new RemoteControl(up);
		remote.execute();
		remote.execute();
		remote.execute();
		remote.execute();
		remote=new RemoteControl(down);
		remote.execute();
		remote.execute();
		remote.execute();
		remote.execute();
		remote.execute();
	}

}
