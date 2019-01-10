/**
 *
 */
package my.recipes.v2.controller;

import de.hybris.platform.commerceservices.request.mapping.annotation.ApiVersion;
import de.hybris.platform.webservicescommons.mapping.DataMapper;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import my.recipes.facades.RecipeFacade;
import my.recipes.facades.data.RecipeData;
import my.recipes.recipecommercewebservices.dto.recipe.RecipeWsDTO;


/**
 * @author firno Main Controller for Recipes
 */
@Controller
@RequestMapping(value = "/recipeCWS")
@ApiVersion("v2")
public class RecipesController
{

	@Resource(name = "recipeFacade")
	private RecipeFacade recipeFacade;

	@Resource(name = "dataMapper")
	protected DataMapper dataMapper;

	@RequestMapping(value = "/recipeAlls", method = RequestMethod.GET)
	@ResponseBody
	public List<RecipeWsDTO> getRecipes(@RequestParam(defaultValue = "BASIC")
	final String fields)
	{

		final List<RecipeData> recipeData = recipeFacade.getAllRecipes();
		final List<RecipeWsDTO> dto = (List<RecipeWsDTO>) dataMapper.map(recipeData, RecipeWsDTO.class, fields);
		return dto;
	}
}
