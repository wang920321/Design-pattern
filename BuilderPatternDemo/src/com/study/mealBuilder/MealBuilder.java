/**
 * 
 */
package com.study.mealBuilder;

import com.study.item.burger.ChickenBurger;
import com.study.item.burger.VegBurger;
import com.study.item.coldDrink.Coke;
import com.study.item.coldDrink.Pepsi;
import com.study.meal.Meal;

/**
 * @author Administrator
 *
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
    	Meal meal=new Meal();
    	meal.addItem(new VegBurger());
    	meal.addItem(new Coke());
    	return meal;
    }
    public Meal prepareNovegMeal(){
    	Meal meal=new Meal();
    	meal.addItem(new ChickenBurger());
    	meal.addItem(new Pepsi());
    	return meal;
    }
}
