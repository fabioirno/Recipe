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

import my.recipes.model.ChefModel;


/**
 *
 */
public interface ChefService
{
	public List<ChefModel> getAllChefs();

	public List<ChefModel> getChefsForRating(Integer rating);

	public ChefModel getChefForName(String name);

	public List<ChefModel> getChefsOrderForRating();


}
