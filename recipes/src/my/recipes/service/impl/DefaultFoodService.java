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
package my.recipes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.recipes.daos.FoodDao;
import my.recipes.model.FoodModel;
import my.recipes.service.FoodService;

/**
 *
 */
public class DefaultFoodService implements FoodService
{

	private FoodDao foodDao;


	@Override
	public List<FoodModel> getAllFoods()
	{
		return foodDao.findFoods();
	}

	@Override
	public List<FoodModel> getFoodsForKcal(final Double Kcal)
	{

		return foodDao.findFoodsByKcal(Kcal);
	}

	@Override
	public FoodModel getFoodForName(final String name)
	{

		return foodDao.findFoodByName(name);
	}

	@Required
	public void setFoodDao(final FoodDao foodDao)
	{
		this.foodDao = foodDao;
	}






}
