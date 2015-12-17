package model;

public class AudioPlayer implements MediaPlayer{
	private MediaPlayerState state;
	
	public AudioPlayer() {
		this.state=new PlayState();
	}
	
	@Override
	public void play() {
		state.press(this);
	}

	@Override
	public void setState(MediaPlayerState state) {
		this.state=state;
	}

}
