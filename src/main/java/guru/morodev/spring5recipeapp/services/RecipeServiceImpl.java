package guru.morodev.spring5recipeapp.services;

import guru.morodev.spring5recipeapp.domain.Recipe;
import guru.morodev.spring5recipeapp.repositories.RecipeRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Luca Moro on 17/10/2020
 */
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepositories recipeRepositories;

    public RecipeServiceImpl(RecipeRepositories recipeRepositories) {
        this.recipeRepositories = recipeRepositories;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm in the service");

        Set<Recipe> recipes = new HashSet<>();
        recipeRepositories.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
