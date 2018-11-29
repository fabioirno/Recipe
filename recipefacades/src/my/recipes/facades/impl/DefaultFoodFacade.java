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
package my.recipes.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.recipes.facades.FoodData;
import my.recipes.facades.FoodFadace;
import my.recipes.model.FoodModel;
import my.recipes.service.FoodService;


public class DefaultFoodFacade implements FoodFadace
{
	private FoodService foodService;
	private Converter<FoodModel, FoodData> foodModelToDataConverter;



	@Override
	public List<FoodData> getAllFoods()
	{
		final List<FoodModel> foods = getFoodService().getAllFoods();
		return getFoodModelToDataConverter().convertAll(foods);
	}

	@Override
	public List<FoodData> getFoodsfForKcal(final Double Kcal)
	{
		final List<FoodModel> foods = getFoodService().getFoodsForKcal(Kcal);
		return getFoodModelToDataConverter().convertAll(foods);
	}

	@Override
	public FoodData getFoodForName(final String name)
	{
		final FoodModel food = getFoodService().getFoodForName(name);
		return getFoodModelToDataConverter().convert(food);
	}

	/**
	 * @return the foodService
	 */
	public FoodService getFoodService()
	{
		return foodService;
	}

	@Required
	public void setFoodService(final FoodService foodService)
	{
		this.foodService = foodService;
	}

	/**
	 * @return the foodModelToDataConverter
	 */
	public Converter<FoodModel, FoodData> getFoodModelToDataConverter()
	{
		return foodModelToDataConverter;
	}

	@Required
	public void setFoodModelToDataConverter(final Converter<FoodModel, FoodData> foodModelToDataConverter)
	{
		this.foodModelToDataConverter = foodModelToDataConverter;
	}




}
