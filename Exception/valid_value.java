// Exception - check valid and invalid argument 
class Main {

	public static void main(String args[])
	{
		
		int a[] = new int [40];
		int count =0;
		int count2 = 0;
		
		for(int i=0; i<args.length; i++) {
			
			try
			{
				 a[i] = Integer.parseInt(args[i]); 
				count++;
			}
			catch (NumberFormatException ref)
			{
				count2++;
			}
		}
		System.out.println("valid = "+count);
		System.out.println("invalid = "+count2);
	}
}