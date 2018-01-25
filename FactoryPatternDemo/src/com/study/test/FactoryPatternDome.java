/**
 * 
 */
package com.study.test;

import com.study.factory.ShapeFactory;
import com.study.shape.Shape;

/**
 * @author Administrator
 * 工厂模式
 */
public class FactoryPatternDome {

	/**
	 * @Title: FactoryPatternDome.java 
	 * @Package com.study.test 
	 * @Description: TODO(用一句话描述该文件做什么) 
	 * @author kpwang   
	 * @date 2018年1月25日 下午2:47:34
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory factory=new ShapeFactory();
        Shape shape1 = factory.getShape("rectangle");
        shape1.draw();
        Shape shape2=factory.getShape("circle");
        shape2.draw();
        Shape shape3=factory.getShape("square");
        shape3.draw();
	}

}
