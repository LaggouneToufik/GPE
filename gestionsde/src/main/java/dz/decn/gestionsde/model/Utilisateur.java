package dz.decn.gestionsde.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

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
public class Utilisateur extends abstractEntity{
	
	private String codeUtilisateur;
	private String email;
	private String pseudo;
	private String motDePasse;
	@OneToMany(mappedBy="utilisateur",
			 orphanRemoval = true,
			 cascade = CascadeType.ALL)
		private List<Roles> roles ;
	
}
