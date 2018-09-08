package raenjamio.springframework.spring5recipeapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import raenjamio.springframework.spring5recipeapp.domain.Category;
import raenjamio.springframework.spring5recipeapp.domain.UnitOfMeasure;
import raenjamio.springframework.spring5recipeapp.repositories.CategoryRepository;
import raenjamio.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import raenjamio.springframework.spring5recipeapp.services.RecipeService;

@Controller
public class IndexController {
	
	private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
