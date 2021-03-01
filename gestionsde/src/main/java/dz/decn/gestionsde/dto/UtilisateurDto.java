package dz.decn.gestionsde.dto;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import dz.decn.gestionsde.model.Roles;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UtilisateurDto {
	
	private Integer id;
	
	private String codeUtilisateur;
	
	private String email;
	
	private String pseudo;
	
	private String motDePasse;
	
	private List<RolesDto> roles ;
}
