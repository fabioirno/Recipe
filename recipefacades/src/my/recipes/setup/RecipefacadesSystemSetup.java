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

import static my.recipes.constants.RecipefacadesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.recipes.constants.RecipefacadesConstants;
import my.recipes.service.RecipefacadesService;


@SystemSetup(extension = RecipefacadesConstants.EXTENSIONNAME)
public class RecipefacadesSystemSetup
{
	private final RecipefacadesService recipefacadesService;

	public RecipefacadesSystemSetup(final RecipefacadesService recipefacadesService)
	{
		this.recipefacadesService = recipefacadesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		recipefacadesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return RecipefacadesSystemSetup.class.getResourceAsStream("/recipefacades/sap-hybris-platform.png");
	}
}
