package dz.decn.gestionsde.dto;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import dz.decn.gestionsde.model.Adresse;
import dz.decn.gestionsde.model.Arrete;
import dz.decn.gestionsde.model.Ecole;
import dz.decn.gestionsde.model.Personnel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonnelDto {
	
	private Integer id;	
	private String codePersonnel;	
	private String nomFr;
	private String nomAr;
	private String prenomFr;	
	private String prenomAr;
	private Date dateNaissance;		
	private String lieuNaissance ;
	private AdresseDto adresse ;//champs composé	
	private Boolean sexe ;		
	private String situationFamiliale ;	
	private String qualite ;	
	private String matiere ; 	
	private String niveau ;	
	private String diplome ;
	private Date dateDiplome ;				
	private String photo ;
	private Ecole ecole;
	private Arrete arrete ;
	
	public static PersonnelDto fromEntity(Personnel personnel) {
		if(personnel == null) {
			return null;
			//todo throw exception
		}
		return PersonnelDto.builder()
				.codePersonnel(personnel.getCodePersonnel())
				.nomFr(personnel.getNomFr())
				.nomAr(personnel.getNomAr())
				.prenomFr(personnel.getPrenomFr())
				.prenomAr(personnel.getPrenomAr())
				.dateNaissance(personnel.getDateNaissance())
				.sexe(personnel.getSexe())
				.qualite(personnel.getQualite())
				.matiere(personnel.getMatiere())
				.niveau(personnel.getNiveau())
				.diplome(personnel.getDiplome())
				.adresse(AdresseDto.fromEntity(personnel.getAdresse()))
				.photo(personnel.getPhoto())
				.build();
	}
	
	public static Personnel toEntity(PersonnelDto personnelDto) {
		
		if(personnelDto == null){
			return null;
		}
		Personnel personnel = new Personnel();
		personnel.setCodePersonnel(personnelDto.getCodePersonnel());
		personnel.setDateNaissance(personnelDto.getDateNaissance());
		personnel.setDateDiplome(personnelDto.getDateDiplome());
		personnel.setNomFr(personnelDto.getNomFr());
		personnel.setNomAr(personnelDto.getNomAr());
		personnel.setPrenomFr(personnelDto.getPrenomFr());
		personnel.setPrenomAr(personnelDto.getPrenomAr());
		personnel.setSexe(personnelDto.getSexe());
		personnel.setQualite(personnelDto.getQualite());
		personnel.setDiplome(personnelDto.getDiplome());
		personnel.setPhoto(personnelDto.getPhoto());
		personnel.setMatiere(personnelDto.getMatiere());
		return personnel;				
	}

}
