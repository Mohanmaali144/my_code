//user difine Exeption  ---- ----

 class InvalidCostException extends Exception{

	public InvalidCostException(){}
	
	public InvalidCostException(String msg)
	{
		super(msg);
	}
} 
class BLClass {
	
	public void check(int cost, int shel)
	{	
		try{		
			if(cost<0)
			{
				throw new InvalidCostException(" invalid cost ");
			}
			else if(shel<0)
			{
				throw new InvalidCostException("invalid Shel ");
			}
			else if (cost>shel)
			{
				throw new InvalidCostException("shell will should be greater to Cost ");
			}
			int p = shel-cost;
			System.out.println("profit is: "+p);
		}
		catch(InvalidCostException ref)
		{
			System.out.println(ref);
		}		
	}
} 
class Main {
	
	public static void main(String args[])
	{		
		int cost= Integer.parseInt(args[0]);
		int shel= Integer.parseInt(args[1]);
		BLClass  ob = new BLClass();	
		ob.check(cost,shel);
	}
}