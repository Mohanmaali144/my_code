//user difine Exeption  ----  ----

 class PrimeException extends Exception{

	public PrimeException(){}
	
	public PrimeException(String msg)
	{
		super(msg);
	}
} 
class BLClass {
	
	public void check(int n)
	{	
		try{		
			if(n<0)
			{
				throw new PrimeException("number is nagative... ");
			}
			else if(n==0)
			{
				throw new PrimeException("0 is not prime");
			}
			for(int i=2; i<n; i++)
			{
				if(n%i==0)
					throw new PrimeException("it is not prime");
			}
	
				System.out.println("prime number");
		}
		catch(PrimeException ref)
		{
			System.out.println(ref);
		}		
	}
} 
class Main {
	
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		
		BLClass  ob = new BLClass();
		ob.check(n);
	}
}