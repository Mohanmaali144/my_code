//user difine Exeption  ---- Uppercase or NotAlphabet ----

// uncomplete...
class UppereCaseException extends Exception{

	public UppereCaseException(){}
	
	public UppereCaseException(String msg)
	{
		super(msg);
	}
}
class MainClass {
	
	public static void main(String []args)
	{	
		try{
			char ch =(args[0]);
			
			if((ch<65||ch>90)&&(ch<97 || ch>122))
			{
				throw new UppereCaseException(" Charecter is Not a Alphabet...");
			}
			
			else if(ch>=65 && ch<=90)
			{
				throw new UppereCaseException(" Charecter is upper case...");
			}
			else 
			{
				//	ch = ch-32;
			}
		}
		catch (UppereCaseException ref)
		{
			System.out.println(ref);
		}
		
	}
} 