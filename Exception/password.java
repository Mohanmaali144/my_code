
 class PasswordException extends Exception{

	public PasswordException(){}
	
	public PasswordException(String msg)
	{
		super(msg);
	}
}

class BL {
	
	private String password;
	
	public void passwordCheck(String password)
	{
		try
		{
			if(password.length()<8)
				throw new PasswordException("password is very short");
			
			else if(password.equals("12345678"))
				throw new PasswordException("password is very Easy,, try another Password");
			
			for(int i=0; i<password.length(); i++)
			{
				if(password.charAt(i)=='.')
					throw new PasswordException(" you can not use   .   in password");
			}
			System.out.println("Done..||  Password is succesfuly seved");
			this.password = password;
		}
	catch(PasswordException ref)
	{
		System.out.println(ref);
	}	
	}
}

class Main {
	public static void main(String []args)
	{
		String password = args[0];
		
		BL ob = new BL();
		ob.passwordCheck(password);
	}
	
}