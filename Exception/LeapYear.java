//user difine Exeption  ---- Leap year ----
class LeapYearException extends Exception{

	public LeapYearException(){}
	
	public LeapYearException(String msg)
	{
		super(msg);
	}
}
class MainClass {
	
	public static void main(String []args)
	{	
		try{
			int  year = Integer.parseInt(args[0]);
			if(year%400 ==0 ||(year%4==0 && year%100!=0))
			{
				throw new LeapYearException("Leap Year...");
			}
			else 
			{
				System.out.println("is not leap year");
			}
		}
		catch (LeapYearException ref)
		{
			ref.printStackTrace();
		}
		
	}
} 