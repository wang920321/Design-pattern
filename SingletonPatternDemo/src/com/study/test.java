/**
 * 
 */
package com.study;

/**
 * @author Administrator
 *
 */
public class test {

	/**
	 * @Title: test.java 
	 * @Package com.study 
	 * @Description: TODO(用一句话描述该文件做什么) 
	 * @author kpwang   
	 * @date 2018年1月25日 下午4:16:29
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonObject singletonObject = SingletonObject.getInstance();
		singletonObject.showMessage();
		//因为单例模式只有一个私有的无参构造函数，所以只能通过里面的public方法来获得实例，然而这个实例是它自己创建的
		/*SingletonObject singletonObject1=new SingletonObject();*/
		SingletonObjectLazy singleton=SingletonObjectLazy.getInstance();
	     
	}

}
