package model;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC() {
		System.out.println("playing VLC format");
	}

	@Override
	public void playMP4() {
		System.out.println("playing MP4 format");
	}

}
