/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 18-gen-2019 15.46.48                        ---
 * ----------------------------------------------------------------
 */
package my.recipes.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.recipes.constants.RecipesConstants;
import my.recipes.jalo.Food;
import my.recipes.jalo.Recipe;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Ingredient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIngredient extends GenericItem
{
	/** Qualifier of the <code>Ingredient.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Ingredient.food</code> attribute **/
	public static final String FOOD = "food";
	/** Qualifier of the <code>Ingredient.isFood</code> attribute **/
	public static final String ISFOOD = "isFood";
	/** Qualifier of the <code>Ingredient.quantity</code> attribute **/
	public static final String QUANTITY = "quantity";
	/** Qualifier of the <code>Ingredient.recipes</code> attribute **/
	public static final String RECIPES = "recipes";
	/** Relation ordering override parameter constants for Recipe2IngredientRelation from ((recipes))*/
	protected static String RECIPE2INGREDIENTRELATION_SRC_ORDERED = "relation.Recipe2IngredientRelation.source.ordered";
	protected static String RECIPE2INGREDIENTRELATION_TGT_ORDERED = "relation.Recipe2IngredientRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Recipe2IngredientRelation from ((recipes))*/
	protected static String RECIPE2INGREDIENTRELATION_MARKMODIFIED = "relation.Recipe2IngredientRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(FOOD, AttributeMode.INITIAL);
		tmp.put(ISFOOD, AttributeMode.INITIAL);
		tmp.put(QUANTITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.food</code> attribute.
	 * @return the food - Check if the food is raw
	 */
	public Food getFood(final SessionContext ctx)
	{
		return (Food)getProperty( ctx, FOOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.food</code> attribute.
	 * @return the food - Check if the food is raw
	 */
	public Food getFood()
	{
		return getFood( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.food</code> attribute. 
	 * @param value the food - Check if the food is raw
	 */
	public void setFood(final SessionContext ctx, final Food value)
	{
		setProperty(ctx, FOOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.food</code> attribute. 
	 * @param value the food - Check if the food is raw
	 */
	public void setFood(final Food value)
	{
		setFood( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.isFood</code> attribute.
	 * @return the isFood - Check if the food is raw
	 */
	public Boolean isIsFood(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISFOOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.isFood</code> attribute.
	 * @return the isFood - Check if the food is raw
	 */
	public Boolean isIsFood()
	{
		return isIsFood( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.isFood</code> attribute. 
	 * @return the isFood - Check if the food is raw
	 */
	public boolean isIsFoodAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsFood( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.isFood</code> attribute. 
	 * @return the isFood - Check if the food is raw
	 */
	public boolean isIsFoodAsPrimitive()
	{
		return isIsFoodAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.isFood</code> attribute. 
	 * @param value the isFood - Check if the food is raw
	 */
	public void setIsFood(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISFOOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.isFood</code> attribute. 
	 * @param value the isFood - Check if the food is raw
	 */
	public void setIsFood(final Boolean value)
	{
		setIsFood( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.isFood</code> attribute. 
	 * @param value the isFood - Check if the food is raw
	 */
	public void setIsFood(final SessionContext ctx, final boolean value)
	{
		setIsFood( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.isFood</code> attribute. 
	 * @param value the isFood - Check if the food is raw
	 */
	public void setIsFood(final boolean value)
	{
		setIsFood( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Recipe");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(RECIPE2INGREDIENTRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.quantity</code> attribute.
	 * @return the quantity - This is the description of the recipe
	 */
	public Double getQuantity(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.quantity</code> attribute.
	 * @return the quantity - This is the description of the recipe
	 */
	public Double getQuantity()
	{
		return getQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.quantity</code> attribute. 
	 * @return the quantity - This is the description of the recipe
	 */
	public double getQuantityAsPrimitive(final SessionContext ctx)
	{
		Double value = getQuantity( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.quantity</code> attribute. 
	 * @return the quantity - This is the description of the recipe
	 */
	public double getQuantityAsPrimitive()
	{
		return getQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.quantity</code> attribute. 
	 * @param value the quantity - This is the description of the recipe
	 */
	public void setQuantity(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, QUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.quantity</code> attribute. 
	 * @param value the quantity - This is the description of the recipe
	 */
	public void setQuantity(final Double value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.quantity</code> attribute. 
	 * @param value the quantity - This is the description of the recipe
	 */
	public void setQuantity(final SessionContext ctx, final double value)
	{
		setQuantity( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.quantity</code> attribute. 
	 * @param value the quantity - This is the description of the recipe
	 */
	public void setQuantity(final double value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.recipes</code> attribute.
	 * @return the recipes
	 */
	public Collection<Recipe> getRecipes(final SessionContext ctx)
	{
		final List<Recipe> items = getLinkedItems( 
			ctx,
			false,
			RecipesConstants.Relations.RECIPE2INGREDIENTRELATION,
			"Recipe",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.recipes</code> attribute.
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
			RecipesConstants.Relations.RECIPE2INGREDIENTRELATION,
			"Recipe",
			null
		);
	}
	
	public long getRecipesCount()
	{
		return getRecipesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.recipes</code> attribute. 
	 * @param value the recipes
	 */
	public void setRecipes(final SessionContext ctx, final Collection<Recipe> value)
	{
		setLinkedItems( 
			ctx,
			false,
			RecipesConstants.Relations.RECIPE2INGREDIENTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2INGREDIENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.recipes</code> attribute. 
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
			RecipesConstants.Relations.RECIPE2INGREDIENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2INGREDIENTRELATION_MARKMODIFIED)
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
			RecipesConstants.Relations.RECIPE2INGREDIENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2INGREDIENTRELATION_MARKMODIFIED)
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
