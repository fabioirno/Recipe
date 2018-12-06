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
package my.recipes.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import my.recipes.facades.IngredientFacade;
import my.recipes.facades.data.IngredientData;


@Controller
public class IngredientController
{

	private IngredientFacade ingredientFacade;

	@RequestMapping(value = "/ingredients")
	public String showIngredients(final Model model)
	{

		final List<IngredientData> ingredients = ingredientFacade.getAllIngredients();

		model.addAttribute("ingredients", ingredients);

		return "IngredientsListing";
	}

	@RequestMapping(value = "/ingredients/{ingredientsCode}")
	public String showIngredients(@PathVariable
	final Model model, final String code) throws UnsupportedEncodingException
	{

		final IngredientData ingredients = ingredientFacade.getIngredientForCode(code);

		model.addAttribute("ingredients", ingredients);

		return "IngredientsCode";
	}



	@Autowired
	public void setIngredientFacade(final IngredientFacade ingredientFacade)
	{
		this.ingredientFacade = ingredientFacade;
	}



}
