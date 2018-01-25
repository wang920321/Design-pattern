/**
 * 
 */
package com.study;

/**
 * @author Administrator
 *
 */
public class SingletonObjectLazy {
    private static SingletonObjectLazy singleton;
    private SingletonObjectLazy(){
    }
    public static synchronized SingletonObjectLazy getInstance(){
    	if(singleton==null){
    		return new SingletonObjectLazy();
    	}
    	return singleton;
    }
}
