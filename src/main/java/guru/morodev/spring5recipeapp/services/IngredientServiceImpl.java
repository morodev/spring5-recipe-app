package guru.morodev.spring5recipeapp.services;

import guru.morodev.spring5recipeapp.commands.IngredientCommand;
import guru.morodev.spring5recipeapp.converters.IngredientToIngredientCommand;
import guru.morodev.spring5recipeapp.domain.Recipe;
import guru.morodev.spring5recipeapp.repositories.RecipeRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientToIngredientCommand ingredientToIngredientCommand;
    private final RecipeRepositories recipeRepositories;

    public IngredientServiceImpl(IngredientToIngredientCommand ingredientToIngredientCommand, RecipeRepositories recipeRepositories) {
        this.ingredientToIngredientCommand = ingredientToIngredientCommand;
        this.recipeRepositories = recipeRepositories;
    }

    @Override
    public IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId) {

        Optional<Recipe> recipeOptional = recipeRepositories.findById(recipeId);

        if (!recipeOptional.isPresent()){
            //todo impl error handling
            log.error("recipe id not found. Id: " + recipeId);
        }

        Recipe recipe = recipeOptional.get();

        Optional<IngredientCommand> ingredientCommandOptional = recipe.getIngredients().stream()
                .filter(ingredient -> ingredient.getId().equals(ingredientId))
                .map( ingredient -> ingredientToIngredientCommand.convert(ingredient)).findFirst();

        if(!ingredientCommandOptional.isPresent()){
            //todo impl error handling
            log.error("Ingredient id not found: " + ingredientId);
        }

        return ingredientCommandOptional.get();
    }
}
