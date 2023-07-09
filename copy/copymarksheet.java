/*creat a marksheet*/


import java.util.*;
import java.util.Scanner;

class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);
/*------------------------------------------------*/
int roll,year;
String corse,name,fname,mname,branch,sem;

	System.out.println("Enter Your name");
	name=sc.next();
	
	System.out.println("Enter Your Father name");
	fname=sc.next();
	
	System.out.println("Enter Your Mother Name");
	mname=sc.next();
	
	System.out.println("Enter Course name");
	corse=sc.next();
	
	System.out.println("Enter Roll number");
	roll=sc.nextInt();
	
	System.out.println("Enter Your Branch name");
	branch=sc.next();
	
	System.out.println("Enter Your Sem");
	sem=sc.next();
	
	System.out.println("Enter Year");
	year=sc.nextInt();
	

/*------------------------------------------------*/

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
/*--------------------------------------------------------------*/

	System.out.println("|-------------------------------------------------------------------------|");
	
	System.out.println("|\t\t\t\tRGPV BHOPAL                               |");
	System.out.println("|\tRoll  : "+roll+"\t\t\t\t\tCourse : "+corse+"      |");
	System.out.println("|\tName  : "+name+"\t\t\t\t\tBranch : "+branch+"  |");	
	System.out.println("|\tFName : "+fname+"\t\t\t\t\tSem    : "+sem+"      |");
	System.out.println("|\tMName : "+mname+"\t\t\t\t\tYear   : "+year+"     |");
	System.out.println("|\t\t\t\t\t\t\t\t\t  |");
	System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    |");
	System.out.println("|\tBSC101       physics        100            33            "+p+"       |");
	System.out.println("|\tBSC102       chemestr       100            33            "+c+"       |");
	System.out.println("|\tBSC103       Mathes         100            33            "+m+"       |");
	System.out.println("|\tBSC104       Hindi          100            33            "+h+"       |");
	System.out.println("|\tBSC105       English        100            33            "+e+"       |");
	System.out.println("|\t\t\t\t\t\t\t\t\t  |");
	System.out.println("|\t\t\t\t\t\t\t\t\t  |");
	System.out.println("|\t\t\t\t\t\t\t\t\t  |");

/*------------------------------------------------------------*/
if(p<33)
{
	if(c<33)//C
	{
		if(m<33)//m
			{
				if(h<33)//h
				{
					if(e<33)
						System.out.println("  Fail in all subject");
					else
						System.out.println("  Fail in Four subject\n  Physic\n  Chemistry\n  Math\n  Hindi");			
				}
				else //h
				{
					if(e<33)
						System.out.println("  Fail in Four subject\n  Physics\n  Chemistry\n  Math\n  English");
					else
						System.out.println("  Fail in Three subject\n  Physics\n  Chemistry\n  Math");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("  Fail in Four subject\n  Physics\n  Chemistry\n  Hindi\n  English");
					else
						System.out.println("  Fail in Four subject\n  Physics\n Chemistry\n  Hindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("  Fail in Three subject\n  Physics\n  Chemistry\n  English");
					else
						System.out.println("  Fail in Two subject\n  Physics\n  Chemistry");
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
						System.out.println("  Fail in Four subject\n  Physics\n  Math\n  Hindi\n  English");
					else
						System.out.println("  Fail in THREE subject\n  Physics\n  Math\n  Hindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("  Fail in THREE subject\n  Physics\n  Math\n  English");
					else
						System.out.println("  Fail in TWO subject\n  Physics\n  Math");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("  Fail in THREE subject\n  Physics\n  Hindi\n  English");
					else
						System.out.println("  Fail in two subject\n  Physics\n  Hindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("  Fail in TWO subject\n  Physics\n  English");
					else
						System.out.println("  Fail in ONE Subject\n  Physics");
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
						System.out.println("  Fail in Four Subject\n  Chemistry\n  Math\n  Hindi\n  English");
					else
						System.out.println("  Fail in THREE\n  Chemistry\n  Math\n  Hindi");				
				}
				else /*h*/
				{
					if(e<33)
						System.out.println("  Fail in THREE subject\n  Chemistry\n  Math\n  English");
					else
						System.out.println("  Fail in TWO Subject\n  Chemistry\n Math");
				}
			}
			else /*m*/
			{
			if(h<33)/*h*/
				{
					if(e<33)
						System.out.println("  Fail in THREE Subject\n  Chemistry\n  Hindi\n  English");
					else
						System.out.println("  Fail in TWO subject\n  Chemistry\n  Hindi");
					
				
				}
				else /*h*/
				{
					if(e<33)
						System.out.println("  Fail in TWO Subject\n  Chemistry\n  English");
					else
						System.out.println("  Fail in ONE subject\n  Chemistry");
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
						System.out.println("  Fail in THREE subject\n  Math\n  Hndi\n  English");
					else
						System.out.println("  Fail in TWO subject\n  Math\n  Hindi");
					
				
				}
				else /*h*/
				{
					if(e<33)
						System.out.println("  Fail in TWO subject\n  Math\n  English");
					else
						System.out.println("  Fail in ONE subject\n  Math");
				}
			}
			else /*m*/
			{
			if(h<33)/* h*/
				{
					if(e<33)
						System.out.println("  Fail in TWO subject\n  Hindi\n  English");
					else
						System.out.println("  Fail in ONE subject\n  Hindi");
					
				
				}
				else /* h */
				{
					if(e<33)
						System.out.println("  Fail in ONE subject\n  English");
					
					else   /*total*/				
					{
						int total = p+c+m+h+e;
						double per=total/5.0;
						System.out.println("|    your Total mark is:  "+total+"\t\t\t\t\t\t  |");
						System.out.println("|    your Persentage is:  "+per+"\t\t\t\t\t\t  |");
 
							if(per>=60)
							{
							System.out.println("|    pass in first Division\t\t\t\t\t\t  |");
							}
							else
							{
								if(per>=45)
								{
									System.out.println("|     pass in Second Division\t\t\t\t\t\t  |");
								}
								else
								{
									if(per>=33)
									{
										System.out.println("|     pass in Third Division\t\t\t\t\t\t  |");	
									}	
									else
									{
										System.out.println("---- FAIL ----");
									}
								}
							}
	
							
					}  /*  else block end,, of total  */
				}/* h*/ 
		
			}/*  m block end*/

	
	} /*C block end*/
	  
  }/*P block End*/
	
System.out.println("|-------------------------------------------------------------------------|");
}
}