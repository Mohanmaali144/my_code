//user difine Exeption
class NegativeNumberException extends Exception{

	public NegativeNumberException(){}
	
	public NegativeNumberException(String msg)
	{
		super(msg);
	}
}
class MainClass {
	
	public static void main(String []args)
	{	
		try{
			int  n = Integer.parseInt(args[0]);
			if(n<0)
			{
				throw new NegativeNumberException("Negative number...");
			}
			else 
			{
				System.out.println("Positive number......");
			}
		}
		catch (NegativeNumberException ref)
		{
			System.out.println(ref);
		}
		
	}
}