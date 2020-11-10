package guru.morodev.spring5recipeapp.services;

import guru.morodev.spring5recipeapp.commands.IngredientCommand;

/**
 * Created By Luca Moro on 08/11/2020 11:56
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
