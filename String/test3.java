class Test {

	public static void main(String args[])
	{
	
		String s1 = "kamal";
		
		String s2 = "kamal";
		
		String s3 = new String("kamal");
		
		if(s1==s3)
		{
			System.out.println("true");
		}
		else {
			
			System.out.println("false");
		}
		if(s1.equals(s3))
		{
			System.out.println("true");
		}
		else {
			
			System.out.println("false");
		}
	}

}