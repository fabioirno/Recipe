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

import my.recipes.facades.RecipeData;
import my.recipes.facades.RecipeFacade;


@Controller
public class RecipesController
{

	private RecipeFacade recipeFacade;

	@RequestMapping(value = "/recipes")
	public String showRecipes(final Model model)
	{

		final List<RecipeData> recipes = recipeFacade.getAllRecipes();

		model.addAttribute("recipes", recipes);

		return "RecipesListing";
	}

	@RequestMapping(value = "/recipes/{recipeName}")
	public String showRecipesDetails(@PathVariable final
	String recipeName, final Model model) throws UnsupportedEncodingException
	{

		final RecipeData recipe = recipeFacade.getRecipeForName(recipeName);

		model.addAttribute("recipe", recipe);

		return "RecipeDetail";
	}

	@RequestMapping(value = "/recipes/{recipeCode}")
	public String showRecipeForCode(@PathVariable
	final String recipeCode, final Model model) throws UnsupportedEncodingException
	{

		final RecipeData recipe = recipeFacade.getRecipesForCode(recipeCode); // rettificare il Dao di recipe deve essere un RecipeData e non un List<RecipeData>

		model.addAttribute("recipe", recipe);

		return "RecipeDetail";
	}



	@Autowired
	public void setRecipeFacade(final RecipeFacade recipeFacade)
	{
		this.recipeFacade = recipeFacade;
	}




}
