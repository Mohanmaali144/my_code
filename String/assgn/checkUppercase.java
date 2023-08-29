
class Client {
	
	public static void main(String args[])
	{
		String s1 = "PaaShi";
		char ch='A';
		String s2="k";
		int s=3;
		for (int i=0; i<=5;i++)
		{
			
			if((s1.charAt(i))>=65&&(s1.charAt(i)<=90))
			{	
				System.out.println(s1.charAt(i));
				s2=(char)((s1.charAt(i))+32);
				System.out.println('t'+32);
			}
			
		}
		System.out.println(s2);
	}
	
}