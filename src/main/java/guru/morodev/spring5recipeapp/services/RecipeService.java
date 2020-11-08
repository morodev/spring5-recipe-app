package guru.morodev.spring5recipeapp.services;

import guru.morodev.spring5recipeapp.commands.RecipeCommand;
import guru.morodev.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Create By Luca Moro on 27/10/2020 19:42
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);
}
