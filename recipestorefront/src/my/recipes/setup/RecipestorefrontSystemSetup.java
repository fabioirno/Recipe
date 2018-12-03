/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package my.recipes.setup;

import static my.recipes.constants.RecipestorefrontConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.recipes.constants.RecipestorefrontConstants;
import my.recipes.service.RecipestorefrontService;


@SystemSetup(extension = RecipestorefrontConstants.EXTENSIONNAME)
public class RecipestorefrontSystemSetup
{
	private final RecipestorefrontService recipestorefrontService;

	public RecipestorefrontSystemSetup(final RecipestorefrontService recipestorefrontService)
	{
		this.recipestorefrontService = recipestorefrontService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		recipestorefrontService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return RecipestorefrontSystemSetup.class.getResourceAsStream("/recipestorefront/sap-hybris-platform.png");
	}
}
