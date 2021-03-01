package dz.decn.gestionsde.model;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Ecole extends abstractEntity{
	
	private String ecnFr;
	
	private String ecnAr;
	
	private String abreviationFr;
	
	private String abreviationAr;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dateCreation;	
	
	@Embedded
	private Adresse adresse ;//champs composé
	
	private String cycle ;
	@OneToMany(mappedBy="ecole",
	orphanRemoval = true,
	 cascade = CascadeType.ALL)
private List<Personnel> personnels ;
}
