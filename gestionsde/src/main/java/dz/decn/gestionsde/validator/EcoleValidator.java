package dz.decn.gestionsde.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import dz.decn.gestionsde.dto.EcoleDto;

public class EcoleValidator {

	public static List<String> validate(EcoleDto ecoleDto) {
		
		List<String> errors = new ArrayList<String>();
		if(ecoleDto == null){
			errors.add("SVP renseignez le Nom Français");			
			errors.add("SVP renseignez le Nom arabe");			
			errors.add("SVP renseignez le Cycle");						
			
		}
		if(!StringUtils.hasLength(ecoleDto.getEcnFr())){
			errors.add("SVP renseignez le Nom Français");			
		}
		if(!StringUtils.hasLength(ecoleDto.getEcnAr())){
			errors.add("SVP renseignez le Nom arabe");			
		}
		if(!StringUtils.hasLength(ecoleDto.getCycle())){
			errors.add("SVP renseignez le Cycle");			
		}

		return errors;
	}
}
