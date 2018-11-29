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

import my.recipes.facades.RecipeData;
import my.recipes.facades.RecipeFacade;
import my.recipes.model.RecipeModel;
import my.recipes.service.RecipesService;


public class DefaultRecipeFacade implements RecipeFacade
{

	private RecipesService recipesService;
	private Converter<RecipeModel, RecipeData> recipeModelToDataConverter;

	@Override
	public List<RecipeData> getAllRecipes()
	{
		final List<RecipeModel> recipes = getRecipesService().getAllRecipes();

		return getRecipeModelToDataConverter().convertAll(recipes);

	}

	@Override
	public List<RecipeData> getRecipesForCode(final String code)
	{
		final List<RecipeModel> recipes = getRecipesService().getRecipesForCode(code);
		return getRecipeModelToDataConverter().convertAll(recipes);
	}


	@Override
	public RecipeData getRecipeForName(final String name)
	{
		final RecipeModel recipe = getRecipesService().getRecipesForName(name);
		return getRecipeModelToDataConverter().convert(recipe);
	}


	/**
	 * @return the recipeService
	 */
	public RecipesService getRecipesService()
	{
		return recipesService;
	}

	@Required
	public void setRecipesService(final RecipesService recipesService)
	{
		this.recipesService = recipesService;
	}

	/**
	 * @return the recipeModelToDataConverter
	 */
	public Converter<RecipeModel, RecipeData> getRecipeModelToDataConverter()
	{
		return recipeModelToDataConverter;
	}

	@Required
	public void setRecipeModelToDataConverter(final Converter<RecipeModel, RecipeData> recipeModelToDataConverter)
	{
		this.recipeModelToDataConverter = recipeModelToDataConverter;
	}



}
