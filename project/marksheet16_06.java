/*complete   22/05/2023*/
/*creat  a marksheet2 of five subject  using ef else and all operater*/
/*array*/

  /*physics  : 0
	chemistry: 1
	math     : 2
	hindi    : 3
	english  : 4
	*/
import java.util.Scanner;
class CopyAMark
{
	public static void main(String[]arg)
	{
			Scanner sc = new Scanner(System.in);
			/*-----------------------------------------------------*/
			int roll,year;
			int mark[]= new int [5];    
			String corse,name,fname,mname,branch,sem;
			 System.out.println("how many marksheet :  ");
			 int i=0,n=sc.nextInt();
			 int a[]= new int[n];
		   boolean z;
		while(i<n)
		{ 	    sc.nextLine();
				System.out.println("Enter Your name");
				name=sc.nextLine();
				
				System.out.println("Enter Your Father name");
				fname=sc.nextLine();
				
				System.out.println("Enter Your Mother Name");
				mname=sc.nextLine();
				
				System.out.println("Enter Course name");
				corse=sc.nextLine();
				do{
				System.out.println("Enter Roll number");
				roll=sc.nextInt();
				sc.nextLine();
				 z = false; 
				a[i]=roll;
				
				for(int j=0; j<i; j++)
			    if(roll==a[j])
				{
					System.out.println("roll number alredy added\n");
					 z=true;
				}
				}while(z);
					
				System.out.println("Enter Your Branch name");
				branch=sc.nextLine();
				
				System.out.println("Enter Your Sem");
				sem=sc.nextLine();
				
				System.out.println("Enter Year");
				year=sc.nextInt();
			/*-----------------do while  START-----------------------*/	
				do{	
					System.out.println("Enter physics number:   ");
					mark[0] = sc.nextInt(); 
					if(mark[0]<0||mark[0]>100)	
					{
						System.out.println("Invalid mark Of physics..!!\nPleas re enter mark..");
					}
				}while(mark[0]<0||mark[0]>100);
					
				do{
					System.out.println("Enter chemistry number:   "); 
					mark[1] = sc.nextInt();
					if(mark[1]<0||mark[1]>100)	
					{
						System.out.println("Invalid mark Of chemistry..!!\nPleas re enter mark..");
					}
				}while(mark[1]<0||mark[1]>100);
				
				do{
				System.out.println("Enter math number:   ");
				mark[2] = sc.nextInt();
				  if(mark[2]<0||mark[2]>100)	
					{
						System.out.println("Invalid mark Of math..!!\nPleas re enter mark..");
					}	
				 }while(mark[2]<0||mark[2]>100);
				do{	 
				System.out.println("Enter hindi number:   ");
				mark[3] = sc.nextInt();
				if(mark[3]<0||mark[3]>100)	
					{
						System.out.println("Invalid mark Of Hindi..!!\nPleas re enter mark..");
					}	
				}while (mark[3]<0||mark[3]>100);
				
				 do{	
				System.out.println("Enter english number:   ");
				mark[4] = sc.nextInt();
				if(mark[4]<0||mark[4]>100)	
					{
						System.out.println("Invalid mark Of English..!!\nPleas re enter mark..");
					}			
				}while(mark[4]<0||mark[4]>100);
			/*----DO WHILE END----*/	
			/*-------------------------------------------------*/
				System.out.println("|-------------------------------------------------------------------------|");
				
				System.out.println("|\t\t\t\tRGPV BHOPAL                               ");
				System.out.println("|\tRoll  : "+roll+"\t\t\t\t\tCourse : "+corse+"      ");
				System.out.println("|\tName  : "+name+"\t\t\t\t\tBranch : "+branch+"  ");	
				System.out.println("|\tFName : "+fname+"\t\t\t\t\tSem    : "+sem+"      ");
				System.out.println("|\tMName : "+mname+"\t\t\t\t\tYear   : "+year+"     ");
				System.out.println("|");
				System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    ");
				System.out.println("|\tBSC101       physics        100            33            "+mark[0]+"       ");
				System.out.println("|\tBSC102       chemestr       100            33            "+mark[1]+"       ");
				System.out.println("|\tBSC103       Mathes         100            33            "+mark[2]+"       ");
				System.out.println("|\tBSC104       Hindi          100            33            "+mark[3]+"       ");
				System.out.println("|\tBSC105       English        100            33            "+mark[4]+"       ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
			/*------------------------------------------------------------*/	
			if(mark[0]<33&&mark[1]<33&&mark[2]<33&&mark[3]<33&&mark[4]<33)
			{ 
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL");  /*continue.....*/
				System.out.println("|\tFail in all Subject");
			}
				/*uncompete*/
			else if((mark[0]<33&&mark[1]<33&&mark[2]<33&&mark[3]<33)||(mark[0]<33&&mark[2]<33&&mark[3]<33&&mark[4]<33)||(mark[0]<33&&mark[3]<33&&mark[4]<33&&mark[1]<33)||(mark[0]<33&&mark[4]<33&&mark[1]<33&&mark[2]<33)||(mark[1]<33&&mark[2]<33&&mark[3]<33&&mark[4]<33))
			{    // continue...

					
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL"); 
					

				if(mark[0]<33&&mark[2]<33&&mark[1]<33&&mark[3]<33)
					System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\thindi");
				
				else if(mark[0]<33&&mark[2]<33&&mark[3]<33&&mark[4]<33)
					System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");
				
				else if(mark[0]<33&&mark[3]<33&&mark[4]<33&&mark[1]<33)
					System.out.println("\tFail in four Subject:\n\tphysics\n\tchemistry\n\thindi\n\tEnglish");
				
				else if(mark[0]<33&&mark[4]<33&&mark[1]<33&&mark[2]<33)
					System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");
				
				else if(mark[1]<33&&mark[2]<33&&mark[3]<33&&mark[4]<33)
					System.out.println("|\tFail in four Subject:\n\tchemistry\n\tmath\n\thindi\n\tEnglish");
			}

			else if((mark[0]<33&&mark[2]<33&&mark[1]<33)||(mark[0]<33&&mark[1]<33&&mark[3]<33)||(mark[0]<33&&mark[2]<33&&mark[3]<33)||(mark[1]<33&&mark[2]<33&&mark[3]<33)||(mark[0]<33&&mark[1]<33&&mark[4]<33)||
			(mark[2]<33&&mark[3]<33&&mark[4]<33)||(mark[1]<33&&mark[3]<33&&mark[4]<33)||(mark[0]<33&&mark[3]<33&&mark[4]<33)||(mark[4]<33 &&mark[2]<33&&mark[1]<33)||(mark[0]<33&&mark[2]<33&&mark[4]<33))
			{     
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
				
				if(mark[0]<33&&mark[2]<33&&mark[1]<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tchemistry ");
				
				else if(mark[0]<33&&mark[1]<33&&mark[3]<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\thindi");
					
				else if(mark[0]<33&&mark[2]<33&&mark[3]<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\thindi ");
					
				else if(mark[1]<33&&mark[2]<33&&mark[3]<33)
						System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\tmath\n|\thindi ");	
						
				else if(mark[0]<33&&mark[1]<33&&mark[4]<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\tenglish ");	
				
				else if(mark[2]<33&&mark[3]<33&&mark[4]<33)
						System.out.println("|\tFail in three Subject:\n|\tmath\n|\thindi\n|\tenglish ");	
				
				else if(mark[1]<33&&mark[3]<33&&mark[4]<33)
						System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\thindi\n|\tenglish ");
				
				else if(mark[0]<33&&mark[3]<33&&mark[4]<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\thindi\n|\tenglish ");
				
				else if(mark[4]<33 &&mark[2]<33&&mark[1]<33)
						System.out.println("|\tFail in three Subject:\n|\tmath\n|\tchemistry\n|\tenglish  ");
					
				else if(mark[0]<33&&mark[2]<33&&mark[4]<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tenglish  ");	
				
			}

			else if((mark[0]<33&&mark[2]<33)||(mark[0]<33&&mark[1]<33)||(mark[0]<33&&mark[3]<33)||(mark[0]<33&&mark[4]<33)||
			(mark[2]<33&&mark[1]<33)||(mark[2]<33&&mark[3]<33)||(mark[2]<33&&mark[4]<33)||(mark[1]<33&&mark[3]<33)||(mark[1]<33&&mark[4]<33)||(mark[3]<33&& mark[4]<33))
			{
				 System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");
				 
				if(mark[0]<33&&mark[2]<33)
					System.out.println("|\tFail in two subject:\n|\tphysics\n|\tmath");
				
				else if(mark[0]<33&&mark[1]<33)	
					 System.out.println("|\tFail in two subject:\n|\tphysics\n|\tchemistry");
				
				else if(mark[0]<33&&mark[3]<33)	
					 System.out.println("|\tFail in two subject:\n|\tphysics\n|\thindi");
				 
				else if(mark[0]<33&mark[4]<33)	
					 System.out.println("|\tFail in two subject:\n|\tphysics\n|\tEnglish");
				 
				else if(mark[2]<33&mark[1]<33)	
					 System.out.println("|\tFail in two subject:\n|\tmath\n|\tchemistry");
				 
				else if(mark[2]<33&mark[3]<33)	
					 System.out.println("|\tFail in two subject:\n|\tmath\n|\thindi");
				 
				else if(mark[2]<33&mark[4]<33)	
					 System.out.println("|\tFail in two subject:\n|\tmath\n|\tenglish");
				 
				else if(mark[1]<33&mark[3]<33)	
					 System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tHindi");
				 
				else if(mark[1]<33&mark[4]<33)	
					 System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tenglish");
				 
				else if(mark[3]<33&mark[4]<33)	
					 System.out.println("|\tFail in two subject:\n|\tHindi\n|\tenglish");
			}


			else if(mark[0]<33||mark[2]<33||mark[1]<33||mark[3]<33|mark[4]<33)
			{      System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");

				if(mark[0]<33)
					System.out.println("|\tFail in one subject\n|\tphysics");
				else if(mark[2]<33)
					System.out.println("|\tFail in one subject\n|\\tmath");
				else if(mark[1]<33)
					System.out.println("|\tFail in one subject\n|\tchemistry");
				else if(mark[3]<33)
					System.out.println("|\tFail in one subject\n|\thindi");
				else if(mark[4]<33)
					System.out.println("|\tFail in one subject\n|\tEnglish");
				
			} /*COMPLETE*/

			/*ELSE BLOCK-----   COUNT TOTAL PERSENTAGE*/
			else
			{
			int total = mark[0]+mark[1]+mark[2]+mark[3]+mark[4];
					double per=total/5.0;
					if(mark[0]>=33&&mark[1]>=33&&mark[2]>=33&&mark[3]>=33&&mark[4]>33)
					{
						System.out.println("|\t\t\t\t\t\tStatus: | PASS");
					}
					else
					{
						System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
					}  
					System.out.println("|\tTotal mark is:  "+total+"\t\t\t\t\t\t  ");		
					System.out.println("|\tPersentage is:  "+per+"\t\t");
					if(per>=60)
					{
						System.out.println("|\tpass in first Division\t\t\t\t\t\t  ");
					}
					else if(per>=45)
					{
						System.out.println("|\tpass in Second Division\t\t\t\t\t\t  ");
					}
					else if(per>=33)
					{
						System.out.println("|\tpass in Third Division\t\t\t\t\t\t  ");	
					}	
					else
					{
					System.out.println("|\t---- FAIL ----");
					}					
					
					}/*COMPLETE*/

			System.out.println("|-------------------------------------------------------------------------|");
		i++;
		}
	}

}