package raenjamio.springframework.spring5recipeapp.repositories;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import raenjamio.springframework.spring5recipeapp.domain.UnitOfMeasure;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

	@Autowired
	UnitOfMeasureRepository unitOfMeasureRepository;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	//@DirtiesContext
	public void testFindByDescription() {
		Optional<UnitOfMeasure> unit = unitOfMeasureRepository.findByDescription("Teaspoon");
		
		assertEquals("Teaspoon", unit.get().getDescription());
	}

}
