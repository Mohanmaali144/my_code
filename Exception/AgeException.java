//user difine Exeption
class AgeException extends Exception{

	public AgeException(){}
	
	public AgeException(String msg)
	{
		super(msg);
	}
}
class MainClass {
	
	public static void main(String []args)
	{	
		try{
			int age = Integer.parseInt(args[0]);
			if(age<18)
			{
					throw new AgeException("Not Eligible for vote");
			}
			else 
			{
				System.out.println("Elegible for voting......");
			}
		}
		catch (AgeException ref)
		{
			System.out.println(ref);
		}
		
	}
}