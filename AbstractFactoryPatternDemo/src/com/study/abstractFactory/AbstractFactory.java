/**
 * 
 */
package com.study.abstractFactory;

import com.study.color.Color;
import com.study.shape.Shape;

/**
 * @author Administrator
 *
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
