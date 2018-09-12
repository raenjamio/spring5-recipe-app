package raenjamio.springframework.spring5recipeapp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import raenjamio.springframework.spring5recipeapp.domain.Category;

public class CategoryTest {
	
	private Category category;

	@Before
	public void setUp() {
		category = new Category();
	}

	@Test
	public void testGetId() {
		category.setId(1L);
		
		assertEquals(1, category.getId().longValue());
	}

	@Test
	public void testGetDescription() {
	}

	@Test
	public void testGetRecipes() {
	}

}
