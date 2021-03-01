package dz.decn.gestionsde.validator;

import java.util.ArrayList;
import java.util.List;

import dz.decn.gestionsde.dto.PersonnelDto;
import org.springframework.util.StringUtils;

public class PersonnelValidator {

	public static List<String> validate(PersonnelDto personnelDto) {
		
		
		List<String> errors = new ArrayList<String>();
		if(personnelDto == null){
			errors.add("SVP renseignez le code");
			errors.add("SVP renseignez le Nom Français");
			errors.add("SVP renseignez le Nom arabe");	
			errors.add("SVP renseignez le Prenom Français");
			errors.add("SVP renseignez le Prenom arabe");			
		}
		if(!StringUtils.hasLength(personnelDto.getCodePersonnel())){
			errors.add("SVP renseignez le code");			
		}
		if(!StringUtils.hasLength(personnelDto.getNomFr())){
			errors.add("SVP renseignez le Nom Français");			
		}
		if(!StringUtils.hasLength(personnelDto.getNomAr())){
			errors.add("SVP renseignez le Nom arabe");			
		}
		if(!StringUtils.hasLength(personnelDto.getPrenomFr())){
			errors.add("SVP renseignez le Prenom Français");			
		}
		if(!StringUtils.hasLength(personnelDto.getPrenomAr())){
			errors.add("SVP renseignez le Prenom arabe");			
		}
		if(personnelDto.getEcole()==null){
			errors.add("SVP renseignez l'école");			
		}
		return errors;
	}

}
