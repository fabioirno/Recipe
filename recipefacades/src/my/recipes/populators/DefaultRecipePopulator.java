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

import my.recipes.facades.data.RecipeData;
import my.recipes.model.RecipeModel;


/**
 *
 */
public class DefaultRecipePopulator implements Populator<RecipeModel, RecipeData>
{

	@Override
	public void populate(final RecipeModel source, final RecipeData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setDifficulty(source.getDifficulty().toString());
		target.setName(source.getName());
		target.setRating(source.getRating());
		target.setServings(source.getServings());
		target.setTime(source.getTime());
		target.setTotalCals(source.getTotalCals());
	}

}
