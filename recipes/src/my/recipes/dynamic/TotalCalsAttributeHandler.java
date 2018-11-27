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
package my.recipes.dynamic;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.List;

import my.recipes.model.IngredientModel;
import my.recipes.model.RecipeModel;


/**
 *
 */
public class TotalCalsAttributeHandler implements DynamicAttributeHandler<Double, RecipeModel>
{

	private Double cal = new Double(0);

	private Double totalCals = new Double(0);

	private Double quantity = new Double(0);


	@Override
	public Double get(final RecipeModel var1)
	{

		final List<IngredientModel> ingredients = (List<IngredientModel>) var1.getIngredients();

		ingredients.forEach(ingredient ->

		{
			cal = ingredient.getFood().getKcal();

			quantity = ingredient.getQuantity();

			totalCals = totalCals + (cal * quantity);

		});

		 return totalCals;

	}

	@Override
	public void set(final RecipeModel var1, final Double var2)
	{
		// YTODO Auto-generated method stub

	}

	// get and set
	/**
	 * @return the cal
	 */
	public Double getCal()
	{
		return cal;
	}

	/**
	 * @param cal
	 *           the cal to set
	 */
	public void setCal(final Double cal)
	{
		this.cal = cal;
	}

	/**
	 * @return the totalCals
	 */
	public Double getTotalCals()
	{
		return totalCals;
	}

	/**
	 * @param totalCals
	 *           the totalCals to set
	 */
	public void setTotalCals(final Double totalCals)
	{
		this.totalCals = totalCals;
	}

	/**
	 * @return the quantity
	 */
	public Double getQuantity()
	{
		return quantity;
	}

	/**
	 * @param quantity
	 *           the quantity to set
	 */
	public void setQuantity(final Double quantity)
	{
		this.quantity = quantity;
	}



}
