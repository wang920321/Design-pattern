/**
 * 
 */
package com.study;

/**
 * @author Administrator
 *
 */
public class SingletonObject {
    private static SingletonObject singletonObject=new SingletonObject();
    private SingletonObject(){
    	
    }
    public static SingletonObject getInstance(){
    	return singletonObject;
    }
    public void showMessage(){
    	System.out.println("hello world!");
    }
}
