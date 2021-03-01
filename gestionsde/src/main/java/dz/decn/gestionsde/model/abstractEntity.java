package dz.decn.gestionsde.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class abstractEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7838523188383204950L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@CreatedDate
	@JsonIgnore
	private Date creationDate;
	
	
	@LastModifiedDate
	@JsonIgnore
	private Date lastUpdateDate;

}
