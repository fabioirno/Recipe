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
package my.recipes.service;

import java.util.List;

import my.recipes.model.IngredientModel;


public interface IngredientService
{
	public List<IngredientModel> getAllIngredient();

	public List<IngredientModel> getIngredientsForCode(String code);

}
