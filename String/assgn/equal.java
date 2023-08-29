import java.util.Scanner;

class Equal {
	
	public static boolean checkEqual(String s1,String s2)
	{
		int x = s1.length();
		int y = s2.length();
		if(x!=y)
		{
		 return false;
		}
			
		for(int i=0; i < x; i++)
		{
			char a=s1.charAt(i);
			char b=s2.charAt(i);
			if(a!=b)
				return false;
		}
		return true;
	}
}

class Main {

		public static void main(String []args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String s1= sc.next();
			System.out.println("Enter a String");
			String s2= sc.next();
			
			System.out.println(Equal.checkEqual(s1,s2));
		}
	
}