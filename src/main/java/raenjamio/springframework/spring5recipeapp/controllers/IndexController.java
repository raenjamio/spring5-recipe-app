package raenjamio.springframework.spring5recipeapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import raenjamio.springframework.spring5recipeapp.domain.Category;
import raenjamio.springframework.spring5recipeapp.domain.UnitOfMeasure;
import raenjamio.springframework.spring5recipeapp.repositories.CategoryRepository;
import raenjamio.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	

	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}



	@RequestMapping({"","/","index"})
	public String getIndexPage() {
		
		Optional<Category> category = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unit = unitOfMeasureRepository.findByDescription("Teaspoon");
		
		System.out.println("Cat " + category.get().getId());
		System.out.println("Unit " + unit.get().getId());
		
		return "index";
	}
}
