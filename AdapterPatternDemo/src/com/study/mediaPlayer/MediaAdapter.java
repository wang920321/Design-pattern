/**
 * 
 */
package com.study.mediaPlayer;

import com.study.advanceMediaPlayer.AdvancedMediaPlayer;
import com.study.advanceMediaPlayer.Mp4Player;
import com.study.advanceMediaPlayer.VlcPlayer;

/**
 * @author Administrator
 *
 */
public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;
	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMusicPlayer=new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer=new Mp4Player();
		}
	}
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMusicPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer.playMp4(fileName);
		}

	}

}
