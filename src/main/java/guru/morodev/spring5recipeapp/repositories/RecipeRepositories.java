package guru.morodev.spring5recipeapp.repositories;

import guru.morodev.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Create by Luca Moro on 27/10/2020 17:53
 */
public interface RecipeRepositories extends CrudRepository<Recipe, Long> {
}
