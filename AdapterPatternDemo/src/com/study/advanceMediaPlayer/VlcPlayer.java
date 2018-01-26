/**
 * 
 */
package com.study.advanceMediaPlayer;

/**
 * @author Administrator
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	/* (non-Javadoc)
	 * @see com.study.advanceMediaPlayer.AdvancedMediaPlayer#playVlc(java.lang.String)
	 * @param fileName
	 */
	@Override
	public void playVlc(String fileName) {
		System.out.println("playing vlc file.Name" + fileName);

	}

	/* (non-Javadoc)
	 * @see com.study.advanceMediaPlayer.AdvancedMediaPlayer#playMp4(java.lang.String)
	 * @param fileName
	 */
	@Override
	public void playMp4(String fileName) {
		// 什么也不做

	}

}
