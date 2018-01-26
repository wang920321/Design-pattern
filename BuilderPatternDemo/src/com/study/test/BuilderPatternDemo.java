/**
 * 
 */
package com.study.test;

import com.study.meal.Meal;
import com.study.mealBuilder.MealBuilder;

/**
 * @author Administrator
 *
 */
public class BuilderPatternDemo {

	/**
	 * @Title: BuilderPatternDemo.java 
	 * @Package com.study.test 
	 * @Description: TODO(用一句话描述该文件做什么) 
	 * @author kpwang   
	 * @date 2018年1月26日 上午9:53:15
	 * @param args
	 */
	public static void main(String[] args) {
		MealBuilder mealBuilder=new MealBuilder();
		Meal vegMeal=mealBuilder.prepareNovegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());
        Meal nonVegMeal=mealBuilder.prepareNovegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
	}

}
