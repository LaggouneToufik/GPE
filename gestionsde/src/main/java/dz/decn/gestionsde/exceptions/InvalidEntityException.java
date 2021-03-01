package dz.decn.gestionsde.exceptions;

import java.util.List;

import lombok.Getter;

public class InvalidEntityException extends RuntimeException{
@Getter
private ErrorCodes errorCodes;
@Getter
private List<String> errors;
	
	public InvalidEntityException(String message) {
		super(message);
	}
	
	public InvalidEntityException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public InvalidEntityException(String message, Throwable cause, ErrorCodes erroCode) {
		super(message, cause);
		this.errorCodes=erroCode;
	}
	
	public InvalidEntityException(String message, ErrorCodes erroCode) {
		super(message);
		this.errorCodes=erroCode;
	}
	
	public InvalidEntityException(String message, ErrorCodes erroCode, List<String> errors) {
		super(message);
		this.errorCodes=erroCode;
		this.errors=errors;
	}
}
