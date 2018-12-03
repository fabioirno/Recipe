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
package my.recipes.populators;

import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;

import my.recipes.facades.data.ChefData;
import my.recipes.model.ChefModel;

public class DefaultChefPopulator implements Populator<ChefModel, ChefData>
{

	private Converter<AddressModel, AddressData> addressModelToDataConverter;

	@Override
	public void populate(final ChefModel source, final ChefData target) throws ConversionException
	{
		  target.setName(source.getName());
		  target.setRating(source.getRating());
		target.setAddress(addressModelToDataConverter.convert(source.getAddress()));


	}

	/**
	 * @return the addressModelToDataConverter
	 */
	public Converter<AddressModel, AddressData> getAddressModelToDataConverter()
	{
		return addressModelToDataConverter;
	}

	@Required
	public void setAddressModelToDataConverter(final Converter<AddressModel, AddressData> addressModelToDataConverter)
	{
		this.addressModelToDataConverter = addressModelToDataConverter;
	}






}
