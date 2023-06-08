import java.util.Scanner;

class Break10
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);
		
		int i,j;
		
		for(i=5; ;)
		{	
			System.out.println(i++);
			if(i>=25)
				break;				
		}
	}
}

/*
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
*/	