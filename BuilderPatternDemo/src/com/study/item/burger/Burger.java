/**
 * 
 */
package com.study.item.burger;

import com.study.item.Item;
import com.study.packing.Packing;
import com.study.packing.Wrapper;

/**
 * @author Administrator
 *
 */
public abstract class Burger implements Item {
	
	@Override
	public abstract float price();


	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

}
