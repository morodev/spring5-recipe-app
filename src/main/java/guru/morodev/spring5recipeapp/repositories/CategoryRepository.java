package guru.morodev.spring5recipeapp.repositories;

import guru.morodev.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Luca Moro on 27/10/2020 17:40
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
