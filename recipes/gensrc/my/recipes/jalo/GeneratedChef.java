/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27-nov-2018 12.16.28                        ---
 * ----------------------------------------------------------------
 */
package my.recipes.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.recipes.constants.RecipesConstants;
import my.recipes.jalo.Recipe;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.User Chef}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedChef extends User
{
	/** Qualifier of the <code>Chef.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>Chef.rating</code> attribute **/
	public static final String RATING = "rating";
	/** Qualifier of the <code>Chef.recipes</code> attribute **/
	public static final String RECIPES = "recipes";
	/** Relation ordering override parameter constants for Recipe2Chef from ((recipes))*/
	protected static String RECIPE2CHEF_SRC_ORDERED = "relation.Recipe2Chef.source.ordered";
	protected static String RECIPE2CHEF_TGT_ORDERED = "relation.Recipe2Chef.target.ordered";
	/** Relation disable markmodifed parameter constants for Recipe2Chef from ((recipes))*/
	protected static String RECIPE2CHEF_MARKMODIFIED = "relation.Recipe2Chef.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(User.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chef.address</code> attribute.
	 * @return the address - This is the address of restaurant where works the chef
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chef.address</code> attribute.
	 * @return the address - This is the address of restaurant where works the chef
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Chef.address</code> attribute. 
	 * @param value the address - This is the address of restaurant where works the chef
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Chef.address</code> attribute. 
	 * @param value the address - This is the address of restaurant where works the chef
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Recipe");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(RECIPE2CHEF_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chef.rating</code> attribute.
	 * @return the rating - This is the raiting's chef
	 */
	public Integer getRating(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chef.rating</code> attribute.
	 * @return the rating - This is the raiting's chef
	 */
	public Integer getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chef.rating</code> attribute. 
	 * @return the rating - This is the raiting's chef
	 */
	public int getRatingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRating( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chef.rating</code> attribute. 
	 * @return the rating - This is the raiting's chef
	 */
	public int getRatingAsPrimitive()
	{
		return getRatingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Chef.rating</code> attribute. 
	 * @param value the rating - This is the raiting's chef
	 */
	public void setRating(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Chef.rating</code> attribute. 
	 * @param value the rating - This is the raiting's chef
	 */
	public void setRating(final Integer value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Chef.rating</code> attribute. 
	 * @param value the rating - This is the raiting's chef
	 */
	public void setRating(final SessionContext ctx, final int value)
	{
		setRating( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Chef.rating</code> attribute. 
	 * @param value the rating - This is the raiting's chef
	 */
	public void setRating(final int value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chef.recipes</code> attribute.
	 * @return the recipes
	 */
	public Collection<Recipe> getRecipes(final SessionContext ctx)
	{
		final List<Recipe> items = getLinkedItems( 
			ctx,
			false,
			RecipesConstants.Relations.RECIPE2CHEF,
			"Recipe",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Chef.recipes</code> attribute.
	 * @return the recipes
	 */
	public Collection<Recipe> getRecipes()
	{
		return getRecipes( getSession().getSessionContext() );
	}
	
	public long getRecipesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			RecipesConstants.Relations.RECIPE2CHEF,
			"Recipe",
			null
		);
	}
	
	public long getRecipesCount()
	{
		return getRecipesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Chef.recipes</code> attribute. 
	 * @param value the recipes
	 */
	public void setRecipes(final SessionContext ctx, final Collection<Recipe> value)
	{
		setLinkedItems( 
			ctx,
			false,
			RecipesConstants.Relations.RECIPE2CHEF,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2CHEF_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Chef.recipes</code> attribute. 
	 * @param value the recipes
	 */
	public void setRecipes(final Collection<Recipe> value)
	{
		setRecipes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipes. 
	 * @param value the item to add to recipes
	 */
	public void addToRecipes(final SessionContext ctx, final Recipe value)
	{
		addLinkedItems( 
			ctx,
			false,
			RecipesConstants.Relations.RECIPE2CHEF,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2CHEF_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipes. 
	 * @param value the item to add to recipes
	 */
	public void addToRecipes(final Recipe value)
	{
		addToRecipes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipes. 
	 * @param value the item to remove from recipes
	 */
	public void removeFromRecipes(final SessionContext ctx, final Recipe value)
	{
		removeLinkedItems( 
			ctx,
			false,
			RecipesConstants.Relations.RECIPE2CHEF,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2CHEF_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipes. 
	 * @param value the item to remove from recipes
	 */
	public void removeFromRecipes(final Recipe value)
	{
		removeFromRecipes( getSession().getSessionContext(), value );
	}
	
}
