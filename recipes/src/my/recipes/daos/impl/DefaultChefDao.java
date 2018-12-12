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
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.recipes.daos.ChefDao;
import my.recipes.model.ChefModel;

/**
 *
 */

public class DefaultChefDao implements ChefDao
{


	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<ChefModel> findChefs()
	{
		// Build a query for the flexible search.
		final String queryString = "SELECT {p:" + ChefModel.PK + "} " + "FROM {" + ChefModel._TYPECODE + " AS p }";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		final SearchResult<ChefModel> result = getFlexibleSearchService().search(query);

		final List<ChefModel> chefs = result.getResult();

		return chefs;

	} //end

	@Override
	public List<ChefModel> findChefsByRating(final Integer rating)
	{
		//Build a query for the flexible search.
		final String queryString = "SELECT {p:" + ChefModel.PK + "}" + "FROM {" + ChefModel._TYPECODE + " AS p} " + "WHERE" + "{p:"
				+ ChefModel.RATING + "} = ?rating";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		query.addQueryParameter("rating", rating);

		final SearchResult<ChefModel> result = getFlexibleSearchService().search(query);

		final List<ChefModel> chefs = result.getResult();

		return chefs;

	}// end

	@Override
	public ChefModel findChefByName(final String name)
	{
		//Build a query for the flexible search.
		final String queryString = "SELECT {p:" + ChefModel.PK + "}" + "FROM {" + ChefModel._TYPECODE + " AS p} " + "WHERE" + "{p:"
				+ ChefModel.NAME + "} = ?name";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		query.addQueryParameter("name", name);

		final SearchResult<ChefModel> result = getFlexibleSearchService().search(query);

		final List<ChefModel> chefs = result.getResult();

		return chefs.get(0);

	} // end

	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}



}
