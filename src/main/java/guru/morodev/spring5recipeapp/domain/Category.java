package guru.morodev.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Create By Luca Moro on 26/10/2020 18:35
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
