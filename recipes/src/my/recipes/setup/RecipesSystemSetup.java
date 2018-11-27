/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.recipes.setup;

import static my.recipes.constants.RecipesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.recipes.constants.RecipesConstants;
import my.recipes.service.RecipesService;


@SystemSetup(extension = RecipesConstants.EXTENSIONNAME)
public class RecipesSystemSetup
{
	private final RecipesService recipesService;

	public RecipesSystemSetup(final RecipesService recipesService)
	{
		this.recipesService = recipesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		recipesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return RecipesSystemSetup.class.getResourceAsStream("/recipes/sap-hybris-platform.png");
	}
}
