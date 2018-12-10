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

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.recipes.facades.RecipeFacade;
import my.recipes.facades.data.RecipeData;


@Controller
@RequestMapping(value = "/recipes")
public class RecipesController
{

	@Resource(name = "recipeFacade")
	private RecipeFacade recipeFacade;

	@RequestMapping(value = "/recipesListing", method = RequestMethod.GET)
	public String showRecipes(final Model model)
	{

		final List<RecipeData> recipes = recipeFacade.getAllRecipes();

		model.addAttribute("recipes", recipes);

		return "RecipesListing";
	}


	@RequestMapping(value = "/recipeForName/{recipeName}", method = RequestMethod.GET)
	public String showRecipesDetails(@PathVariable final String recipeName, final Model model) throws UnsupportedEncodingException
	{

		final RecipeData recipe = recipeFacade.getRecipeForName(recipeName);

		model.addAttribute("recipe", recipe);

		return "RecipeDetail";
	}

	@RequestMapping(value = "/recipeForCode/{recipeCode}", method = RequestMethod.GET)
	public String showRecipeForCode(@PathVariable
	final String recipeCode, final Model model) throws UnsupportedEncodingException
	{

		final RecipeData recipe = recipeFacade.getRecipesForCode(recipeCode);

		model.addAttribute("recipe", recipe);

		return "RecipeDetailCode";
	}

}
