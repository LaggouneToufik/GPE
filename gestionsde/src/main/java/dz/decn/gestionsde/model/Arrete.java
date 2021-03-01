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
public class Arrete extends abstractEntity {
	private String typeFr;
	private String typeAr;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dateSignature;	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dateEffet;	
	private Integer effectif ;
	@OneToMany(mappedBy="arrete",
	 orphanRemoval = true,
	 cascade = CascadeType.ALL)
private List<Personnel> personnels ;

}
