
import java.util.Scanner;

class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter physics number:   ");
int p = sc.nextInt(); 

System.out.println("Enter chemistry number:   "); 
int c = sc.nextInt(); 

System.out.println("Enter math number:   ");
int m = sc.nextInt(); 

System.out.println("Enter hindi number:   ");
int h = sc.nextInt();

System.out.println("Enter english number:   ");
int e = sc.nextInt();



if(p<33)
{
	if(c<33)//C
	{
		if(m<33)//m
			{
				if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in all");
					else
						System.out.println("Fail in Four = P,C,M,H");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in Four == P,C,M,E");
					else
						System.out.println("Fail in Three = P,C,M");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in Four==P,C,H,E");
					else
						System.out.println("Fail in Four = P,C,H");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in Three == P,C,E");
					else
						System.out.println("Fail in Two = P,C");
				} 
		
			}//end m
	}
	else // C
	{
		if(m<33)//m
			{
				if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in Four==P,M,H,E");
					else
						System.out.println("Fail in THREE = P,M,H");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in THREE == P,M,E");
					else
						System.out.println("Fail in TWO = P,M");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in THREE==P,H,E");
					else
						System.out.println("Fail in WO = P,H");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in TWO == P,E");
					else
						System.out.println("Fail in ONE = P");
				} 
		
			}//end m

	
	} //C END
}//first if

else // p// else
  {
	if(c<33)//C
	{
		if(m<33)//m
			{
				if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in Four==C,M,H,E");
					else
						System.out.println("Fail in THREE = C,M,H");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in THREE == C,M,E");
					else
						System.out.println("Fail in TWO = C,M");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in THREE==C,H,E");
					else
						System.out.println("Fail in TWO = C,H");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in TWO == C,E");
					else
						System.out.println("Fail in ONE = C");
				} 
		
			}//end m
	}
	else // C
	{
		if(m<33)//m
			{
				if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in THREE==M,H,E");
					else
						System.out.println("Fail in TWO = M,H");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in TWO == M,E");
					else
						System.out.println("Fail in ONE = M");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in TWO==H,E");
					else
						System.out.println("Fail in ONE = H");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in ONE == E");
					
				} 
		
			}//end m

	
	} //C END  
	  
  }



}
}