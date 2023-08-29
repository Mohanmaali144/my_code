//user difine Exeption  ---- valid mobile number ----

 class NumberException extends Exception{

	public NumberException(){}
	
	public NumberException(String msg)
	{
		super(msg);
	}
} 
class MainClass {
	
	public static void main(String []args)
	{	
		try{
			String phone = args[0];
			System.out.println(phone);	
				
			if(phone.length()!=10 )
			{
				throw new NumberException(" Number will be shoud in 10 digit");
			}
			else if(phone.charAt(0)!='9' && phone.charAt(0)!='8'&& phone.charAt(0)!='7'&&phone.charAt(0)!='6')
			{
				throw new NumberException(" Not a Indian number ");
			}
			
			for(int i=0;i<phone.length(); i++)
			{
				if( phone.charAt(i)<48 ||  phone.charAt(i)>57)
				{	
					throw new NumberException(" Not a Mobile number ");
				}				
			}
			
			System.out.println("+91"+phone);
			System.out.println("  :is valid number");
		}	
			catch(NumberException ref)
			{
				System.out.println(ref);
			}
	}
} 