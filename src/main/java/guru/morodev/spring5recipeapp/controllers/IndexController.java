package guru.morodev.spring5recipeapp.controllers;

import guru.morodev.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  Created by Luca Moro on 24/10/2020 17:00
 */
@Controller
public class IndexController {

   private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute( "recipes", recipeService.getRecipes());

        return "index";
    }
}
