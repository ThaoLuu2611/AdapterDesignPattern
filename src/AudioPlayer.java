
public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("mp3"))
			System.out.println("Play mp3 file name: "+fileName);
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else
			System.out.println("Invalid media type");
	}

}
