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
package my.recipes.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import my.recipes.facades.data.FoodData;
import my.recipes.facades.data.IngredientData;
import my.recipes.model.FoodModel;
import my.recipes.model.IngredientModel;


public class DefaultIngredientPopulator implements Populator<IngredientModel, IngredientData>
{
	private Converter<FoodModel, FoodData> foodModelToDataConverter;

	@Override
	public void populate(final IngredientModel source, final IngredientData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setQuantity(source.getQuantity());
		target.setFood(getFoodModelToDataConverter().convert(source.getFood()));

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
