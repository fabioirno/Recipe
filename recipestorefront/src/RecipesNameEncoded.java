import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.log4j.Logger;

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


public class RecipesNameEncoded
{
	private final static Logger LOG = Logger.getLogger(RecipesNameEncoded.class.getName());

	public static String genNameEncoded(final String name)
	{

		try
		{
			return URLEncoder.encode(name, "UTF-8");
		}
		catch (final UnsupportedEncodingException e)
		{
			Log.error("Problems while encoding", e);
			return "";
		}
	}


}
