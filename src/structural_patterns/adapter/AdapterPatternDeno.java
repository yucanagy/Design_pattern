package structural_patterns.adapter;

public class AdapterPatternDeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "1.mp3");
		audioPlayer.play("mp4", "2.mp4");
		audioPlayer.play("vlc", "3.vlc");
		audioPlayer.play("avi", "4.avi");
	}

}
