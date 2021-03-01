package dz.decn.gestionsde.dto;

import java.util.Collection;
import java.util.Date;

import javax.persistence.ManyToOne;

import dz.decn.gestionsde.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RolesDto {
	
	private Integer id;
	
	private String name;
	
	private UtilisateurDto utilisateur ;
}
