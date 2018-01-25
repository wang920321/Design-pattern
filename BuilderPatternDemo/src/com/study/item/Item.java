/**
 * 
 */
package com.study.item;

import com.study.packing.Packing;

/**
 * @author Administrator
 *
 */
public interface Item {
    public String name();
    public float price();
    public Packing packing();
}
