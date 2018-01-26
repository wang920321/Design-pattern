/**
 * 
 */
package com.study.advanceMediaPlayer;

/**
 * @author Administrator
 *
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/* (non-Javadoc)
	 * @see com.study.advanceMediaPlayer.AdvancedMediaPlayer#playVlc(java.lang.String)
	 * @param fileName
	 */
	@Override
	public void playVlc(String fileName) {
		// 什么都不做

	}

	/* (non-Javadoc)
	 * @see com.study.advanceMediaPlayer.AdvancedMediaPlayer#playMp4(java.lang.String)
	 * @param fileName
	 */
	@Override
	public void playMp4(String fileName) {
	    System.out.println("playing mp4 file . Name:"+ fileName);

	}

}
