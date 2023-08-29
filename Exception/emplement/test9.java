// Exception - check valid and invalid argument 
// Eficiant
class Main {

	public static void main(String args[])
	{
		
		int a[] = new int [40];
		int count =0;
		int j,i;
		for(i=0,j=0; i<a.length && i<args.length; i++) {
			
			try
			{
				 a[i] = Integer.parseInt(args[i]); 
				j++;
			}		
			
			catch(ArrayIndexOutOfBoundsException ref)
			{
				System.out.println(ref.getMessage());
			}
			
			catch (NumberFormatException ref)
			{
				count++;
			}
		}
		System.out.println("invalid = "+count);
		System.out.println("valid = "+j);
	}
}