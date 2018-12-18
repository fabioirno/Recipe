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

import my.recipes.facades.ChefFacade;
import my.recipes.facades.data.ChefData;


@Controller
@RequestMapping(value = "/chefs")
public class ChefController
{

	@Resource(name = "chefFacade")
	private ChefFacade chefFacade;

	@RequestMapping(value = "/chefsListing", method = RequestMethod.GET)
	public String showChefs(final Model model)
	{

		final List<ChefData> chefs = chefFacade.getAllChefs();

		model.addAttribute("chefs",chefs);

		return "ChefsListing";
	}

	@RequestMapping(value = "/chefForName/{chefName}", method = RequestMethod.GET)
	public String showChefsDetails(@PathVariable
	final String chefName, final Model model) throws UnsupportedEncodingException
	{

		final ChefData chef = chefFacade.getChefForName(chefName);

		model.addAttribute("chef", chef);

		return "ChefDetail";
	}

	@RequestMapping(value = "/chefsOrderByRating", method = RequestMethod.GET)
	public String showChefsOrderByRating(final Model model)
	{

		final List<ChefData> chefs = chefFacade.getChefsOrderForRating();

		model.addAttribute("chefs", chefs);

		return "ChefsOrderByRating";

	}

	/*
	 * This is the same controller of showChefsOrderByRating but we order the chefs with a lampda expression
	 * 
	 * @RequestMapping(value = "/chefsTestRating", method = RequestMethod.GET) public String showChefsTestRating(final
	 * Model model) {
	 * 
	 * final List<ChefData> chefs = chefFacade.getChefsOrderForRating();
	 * 
	 * chefs.stream() .sorted((o1, o2) -> o1.getRating().toString().compareTo(o2.getRating().toString()))
	 * .collect(Collectors.toList());
	 * 
	 * model.addAttribute("chefs", chefs);
	 * 
	 * return "ChefsOrderByRating";
	 * 
	 * }
	 * 
	 */



}
