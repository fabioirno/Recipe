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



}
