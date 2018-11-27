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

import my.recipes.daos.IngredientDao;
import my.recipes.model.IngredientModel;


/**
 *
 */

public class DefaultIngredientDao implements IngredientDao
{

	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<IngredientModel> findIngredients()
	{
		// Build a query for the flexible search.
		final String queryString = " SELECT {p:" + IngredientModel.PK + "} " + "FROM {" + IngredientModel._TYPECODE + " AS p}";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		return flexibleSearchService.<IngredientModel> search(query).getResult();

	} //end

	@Override
	public List<IngredientModel> findIngredientsByCode(final String code)
	{
		//Build a query for the flexible search.
		final String queryString = "SELECT {p:" + IngredientModel.PK + "}" + "FROM {" + IngredientModel._TYPECODE + " AS p} "
				+ "WHERE" + "{p:" + IngredientModel.CODE + "} = ?code";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<IngredientModel> search(query).getResult();

	}// end

	//	@Override
	//	public List<IngredientModel> findIngredientsByQuantity(final Double quantity)
	//	{
	//		// YTODO Auto-generated method stub
	//		return null;
	//	}


	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}


}
