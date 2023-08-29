//user difine Exeption  ---- mark check ----

 class MarkException extends Exception{

	public MarkException(){}
	
	public MarkException(String msg)
	{
		super(msg);
	}
} 
class BLClass {
	
	public void check(int mark)
	{	
		try{		
			if(mark<0)
			{
				throw new MarkException("mark is < 0 is invalid ... ");
			}
			else if(mark>100)
			{
				throw new MarkException("mark is > 100 is invalid");
			}
			System.out.println("continue.........");
						
		}
		catch(MarkException ref)
		{
			System.out.println(ref);
		}		
	}
} 
class Main {
	
	public static void main(String args[])
	{		
		int mark= Integer.parseInt(args[0]);
		BLClass  ob = new BLClass();	
		ob.check(mark);
	}
}