package dz.decn.gestionsde.dto;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import dz.decn.gestionsde.model.Adresse;
import dz.decn.gestionsde.model.Ecole;
import dz.decn.gestionsde.model.Personnel;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class EcoleDto {
	
	private Integer id;
	
	private String ecnFr;
	
	private String ecnAr;
	
	private String abreviationFr;
	
	private String abreviationAr;
	
	private Date dateCreation;
	
	private AdresseDto adresse ;//champs composé
	
	private String cycle ;
		
	@JsonIgnore
	private List<PersonnelDto> personnels ;
	
	public static EcoleDto fromEntity(Ecole ecole) {
		if(ecole == null) {
			return null;
			//todo throw exception
		}
		return EcoleDto.builder()
				.ecnFr(ecole.getEcnFr())
				.ecnAr(ecole.getEcnAr())
				.abreviationFr(ecole.getAbreviationFr())
				.abreviationAr(ecole.getAbreviationAr())
				.dateCreation(ecole.getDateCreation())
				.cycle(ecole.getCycle())
				.adresse(AdresseDto.fromEntity(ecole.getAdresse()))
				.build();
	}
	
	public static Ecole toEntity(EcoleDto ecoleDto) {
		
		if(ecoleDto == null){
			return null;
		}
		Ecole ecole = new Ecole();
		ecole.setEcnFr(ecoleDto.getEcnFr());
		ecole.setEcnAr(ecoleDto.getEcnAr());
		ecole.setAbreviationFr(ecoleDto.getAbreviationFr());
		ecole.setAbreviationAr(ecoleDto.getAbreviationAr());
		ecole.setDateCreation(ecoleDto.getDateCreation());
		ecole.setCycle(ecoleDto.getCycle());		
		return ecole;				
	}
	

}
