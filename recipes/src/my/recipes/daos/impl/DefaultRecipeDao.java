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

import my.recipes.daos.RecipeDao;
import my.recipes.model.RecipeModel;


/**
 *
 */

public class DefaultRecipeDao implements RecipeDao
{

	/**
	 * We use hybris' FlexibleSearchService for running queries against the database
	 *
	 *
	 */
	private FlexibleSearchService flexibleSearchService;


	/**
	 * Finds all Recipes by performing a FlexibleSearch using the {@link FlexibleSearchService}. We find all Recipes
	 */
	@Override
	public List<RecipeModel> findRecipes()
	{
		// Build a query for the flexible search.
		final String queryString = "SELECT {p:" + RecipeModel.PK + "} " + "FROM {" + RecipeModel._TYPECODE + " AS p }";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		return flexibleSearchService.<RecipeModel> search(query).getResult();

	} //end

	/**
	 * Find Recipe by Code
	 */
	@Override
	public List<RecipeModel> findRecipesByCode(final String code)
	{
		//Build a query for the flexible search.
		final String queryString = "SELECT {p:" + RecipeModel.PK + "}" + "FROM {" + RecipeModel._TYPECODE + " AS p} " + "WHERE"
				+ "{p:" + RecipeModel.CODE + "} = ?code";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<RecipeModel> search(query).getResult();

	} // end

	@Override
	public RecipeModel findRecipeByName(final String name)
	{
		//Build a query for the flexible search.
				final String queryString = "SELECT {p:" + RecipeModel.PK + "}" + "FROM {" + RecipeModel._TYPECODE + " AS p} " + "WHERE"
						+ "{p:" + RecipeModel.NAME + "} = ?name";

				final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
				query.addQueryParameter("name", name);

		return (RecipeModel) flexibleSearchService.search(query).getResult();

	} // end


	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}





}
