package model;


public class MediaAdapter implements MediaPlayer{

	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer){
		this.advancedMediaPlayer=advancedMediaPlayer;
	}
	
	@Override
	public void play() {
		advancedMediaPlayer.playMP4();
	}

}
