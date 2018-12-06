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

import my.recipes.facades.ChefFacade;
import my.recipes.facades.data.ChefData;


@Controller
public class ChefController
{

	private ChefFacade chefFacade;

	@RequestMapping(value = "/chefs")
	public String showChefs(final Model model) {

		final List<ChefData> chefs = chefFacade.getAllChefs();

		model.addAttribute("chefs",chefs);

		return "ChefsListing";
	}

	@RequestMapping(value = "/chefs/{chefName}")
	public String showChefsDetails(@PathVariable
	final String chefName, final Model model) throws UnsupportedEncodingException
	{

		final ChefData chef = chefFacade.getChefForName(chefName);

		model.addAttribute("chef", chef);

		return "ChefDetail";
	}

	@RequestMapping(value = "/chefs/{chefRating}")
	public String showChefsRating(@PathVariable
	final Integer rating, final Model model) throws UnsupportedEncodingException
	{

		final List<ChefData> chef = chefFacade.getChefsForRating(rating);

		model.addAttribute("chef", chef);

		return "ChefRating";
	}

	@Autowired
	public void setChefFacade(final ChefFacade chefFacade)
	{
		this.chefFacade = chefFacade;
	}



}
