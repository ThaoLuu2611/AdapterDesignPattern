
public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String mediaType){
		if(mediaType.equalsIgnoreCase("vlc"))
			advancedMediaPlayer = new VlcPlayer();
		else if(mediaType.equalsIgnoreCase("mp4"))
			advancedMediaPlayer = new Mp4Player();
	}

	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("vlc"))
			advancedMediaPlayer.playVlc(fileName);
		else if(audioType.equalsIgnoreCase("mp4"))
			advancedMediaPlayer.playMp4(fileName);
		
	}

}
