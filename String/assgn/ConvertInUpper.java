import java.util.Scanner;

class Upper {
	
	public static String convertInUpper(String s1)
	{
		String z="";
		for (int i=0; i<s1.length();i++)
		{	
			int s = 0;
			char a = s1.charAt(i);
			if((s1.charAt(i))>=97&&(s1.charAt(i)<=122))
			{	
				s =((s1.charAt(i))-32);
				a = (char) (s);		//type casting	
			}
				z =z+a;		
		}
		return z;
	}
}

class Client {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s1 = sc.nextLine();	
		System.out.println(Upper.convertInUpper(s1));
		
	}
	
}