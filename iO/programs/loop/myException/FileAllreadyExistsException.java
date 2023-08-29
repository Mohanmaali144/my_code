package myexception;

public class FileAllreadyExistsException extends Exception{

	public FileAllreadyExistsException(){}
	
	public FileAllreadyExistsException(String msg)
	{
		super(msg);
	}
} 