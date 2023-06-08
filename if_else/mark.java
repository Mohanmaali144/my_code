
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
						System.out.println("Fail in all subject");
					else
						System.out.println("Fail in Four subject\nPhysic\nChemistry\nMath\nHindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in Four subject\nPhysics\nChemistry\nMath\nEnglish");
					else
						System.out.println("Fail in Three subject\nPhysics\nChemistry\nMath");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in Four subject\nPhysics\nChemistry\nHindi\nEnglish");
					else
						System.out.println("Fail in Four subject\nPhysics\nChemistry\nHindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in Three subject\nPhysics\nChemistry\nEnglish");
					else
						System.out.println("Fail in Two subject\nPhysics\nChemistry");
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
						System.out.println("Fail in Four subject\nPhysics\nMath\nHindi\nEnglish");
					else
						System.out.println("Fail in THREE subject\nPhysics\nMath\nHindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in THREE subject\nPhysics\nMath\nEnglish");
					else
						System.out.println("Fail in TWO subject Physics\nMath");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in THREE subject\nPhysics\nHindi\nEnglish");
					else
						System.out.println("Fail in two subject\nPhysics\nHindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in TWO subject\nPhysics\nEnglish");
					else
						System.out.println("Fail in ONE Subject\nPhysics");
				} 
		
			}//end m

	
	} //C END
}//first if

else /* else p block */
 {
	if(c<33)/*C*/
	{
		if(m<33)/*m*/
			{
				if(h<33)/*h*/
				{
					if(e<33)
						System.out.println("Fail in Four Subject\nChemistry\nMath\nHindi\nEnglish");
					else
						System.out.println("Fail in THREE = C,M,H");				
				}
				else /*h*/
				{
					if(e<33)
						System.out.println("Fail in THREE subject\nChemistry\nMath\nEnglish");
					else
						System.out.println("Fail in TWO Subject\nChemistry\nMath");
				}
			}
			else /*m*/
			{
			if(h<33)/*h*/
				{
					if(e<33)
						System.out.println("Fail in THREE Subject\nChemistry\nHindi\nEnglish");
					else
						System.out.println("Fail in TWO subject\nChemistry\nHindi");
					
				
				}
				else /*h*/
				{
					if(e<33)
						System.out.println("Fail in TWO Subject\nChemistry\nEnglish");
					else
						System.out.println("Fail in ONE\nChemistry");
				} 
		
			}/*end m*/
	}
	else /*C*/ 
	{
		if(m<33)/*m*/
			{
				if(h<33)/*h*/
				{
					if(e<33)
						System.out.println("Fail in THREE subject\nMath\nHndi\nEnglish");
					else
						System.out.println("Fail in TWO subject\nMath\nHindi");
					
				
				}
				else /*h*/
				{
					if(e<33)
						System.out.println("Fail in TWO subject\nMath\nEnglish");
					else
						System.out.println("Fail in ONE subject\nMath");
				}
			}
			else /*m*/
			{
			if(h<33)/* h*/
				{
					if(e<33)
						System.out.println("Fail in TWO subject\nHindi\nEnglish");
					else
						System.out.println("Fail in ONE subject\nHindi");
					
				
				}
				else /* h */
				{
					if(e<33)
						System.out.println("Fail in ONE subject\nEnglish");
					
					else   /*total*/				
					{
						int total = p+c+m+h+e;
						double per=total/5.0;

							if(per>=60)
							{
							System.out.println("pass in first Division");
							}
							else
							{
								if(per>=45)
								{
									System.out.println("pass in Second Division");
								}
								else
								{
									if(per>=33)
									{
										System.out.println("pass in Third Division");	
									}	
									else
									{
										System.out.println("---- FAIL ----");
									}
								}
							}
	
							
					}  /*  else of total  */
				}/* h*/ 
		
			}/*  m block end*/

	
	} /*C block end*/
	  
  }/*P block End*/
	
}
}