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
package my.recipes.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.recipes.facades.ChefFacade;
import my.recipes.facades.data.ChefData;
import my.recipes.model.ChefModel;
import my.recipes.service.ChefService;



public class DefaultChefFacade implements ChefFacade
{

	private ChefService chefService;
	private Converter<ChefModel, ChefData> chefModelToDataConverter;


	@Override
	public List<ChefData> getAllChefs()
	{
		final List<ChefModel> chefs = getChefService().getAllChefs();
		return getChefModelToDataConverter().convertAll(chefs);
	}

	@Override
	public List<ChefData> getChefsForRating(final Integer rating)
	{
		final List<ChefModel> chefs = getChefService().getChefsForRating(rating);
		return getChefModelToDataConverter().convertAll(chefs);
	}

	@Override
	public ChefData getChefForName(final String name)
	{
		final ChefModel chef = getChefService().getChefForName(name);
		return getChefModelToDataConverter().convert(chef);
	}

	@Override
	public List<ChefData> getChefsOrderForRating()
	{
		final List<ChefModel> chefs = getChefService().getChefsOrderForRating();
		return getChefModelToDataConverter().convertAll(chefs);
	}



	/**
	 * @return the chefService
	 */
	public ChefService getChefService()
	{
		return chefService;
	}

	@Required
	public void setChefService(final ChefService chefService)
	{
		this.chefService = chefService;
	}

	/**
	 * @return the chefModelToDataConverter
	 */
	public Converter<ChefModel, ChefData> getChefModelToDataConverter()
	{
		return chefModelToDataConverter;
	}

	@Required
	public void setChefModelToDataConverter(final Converter<ChefModel, ChefData> chefModelToDataConverter)
	{
		this.chefModelToDataConverter = chefModelToDataConverter;
	}



}
