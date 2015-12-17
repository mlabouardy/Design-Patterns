package model;

public class PauseState implements MediaPlayerState{

	@Override
	public void press(AudioPlayer context) {
		context.setState(new PlayState());
		System.out.println("Playing ...");
	}

}
