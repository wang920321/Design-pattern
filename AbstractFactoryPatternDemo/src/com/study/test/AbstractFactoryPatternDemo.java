/**
 * 
 */
package com.study.test;

import com.study.abstractFactory.AbstractFactory;
import com.study.color.Color;
import com.study.factoryProducer.FactoryProducer;
import com.study.shape.Shape;

/**
 * 抽象工厂
 *
 */
public class AbstractFactoryPatternDemo {

	/**
	 * @Title: AbstractFactoryPatternDemo.java 
	 * @Package com.study.test 
	 * @Description: TODO(用一句话描述该文件做什么) 
	 * @author kpwang   
	 * @date 2018年1月25日 下午3:31:21
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("square");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("rectangle");
		shape3.draw();
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color1 = colorFactory.getColor("red");
		color1.fill();
		Color color2 = colorFactory.getColor("green");
		color2.fill();
		Color color3 = colorFactory.getColor("blue");
		color3.fill();
	}

}
