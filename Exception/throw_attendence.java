class AttendenceException extends Throwable{

	public AttendenceException(){}
	
	public AttendenceException(String msg)
	{
		super(msg);
	}
}
class BL {
	
	public void check(int atd)
	{
		try
		{
			if(atd<0)
				throw new AttendenceException("  < 0 is invalid Attendence");
			
			else if(atd>100)
				throw new AttendenceException("  > 100 Attendence is Invalid");
			else if(atd<75)
				throw new AttendenceException("you can't give Exam Attendance < 75");
		
			System.out.println("Excllent...    Attendece is : "+atd);
		}
	catch(AttendenceException ref)
	{
		System.out.println(ref);
	}	
	}
}

class Main {
	public static void main(String []args)
	{
		int atd = Integer.parseInt(args[0]);
		
		BL ob = new BL();
		
		ob.check(atd);
	}
	
}