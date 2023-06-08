simport java.util.Scanner;
 class Marksheet
 {
 public static void main(String args[])
 {
 Scanner sc= new Scanner(System.in);
 
 System.out.println("Enter a Roll"); 
 String Roll = sc.nextLine();
 System.out.println("Enter a Course");
 String course = sc.nextLine();
 System.out.println("Enter a Name");
 String name = sc.nextLine();
 System.out.println("Enter a Branch");
 String Branch = sc.nextLine();
 System.out.println("Enter a FName");
 String FName = sc.nextLine();
 System.out.println("Enter a Sem");
 String Sem = sc.nextLine();
 System.out.println("Enter a MName");
 String MName = sc.nextLine();
 System.out.println("Enter a year");
 int year = sc.nextInt();
 System.out.println("Enter your marks in Physics");
 int p = sc.nextInt();
 System.out.println("Enter your marks in Chemistry");
 int c = sc.nextInt();
 System.out.println("Enter your marks in Maths");
 int m =sc.nextInt();
 System.out.println("Enter your marks in Hindi");
 int h = sc.nextInt();
 System.out.println("Enter your marks in English");
 int e =sc.nextInt();
 System.out.println("\t\t\t\t\tRGPV-BHOPAL\t\t\t\t");
 System.out.println("Roll\t:"+Roll+ "\t\t\t\t\t\t Course:"+course);
 System.out.println("Name\t:"+name+ "\t\t\t\t\t\t Branch:"+Branch);
 System.out.println("FName\t:"+FName+ "\t\t\t\t\t\t Sem:"+Sem);
 System.out.println("MName\t:"+MName+ "\t\t\t\t\t\t year:"+year);
 System.out.println("\n\t\tSubCode   SubName      MaxMark      MinMark     ObtMarks   status");
 System.out.println("\t\tCSE-501     Physics        100           33       "+p             );
 if(p<33)
 System.out.println("Pass");
 else
 System.out.println("Fail");
 System.out.println("\t\tCSE-502     Chemistry      100           33       "+c             );
 if(c<33)
 System.out.println("Pass");
 else
 System.out.println("Fail");
 System.out.println("\t\tCSE-503     Mahts          100           33       "+m             );
 if(m<33)
 System.out.println("Pass");
 else
 System.out.println("Fail");
 System.out.println("\t\tCSE-504     Hindi          100           33       "+h            );
 if(h<33)
 System.out.println("Pass");
 else
 System.out.println("Fail");
 System.out.println("\t\tCSE-505     English        100           33       "+e             );
 if(e<33)
 System.out.println("Pass");



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
						System.out.println("Fail in Four \nPhysics,Chemistry,Maths,Hindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in Four \nPhysics,Chemistry,Maths,English");
					else
						System.out.println("Fail in Three \n Physics,Chemistry,Maths");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in Four\nPhysics,Chemistry,Hindi,English");
					else
						System.out.println("Fail in Four \n Physics,Chemistry,Hindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in Three \n Physics,Chemistry,English");
					else
						System.out.println("Fail in Two \n Physics,Chemistry");
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
						System.out.println("Fail in Four\nPhysics,Maths,Hindi,English");
					else
						System.out.println("Fail in THREE \nPhysics,Maths,Hindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in THREE\n Physics,Maths,English");
					else
						System.out.println("Fail in TWO \n Physics,Maths");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in THREE\nPhysics,Hindi,English");
					else
						System.out.println("Fail in WO \nPhysics,Hindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in TWO \n Physics,English");
					else
						System.out.println("Fail in ONE\n Physics");
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
						System.out.println("Fail in Four\nChemistry,Math,Hindi,English");
					else
						System.out.println("Fail in Three\nChemisrty,Math,Hindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in Three \n Chemistry,Math,English");
					else
						System.out.println("Fail in Two \n Chemistry,Math");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in Three\nChemisrty,Hindi,English");
					else
						System.out.println("Fail in Two \nChemisrty,Hindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in Two\nChemisrty,English");
					else
						System.out.println("Fail in one\n Chemisrty");
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
						System.out.println("Fail in Three\nMaths,Hindi,English");
					else
						System.out.println("Fail in Two \n Maths,Hindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in Three \nMaths,English");
					else
						System.out.println("Fail in One\n Maths");
				}
			}
			else //m
			{
			if(h<33)//h
				{
					if(e<33)
						System.out.println("Fail in Two\nHindi,English");
					else
						System.out.println("Fail in One \nHindi");
					
				
				}
				else //h
				{
					if(e<33)
						System.out.println("Fail in one \n English");
                                      else
                                      {
                                                    int total =p+c+m+h+e;
                                                    int per=total/5;
                                                    System.out.println("total="+total);
    			                             System.out.println("per="+per);
    			                             if(per>=60)
    			                             {
    			                             System.out.println("pass in 1st division");
    			                             }
    			                               else
    			                               {
    			                                    if(per>=45)
    			                                    {
    			                                       System.out.println("pass in 2nd division");
    			                                    }
    			                                    else
    			                                    {
    			                                       if(per>=33)
    			                                       {
    			                                       System.out.println("pass in 3rd division");
    			                                       }
    			                                       else
    			                                       System.out.println("........Fail.....");
    			                                    }
    			                               
    			                               } 
    			                 }                 
    			          }                        
}
}
}
}
}
 
