/**
 * 
 */
package com.study.test;

import com.study.mediaPlayer.AudioPlayer;

/**
 * @author Administrator
 * 适配器模式
 */
public class AdapterPatternDemo {

	/**
	 * @Title: AdapterPatternDemo.java 
	 * @Package com.study.test 
	 * @Description: TODO(用一句话描述该文件做什么) 
	 * @author kpwang   
	 * @date 2018年1月26日 上午10:53:49
	 * @param args
	 */
	public static void main(String[] args) {
		AudioPlayer audioPlayer=new AudioPlayer();
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");

	}

}
