package app;

import model.AdvancedMediaPlayer;
import model.MediaAdapter;
import model.MediaPlayer;
import model.VLCPlayer;

public class Main {

	public static void main(String[] args) {
		AdvancedMediaPlayer advanced=new VLCPlayer();
		MediaPlayer player=new MediaAdapter(advanced);
		player.play();
	}

}
