/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2018 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.recipes.facades;

import java.util.List;


public interface FoodFadace
{
	List<FoodData> getAllFoods();

	List<FoodData> getFoodsfForKcal(Double Kcal);

	FoodData getFoodForName(String name);
	
}
