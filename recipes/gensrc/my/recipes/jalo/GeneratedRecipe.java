/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27-nov-2018 12.16.28                        ---
 * ----------------------------------------------------------------
 */
package my.recipes.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.recipes.constants.RecipesConstants;
import my.recipes.jalo.Chef;
import my.recipes.jalo.Ingredient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Recipe}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRecipe extends GenericItem
{
	/** Qualifier of the <code>Recipe.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Recipe.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Recipe.difficulty</code> attribute **/
	public static final String DIFFICULTY = "difficulty";
	/** Qualifier of the <code>Recipe.method</code> attribute **/
	public static final String METHOD = "method";
	/** Qualifier of the <code>Recipe.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Recipe.rating</code> attribute **/
	public static final String RATING = "rating";
	/** Qualifier of the <code>Recipe.servings</code> attribute **/
	public static final String SERVINGS = "servings";
	/** Qualifier of the <code>Recipe.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>Recipe.ingredients</code> attribute **/
	public static final String INGREDIENTS = "ingredients";
	/** Relation ordering override parameter constants for Recipe2IngredientRelation from ((recipes))*/
	protected static String RECIPE2INGREDIENTRELATION_SRC_ORDERED = "relation.Recipe2IngredientRelation.source.ordered";
	protected static String RECIPE2INGREDIENTRELATION_TGT_ORDERED = "relation.Recipe2IngredientRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Recipe2IngredientRelation from ((recipes))*/
	protected static String RECIPE2INGREDIENTRELATION_MARKMODIFIED = "relation.Recipe2IngredientRelation.markmodified";
	/** Qualifier of the <code>Recipe.chefs</code> attribute **/
	public static final String CHEFS = "chefs";
	/** Relation ordering override parameter constants for Recipe2Chef from ((recipes))*/
	protected static String RECIPE2CHEF_SRC_ORDERED = "relation.Recipe2Chef.source.ordered";
	protected static String RECIPE2CHEF_TGT_ORDERED = "relation.Recipe2Chef.target.ordered";
	/** Relation disable markmodifed parameter constants for Recipe2Chef from ((recipes))*/
	protected static String RECIPE2CHEF_MARKMODIFIED = "relation.Recipe2Chef.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(DIFFICULTY, AttributeMode.INITIAL);
		tmp.put(METHOD, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		tmp.put(SERVINGS, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.chefs</code> attribute.
	 * @return the chefs
	 */
	public Collection<Chef> getChefs(final SessionContext ctx)
	{
		final List<Chef> items = getLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPE2CHEF,
			"Chef",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.chefs</code> attribute.
	 * @return the chefs
	 */
	public Collection<Chef> getChefs()
	{
		return getChefs( getSession().getSessionContext() );
	}
	
	public long getChefsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			RecipesConstants.Relations.RECIPE2CHEF,
			"Chef",
			null
		);
	}
	
	public long getChefsCount()
	{
		return getChefsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.chefs</code> attribute. 
	 * @param value the chefs
	 */
	public void setChefs(final SessionContext ctx, final Collection<Chef> value)
	{
		setLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPE2CHEF,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2CHEF_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.chefs</code> attribute. 
	 * @param value the chefs
	 */
	public void setChefs(final Collection<Chef> value)
	{
		setChefs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to chefs. 
	 * @param value the item to add to chefs
	 */
	public void addToChefs(final SessionContext ctx, final Chef value)
	{
		addLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPE2CHEF,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2CHEF_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to chefs. 
	 * @param value the item to add to chefs
	 */
	public void addToChefs(final Chef value)
	{
		addToChefs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from chefs. 
	 * @param value the item to remove from chefs
	 */
	public void removeFromChefs(final SessionContext ctx, final Chef value)
	{
		removeLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPE2CHEF,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2CHEF_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from chefs. 
	 * @param value the item to remove from chefs
	 */
	public void removeFromChefs(final Chef value)
	{
		removeFromChefs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.description</code> attribute.
	 * @return the description - This is the description of the recipe
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.description</code> attribute.
	 * @return the description - This is the description of the recipe
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.description</code> attribute. 
	 * @return the localized description - This is the description of the recipe
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.description</code> attribute. 
	 * @return the localized description - This is the description of the recipe
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.description</code> attribute. 
	 * @param value the description - This is the description of the recipe
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.description</code> attribute. 
	 * @param value the description - This is the description of the recipe
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.description</code> attribute. 
	 * @param value the description - This is the description of the recipe
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.description</code> attribute. 
	 * @param value the description - This is the description of the recipe
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.difficulty</code> attribute.
	 * @return the difficulty - The difficulty to do this recipe
	 */
	public EnumerationValue getDifficulty(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DIFFICULTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.difficulty</code> attribute.
	 * @return the difficulty - The difficulty to do this recipe
	 */
	public EnumerationValue getDifficulty()
	{
		return getDifficulty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.difficulty</code> attribute. 
	 * @param value the difficulty - The difficulty to do this recipe
	 */
	public void setDifficulty(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DIFFICULTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.difficulty</code> attribute. 
	 * @param value the difficulty - The difficulty to do this recipe
	 */
	public void setDifficulty(final EnumerationValue value)
	{
		setDifficulty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.ingredients</code> attribute.
	 * @return the ingredients
	 */
	public Collection<Ingredient> getIngredients(final SessionContext ctx)
	{
		final List<Ingredient> items = getLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPE2INGREDIENTRELATION,
			"Ingredient",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.ingredients</code> attribute.
	 * @return the ingredients
	 */
	public Collection<Ingredient> getIngredients()
	{
		return getIngredients( getSession().getSessionContext() );
	}
	
	public long getIngredientsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			RecipesConstants.Relations.RECIPE2INGREDIENTRELATION,
			"Ingredient",
			null
		);
	}
	
	public long getIngredientsCount()
	{
		return getIngredientsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.ingredients</code> attribute. 
	 * @param value the ingredients
	 */
	public void setIngredients(final SessionContext ctx, final Collection<Ingredient> value)
	{
		setLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPE2INGREDIENTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2INGREDIENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.ingredients</code> attribute. 
	 * @param value the ingredients
	 */
	public void setIngredients(final Collection<Ingredient> value)
	{
		setIngredients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ingredients. 
	 * @param value the item to add to ingredients
	 */
	public void addToIngredients(final SessionContext ctx, final Ingredient value)
	{
		addLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPE2INGREDIENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2INGREDIENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ingredients. 
	 * @param value the item to add to ingredients
	 */
	public void addToIngredients(final Ingredient value)
	{
		addToIngredients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ingredients. 
	 * @param value the item to remove from ingredients
	 */
	public void removeFromIngredients(final SessionContext ctx, final Ingredient value)
	{
		removeLinkedItems( 
			ctx,
			true,
			RecipesConstants.Relations.RECIPE2INGREDIENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPE2INGREDIENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ingredients. 
	 * @param value the item to remove from ingredients
	 */
	public void removeFromIngredients(final Ingredient value)
	{
		removeFromIngredients( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Ingredient");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(RECIPE2INGREDIENTRELATION_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("Chef");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(RECIPE2CHEF_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.method</code> attribute.
	 * @return the method - This is the description of the recipe
	 */
	public String getMethod(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.getMethod requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, METHOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.method</code> attribute.
	 * @return the method - This is the description of the recipe
	 */
	public String getMethod()
	{
		return getMethod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.method</code> attribute. 
	 * @return the localized method - This is the description of the recipe
	 */
	public Map<Language,String> getAllMethod(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,METHOD,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.method</code> attribute. 
	 * @return the localized method - This is the description of the recipe
	 */
	public Map<Language,String> getAllMethod()
	{
		return getAllMethod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.method</code> attribute. 
	 * @param value the method - This is the description of the recipe
	 */
	public void setMethod(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.setMethod requires a session language", 0 );
		}
		setLocalizedProperty(ctx, METHOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.method</code> attribute. 
	 * @param value the method - This is the description of the recipe
	 */
	public void setMethod(final String value)
	{
		setMethod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.method</code> attribute. 
	 * @param value the method - This is the description of the recipe
	 */
	public void setAllMethod(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,METHOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.method</code> attribute. 
	 * @param value the method - This is the description of the recipe
	 */
	public void setAllMethod(final Map<Language,String> value)
	{
		setAllMethod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.name</code> attribute.
	 * @return the name - Name of the recipe
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.name</code> attribute.
	 * @return the name - Name of the recipe
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.name</code> attribute. 
	 * @return the localized name - Name of the recipe
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.name</code> attribute. 
	 * @return the localized name - Name of the recipe
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.name</code> attribute. 
	 * @param value the name - Name of the recipe
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.name</code> attribute. 
	 * @param value the name - Name of the recipe
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.name</code> attribute. 
	 * @param value the name - Name of the recipe
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.name</code> attribute. 
	 * @param value the name - Name of the recipe
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.rating</code> attribute.
	 * @return the rating - This is the raiting's chef
	 */
	public Integer getRating(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.rating</code> attribute.
	 * @return the rating - This is the raiting's chef
	 */
	public Integer getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.rating</code> attribute. 
	 * @return the rating - This is the raiting's chef
	 */
	public int getRatingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRating( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.rating</code> attribute. 
	 * @return the rating - This is the raiting's chef
	 */
	public int getRatingAsPrimitive()
	{
		return getRatingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.rating</code> attribute. 
	 * @param value the rating - This is the raiting's chef
	 */
	public void setRating(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.rating</code> attribute. 
	 * @param value the rating - This is the raiting's chef
	 */
	public void setRating(final Integer value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.rating</code> attribute. 
	 * @param value the rating - This is the raiting's chef
	 */
	public void setRating(final SessionContext ctx, final int value)
	{
		setRating( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.rating</code> attribute. 
	 * @param value the rating - This is the raiting's chef
	 */
	public void setRating(final int value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.servings</code> attribute.
	 * @return the servings - The number of person for this recipe
	 */
	public Integer getServings(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SERVINGS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.servings</code> attribute.
	 * @return the servings - The number of person for this recipe
	 */
	public Integer getServings()
	{
		return getServings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.servings</code> attribute. 
	 * @return the servings - The number of person for this recipe
	 */
	public int getServingsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getServings( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.servings</code> attribute. 
	 * @return the servings - The number of person for this recipe
	 */
	public int getServingsAsPrimitive()
	{
		return getServingsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.servings</code> attribute. 
	 * @param value the servings - The number of person for this recipe
	 */
	public void setServings(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SERVINGS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.servings</code> attribute. 
	 * @param value the servings - The number of person for this recipe
	 */
	public void setServings(final Integer value)
	{
		setServings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.servings</code> attribute. 
	 * @param value the servings - The number of person for this recipe
	 */
	public void setServings(final SessionContext ctx, final int value)
	{
		setServings( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.servings</code> attribute. 
	 * @param value the servings - The number of person for this recipe
	 */
	public void setServings(final int value)
	{
		setServings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.time</code> attribute.
	 * @return the time - Time to do this recipe
	 */
	public Double getTime(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.time</code> attribute.
	 * @return the time - Time to do this recipe
	 */
	public Double getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.time</code> attribute. 
	 * @return the time - Time to do this recipe
	 */
	public double getTimeAsPrimitive(final SessionContext ctx)
	{
		Double value = getTime( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.time</code> attribute. 
	 * @return the time - Time to do this recipe
	 */
	public double getTimeAsPrimitive()
	{
		return getTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.time</code> attribute. 
	 * @param value the time - Time to do this recipe
	 */
	public void setTime(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.time</code> attribute. 
	 * @param value the time - Time to do this recipe
	 */
	public void setTime(final Double value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.time</code> attribute. 
	 * @param value the time - Time to do this recipe
	 */
	public void setTime(final SessionContext ctx, final double value)
	{
		setTime( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.time</code> attribute. 
	 * @param value the time - Time to do this recipe
	 */
	public void setTime(final double value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
}
