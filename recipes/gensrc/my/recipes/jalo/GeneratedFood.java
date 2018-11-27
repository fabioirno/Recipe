/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27-nov-2018 12.16.28                        ---
 * ----------------------------------------------------------------
 */
package my.recipes.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.recipes.constants.RecipesConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Food}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFood extends Product
{
	/** Qualifier of the <code>Food.kcal</code> attribute **/
	public static final String KCAL = "kcal";
	/** Qualifier of the <code>Food.isRaw</code> attribute **/
	public static final String ISRAW = "isRaw";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(KCAL, AttributeMode.INITIAL);
		tmp.put(ISRAW, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.isRaw</code> attribute.
	 * @return the isRaw - Check if the food is raw
	 */
	public Boolean isIsRaw(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISRAW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.isRaw</code> attribute.
	 * @return the isRaw - Check if the food is raw
	 */
	public Boolean isIsRaw()
	{
		return isIsRaw( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.isRaw</code> attribute. 
	 * @return the isRaw - Check if the food is raw
	 */
	public boolean isIsRawAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsRaw( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.isRaw</code> attribute. 
	 * @return the isRaw - Check if the food is raw
	 */
	public boolean isIsRawAsPrimitive()
	{
		return isIsRawAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.isRaw</code> attribute. 
	 * @param value the isRaw - Check if the food is raw
	 */
	public void setIsRaw(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISRAW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.isRaw</code> attribute. 
	 * @param value the isRaw - Check if the food is raw
	 */
	public void setIsRaw(final Boolean value)
	{
		setIsRaw( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.isRaw</code> attribute. 
	 * @param value the isRaw - Check if the food is raw
	 */
	public void setIsRaw(final SessionContext ctx, final boolean value)
	{
		setIsRaw( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.isRaw</code> attribute. 
	 * @param value the isRaw - Check if the food is raw
	 */
	public void setIsRaw(final boolean value)
	{
		setIsRaw( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.kcal</code> attribute.
	 * @return the kcal - Cals of this food
	 */
	public Double getKcal(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, KCAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.kcal</code> attribute.
	 * @return the kcal - Cals of this food
	 */
	public Double getKcal()
	{
		return getKcal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.kcal</code> attribute. 
	 * @return the kcal - Cals of this food
	 */
	public double getKcalAsPrimitive(final SessionContext ctx)
	{
		Double value = getKcal( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.kcal</code> attribute. 
	 * @return the kcal - Cals of this food
	 */
	public double getKcalAsPrimitive()
	{
		return getKcalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.kcal</code> attribute. 
	 * @param value the kcal - Cals of this food
	 */
	public void setKcal(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, KCAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.kcal</code> attribute. 
	 * @param value the kcal - Cals of this food
	 */
	public void setKcal(final Double value)
	{
		setKcal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.kcal</code> attribute. 
	 * @param value the kcal - Cals of this food
	 */
	public void setKcal(final SessionContext ctx, final double value)
	{
		setKcal( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.kcal</code> attribute. 
	 * @param value the kcal - Cals of this food
	 */
	public void setKcal(final double value)
	{
		setKcal( getSession().getSessionContext(), value );
	}
	
}
