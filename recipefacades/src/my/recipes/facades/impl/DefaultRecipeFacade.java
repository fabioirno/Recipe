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

import my.recipes.facades.RecipeData;
import my.recipes.facades.RecipeFacade;
import my.recipes.model.RecipeModel;
import my.recipes.service.RecipesService;


public class DefaultRecipeFacade implements RecipeFacade
{

	private RecipesService recipeService;
	private Converter<RecipeModel, RecipeData> recipeModelToDataConverter;

	@Override
	public List<RecipeData> getAllRecipes()
	{
		final List<RecipeModel> recipes = getRecipeService().getAllRecipes();

		return getRecipeModelToDataConverter().convertAll(recipes);

	}

	/**
	 * @return the recipeService
	 */
	public RecipesService getRecipeService()
	{
		return recipeService;
	}

	/**
	 * @param recipeService
	 *           the recipeService to set
	 */
	public void setRecipeService(final RecipesService recipeService)
	{
		this.recipeService = recipeService;
	}

	/**
	 * @return the recipeModelToDataConverter
	 */
	public Converter<RecipeModel, RecipeData> getRecipeModelToDataConverter()
	{
		return recipeModelToDataConverter;
	}

	/**
	 * @param recipeModelToDataConverter
	 *           the recipeModelToDataConverter to set
	 */
	public void setRecipeModelToDataConverter(final Converter<RecipeModel, RecipeData> recipeModelToDataConverter)
	{
		this.recipeModelToDataConverter = recipeModelToDataConverter;
	}



}
