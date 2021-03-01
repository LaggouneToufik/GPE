package dz.decn.gestionsde.dto;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import dz.decn.gestionsde.model.Arrete;
import dz.decn.gestionsde.model.Ecole;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArreteDto {
	private Integer id;
	private String typeFr;
	private String typeAr;
	private Date dateSignature;	
	private Date dateEffet;	
	private Integer effectif ;
	@JsonIgnore
	private List<PersonnelDto> personnels ;
	
	public static ArreteDto fromEntity(Arrete arrete) {
		if(arrete == null) {
			return null;
			//todo throw exception
		}
		return ArreteDto.builder()
				.typeFr(arrete.getTypeFr())
				.typeAr(arrete.getTypeAr())
				.dateSignature(arrete.getDateSignature())
				.dateEffet(arrete.getDateEffet())
				.effectif(arrete.getEffectif())
				.build();
	}
	
	public static Arrete toEntity(ArreteDto arreteDto) {
		
		if(arreteDto == null){
			return null;
		}
		Arrete arrete = new Arrete();
		arrete.setTypeFr(arrete.getTypeFr());
		arrete.setTypeAr(arrete.getTypeAr());
		arrete.setDateSignature(arrete.getDateSignature());
		arrete.setDateEffet(arrete.getDateEffet());
		arrete.setEffectif(arrete.getEffectif());				
		return arrete;				
	}

}
