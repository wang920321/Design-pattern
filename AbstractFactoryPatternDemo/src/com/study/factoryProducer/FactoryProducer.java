/**
 * 
 */
package com.study.factoryProducer;

import com.study.abstractFactory.AbstractFactory;
import com.study.abstractFactory.ColorFactory;
import com.study.abstractFactory.ShapeFactory;

/**
 * @author Administrator
 *
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
    	if(choice.equalsIgnoreCase("shape")){
    		return new ShapeFactory();
    	}else if(choice.equalsIgnoreCase("color")){
    		return new ColorFactory();
    	}
		return null;
    }
}
