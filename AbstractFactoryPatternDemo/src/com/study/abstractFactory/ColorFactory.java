/**
 * 
 */
package com.study.abstractFactory;

import com.study.color.Blue;
import com.study.color.Color;
import com.study.color.Green;
import com.study.color.Red;
import com.study.shape.Shape;

/**
 * @author Administrator
 *
 */
public class ColorFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see com.study.abstractFactory.AbstractFactory#getShape(java.lang.String)
	 * @param shape
	 * @return
	 */
	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.study.abstractFactory.AbstractFactory#getColor(java.lang.String)
	 * @param color
	 * @return
	 */
	@Override
	public Color getColor(String color) {
		if(color==null){
			return null;
		}
		if(color.equalsIgnoreCase("red")){
			return new Red();
		}else if(color.equalsIgnoreCase("blue")){
			return new Blue();
		}else if(color.equalsIgnoreCase("green")){
			return new Green();
		}
		
		return null;
	}

}
