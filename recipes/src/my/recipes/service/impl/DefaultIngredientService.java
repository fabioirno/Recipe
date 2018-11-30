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

import my.recipes.daos.IngredientDao;
import my.recipes.model.IngredientModel;
import my.recipes.service.IngredientService;


public class DefaultIngredientService implements IngredientService
{
	private IngredientDao ingredientDao;

	@Override
	public List<IngredientModel> getAllIngredient()
	{
		return ingredientDao.findIngredients();
	}

	@Override
	public IngredientModel getIngredientsForCode(final String code)
	{
		return ingredientDao.findIngredientsByCode(code);
	}

	/**
	 * @return the ingredientDao
	 */
	public IngredientDao getIngredientDao()
	{
		return ingredientDao;
	}

	@Required
	public void setIngredientDao(final IngredientDao ingredientDao)
	{
		this.ingredientDao = ingredientDao;
	}




}
