package homework3;
public class MyException extends Exception{
	@Override
	public String getMessage() {
		
		return "You entered incorrect data ";
	}
	
}
