package raenjamio.springframework.spring5recipeapp.services;

import java.util.Set;

import raenjamio.springframework.spring5recipeapp.commands.RecipeCommand;
import raenjamio.springframework.spring5recipeapp.domain.Recipe;

public interface RecipeService {

    Set<Recipe> getRecipes();
    
    Recipe findById(Long l);
    
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
