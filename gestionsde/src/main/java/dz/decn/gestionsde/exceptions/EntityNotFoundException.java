package dz.decn.gestionsde.exceptions;

import lombok.Getter;

public class EntityNotFoundException extends RuntimeException {
	@Getter
	private ErrorCodes errorCodes;
	
	public EntityNotFoundException(String message) {
		super(message);
	}
	
	public EntityNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public EntityNotFoundException(String message, Throwable cause, ErrorCodes erroCode) {
		super(message, cause);
		this.errorCodes=erroCode;
	}
	
	public EntityNotFoundException(String message, ErrorCodes erroCode) {
		super(message);
		this.errorCodes=erroCode;
	}


}
