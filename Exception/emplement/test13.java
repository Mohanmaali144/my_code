class Test {

	public static void main(String args[])
	{
		int a[] = new int [5];
		
		int i=0,j=0;
		try
		{
			for(i=0;i<args.length;i++)
			{
				a[i] = Integer.parseInt(args[i]);			
			}
		}
		catch (ArrayIndexOutOfBoundsException ref)
		{
			System.out.println("Element is greater then 5");
		}
		catch (NumberFormatException ref)
		{
			System.out.println("diffrent value ");
		}
		catch (Exception ref)
		{
			System.out.println(" "+ref);
		}
		for(j=0; j<i; j++)
		{
			System.out.println(a[j]);			
		}
		System.out.println("---------------------------------------");	
	}
}