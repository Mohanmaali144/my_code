//user difine Exeption  ---- Blood donate ----

 class AgeException extends Exception{

	public AgeException(){}
	
	public AgeException (String msg)
	{
		super(msg);
	}
} 
class BLClass {
	
	public void check(int age ,int weight)
	{	
		try{
			
			if(age<22)
			{
				throw new AgeException("age is < 22 :  ");
			}
			else if(age>50)
			{
				throw new AgeException("age is > 50  it is oldest age: ");
			}
			else if(weight<55)
			{
				throw new AgeException("  weight is < 55  you can;t donate blood ");
			}		
		}
		catch(AgeException ref)
		{
			System.out.println(ref);
		}		
	}
} 

class Main {
	
	public static void main(String args[])
	{
		int age = Integer.parseInt(args[0]);
		int weight = Integer.parseInt(args[1]);
		BLClass  ob = new BLClass();
		ob.check(age,weight);
	}
}