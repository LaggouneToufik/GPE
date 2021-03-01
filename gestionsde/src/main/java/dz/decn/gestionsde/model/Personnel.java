package dz.decn.gestionsde.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

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
public class Personnel extends abstractEntity{
	
	private String codePersonnel;
	private String nomFr;
	private String nomAr;
	private String prenomFr;
	private String prenomAr;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dateNaissance;	
	private String lieuNaissance ;
	@Embedded
	private Adresse adresse ;//champs composé
	private Boolean sexe ;	
	private String situationFamiliale ;
	private String qualite ;
	private String matiere ; 
	private String niveau ;
	private String diplome ;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dateDiplome ;			
	private String photo ;
	@ManyToOne
	private Ecole ecole;
	@ManyToOne
	private Arrete arrete ;				

}
