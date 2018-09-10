package raenjamio.springframework.spring5recipeapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import raenjamio.springframework.spring5recipeapp.domain.Category;
import raenjamio.springframework.spring5recipeapp.domain.UnitOfMeasure;
import raenjamio.springframework.spring5recipeapp.repositories.CategoryRepository;
import raenjamio.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import raenjamio.springframework.spring5recipeapp.services.RecipeService;

@Slf4j
@Controller
public class IndexController {
	
	private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
    	log.debug("in getIndexPage");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
