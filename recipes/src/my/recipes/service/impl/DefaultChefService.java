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

import my.recipes.daos.ChefDao;
import my.recipes.model.ChefModel;
import my.recipes.service.ChefService;



public class DefaultChefService implements ChefService
{
	private ChefDao chefDao;

	@Override
	public List<ChefModel> getAllChefs()
	{
		return chefDao.findChefs();
	}

	@Override
	public List<ChefModel> getChefsForRating(final Integer rating)
	{
		return chefDao.findChefsByRating(rating);
	}

	@Override
	public ChefModel getChefForName(final String name)
	{
		return chefDao.findChefByName(name);
	}

	@Override
	public List<ChefModel> getChefsOrderForRating()
	{
		return chefDao.orderChefsByRating();
	}


	@Required
	public void setChefDao(final ChefDao chefDao)
	{
		this.chefDao = chefDao;
	}




}
