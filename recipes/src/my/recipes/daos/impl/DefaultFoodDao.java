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
package my.recipes.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.recipes.daos.FoodDao;
import my.recipes.model.FoodModel;

/**
 *
 */

public class DefaultFoodDao implements FoodDao
{

	/**
	 * We use hybris' FlexibleSearchService for running queries against the database
	 *
	 *
	 */

	private FlexibleSearchService flexibleSearchService;

	/**
	 * Finds all Foods by performing a FlexibleSearch using the {@link FlexibleSearchService}. We find all Foods
	 */
	@Override
	public List<FoodModel> findFoods()
	{
	// Build a query for the flexible search.
			final String queryString = "SELECT {p:" + FoodModel.PK + "} " + "FROM {" + FoodModel._TYPECODE + " AS p }";

			final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

			return flexibleSearchService.<FoodModel> search(query).getResult();

		} //end

	@Override
	public List<FoodModel> findFoodsByKcal(final Double Kcal)
	{
		//Build a query for the flexible search
		final String queryString = "SELECT {p:" + FoodModel.PK + "}" + "FROM {" + FoodModel._TYPECODE + " AS p} " + "WHERE" + "{p:"
				+ FoodModel.KCAL + "} = ?Kcal";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("Kcal", Kcal);

		return flexibleSearchService.<FoodModel> search(query).getResult();

	}// end


	@Override
	public FoodModel findFoodByName(final String name)
	{
		//Build a query for the flexible search.
		final String queryString = "SELECT {p:" + FoodModel.PK + "}" + "FROM {" + FoodModel._TYPECODE + " AS p} " + "WHERE" + "{p:"
				+ FoodModel.NAME + "} = ?name";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("name", name);

		return (FoodModel) flexibleSearchService.search(query).getResult();

	} // end


	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}


}
