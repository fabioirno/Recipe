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

import my.recipes.facades.IngredientData;
import my.recipes.facades.IngredientFacade;
import my.recipes.model.IngredientModel;
import my.recipes.service.IngredientService;

/**
 *
 */
public class DefaultIngredientFacade implements IngredientFacade
{

	private IngredientService ingredientService;
	private Converter<IngredientModel, IngredientData> ingredientModelToDataConverter;

	@Override
	public List<IngredientData> getAllIngredients()
	{
		final List<IngredientModel> ingredients = getIngredientService().getAllIngredient();

		return getIngredientModelToDataConverter().convertAll(ingredients);
	}


	@Override
	public IngredientData getIngredientForCode(final String code)
	{
		final IngredientModel ingredient = getIngredientService().getIngredientsForCode(code);

		return getIngredientModelToDataConverter().convert(ingredient);
	}


	/**
	 * @return the ingredientService
	 */
	public IngredientService getIngredientService()
	{
		return ingredientService;
	}

	@Required
	public void setIngredientService(final IngredientService ingredientService)
	{
		this.ingredientService = ingredientService;
	}

	/**
	 * @return the ingredientModelToDataConverter
	 */
	public Converter<IngredientModel, IngredientData> getIngredientModelToDataConverter()
	{
		return ingredientModelToDataConverter;
	}

	@Required
	public void setIngredientModelToDataConverter(final Converter<IngredientModel, IngredientData> ingredientModelToDataConverter)
	{
		this.ingredientModelToDataConverter = ingredientModelToDataConverter;
	}

}
