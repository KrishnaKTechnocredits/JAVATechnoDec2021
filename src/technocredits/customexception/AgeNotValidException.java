package technocredits.customexception;

public class AgeNotValidException extends Exception{

	public AgeNotValidException() {
		super("Age not valid");
	}
	
	public AgeNotValidException(String message) {
		super(message);
	}
}
