package raenjamio.springframework.spring5recipeapp.domain;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude= {"recipe"})
@Entity
public class Notes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Recipe recipe;
	
	@Lob
	private String recipeNotes;
	

}
