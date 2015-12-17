package model;

public class PlayState implements MediaPlayerState{

	@Override
	public void press(AudioPlayer context) {
		context.setState(new PauseState());
		System.out.println("Pause!");
	}

}
