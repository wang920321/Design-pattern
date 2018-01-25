/**
 * 
 */
package com.study.abstractFactory;

import com.study.color.Color;
import com.study.shape.Circle;
import com.study.shape.Rectangle;
import com.study.shape.Shape;
import com.study.shape.Square;

/**
 * @author Administrator
 *
 */
public class ShapeFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see com.study.abstractFactory.AbstractFactory#getShape(java.lang.String)
	 * @param shape
	 * @return
	 */
	@Override
	public Shape getShape(String shape) {
		if(shape==null){
			return null;
		}
		if(shape.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("square")){
			return new Square();
		}else if(shape.equalsIgnoreCase("circle")){
			return new Circle();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.study.abstractFactory.AbstractFactory#getColor(java.lang.String)
	 * @param color
	 * @return
	 */
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
