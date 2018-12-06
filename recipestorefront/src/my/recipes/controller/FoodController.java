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

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import my.recipes.facades.FoodFacade;
import my.recipes.facades.data.FoodData;


@Controller
public class FoodController
{
	private FoodFacade foodFacade;

	@RequestMapping(value = "/foods")
	public String showFoods(final Model model)
	{

		final List<FoodData> foods = foodFacade.getAllFoods();

		model.addAttribute("foods", foods);

		return "FoodsListing";
	}

	@RequestMapping(value = "/foods/{foodName}")
	public String showFoods(@PathVariable
	final Model model, final String foodName)
	{

		final FoodData foods = foodFacade.getFoodForName(foodName);

		model.addAttribute("foods", foods);

		return "FoodDetail";
	}

	@RequestMapping(value = "/foods/{foodKcal}")
	public String showFoods(@PathVariable
	final Model model, final Double Kcal)
	{

		final List<FoodData> foods = foodFacade.getFoodsForKcal(Kcal);

		model.addAttribute("foods", foods);

		return "FoodKcal";
	}



}
