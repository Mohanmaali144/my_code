import java.util.Scanner;

class Count {
		
		public static int countChar(String s1,char a)
		{
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				count=0;
				for(int j=0; j<s1.length();j++)
				{
					if(a==s1.charAt(j))
						count++;
				}
				
			}
			return count;
		}
 }

class Main {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s1 =sc.nextLine();
		
		System.out.println("Enter  seaching charecter ");
		char a = sc.next().charAt(0);
		System.out.println(Count.countChar(s1,a));
	}
}