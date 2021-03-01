package dz.decn.gestionsde.exceptions;

public enum ErrorCodes {

	PERSONNEL_NOT_FOUND(1000),
	PERSONNEL_NOT_VALID(1001),
	ECOLE_NOT_FOUND(2000),
	ECOLE_NOT_VALID(2001),
	ARRETE_NOT_FOUND(3000),
	ARRETE_NOT_VALID(3001);
	
	private int code;
	
	ErrorCodes(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
}
