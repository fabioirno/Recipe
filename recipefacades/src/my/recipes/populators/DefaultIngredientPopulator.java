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

import my.recipes.facades.IngredientData;
import my.recipes.model.IngredientModel;


public class DefaultIngredientPopulator implements Populator<IngredientModel, IngredientData>
{

	@Override
	public void populate(final IngredientModel source, final IngredientData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setQuantity(source.getQuantity());

	}


}
