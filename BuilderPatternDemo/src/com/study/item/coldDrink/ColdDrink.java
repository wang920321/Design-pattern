/**
 * 
 */
package com.study.item.coldDrink;

import com.study.item.Item;
import com.study.packing.Bottle;
import com.study.packing.Packing;

/**
 * @author Administrator
 *
 */
public abstract class ColdDrink implements Item {
	@Override
	public abstract float price() ;
	
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

}
