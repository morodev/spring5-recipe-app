package guru.morodev.spring5recipeapp.services;

import guru.morodev.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Create By Luca Moro on 27/10/2020 19:42
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
