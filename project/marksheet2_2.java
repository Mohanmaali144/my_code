/*Complete 21/05/2023*/

/*using loop */

import java.util.Scanner;
class Marksheet2_2
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);
/*-----------------------------------------------------*/
int roll,year,p,m,c,h,e;
String corse,name,fname,mname,branch,sem;

	System.out.println("Enter Your name");
	name=sc.nextLine();
	
	System.out.println("Enter Your Father name");
	fname=sc.nextLine();
	
	System.out.println("Enter Your Mother Name");
	mname=sc.nextLine();
	
	System.out.println("Enter Course name");
	corse=sc.nextLine();
	
	System.out.println("Enter Roll number");
	roll=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Your Branch name");
	branch=sc.nextLine();
	
	System.out.println("Enter Your Sem");
	sem=sc.nextLine();
	
	System.out.println("Enter Year");
	year=sc.nextInt();
	//sc.nextInt();   continue...
/*-----------------do while  START-----------------------*/	
	do{	
		System.out.println("Enter physics number:   ");
		p = sc.nextInt(); 
		if(p<0||p>100)	
		{
			System.out.println("Invalid mark Of physics..!!\nPleas re enter mark..");
		}
    }while(p<0||p>100);
		
	do{
		System.out.println("Enter chemistry number:   "); 
		c = sc.nextInt();
		if(c<0||c>100)	
		{
			System.out.println("Invalid mark Of chemistry..!!\nPleas re enter mark..");
		}
	}while(c<0||c>100);
	
    do{
	System.out.println("Enter math number:   ");
	m = sc.nextInt();
      if(m<0||m>100)	
		{
			System.out.println("Invalid mark Of math..!!\nPleas re enter mark..");
		}	
	 }while(m<0||m>100);
	do{	 
	System.out.println("Enter hindi number:   ");
	h = sc.nextInt();
	if(h<0||h>100)	
		{
			System.out.println("Invalid mark Of Hindi..!!\nPleas re enter mark..");
		}	
    }while (h<0||h>100);
	
	 do{	
	System.out.println("Enter english number:   ");
	e = sc.nextInt();
	if(e<0||e>100)	
		{
			System.out.println("Invalid mark Of English..!!\nPleas re enter mark..");
		}			
	}while(e<0||e>100);
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
	System.out.println("|\tBSC101       physics        100            33            "+p+"       ");
	System.out.println("|\tBSC102       chemestry       100            33            "+c+"       ");
	System.out.println("|\tBSC103       Mathes         100            33            "+m+"       ");
	System.out.println("|\tBSC104       Hindi          100            33            "+h+"       ");
	System.out.println("|\tBSC105       English        100            33            "+e+"       ");
	System.out.println("|\t\t\t\t\t\t\t\t\t  ");
	System.out.println("|\t\t\t\t\t\t\t\t\t  ");
	System.out.println("|\t\t\t\t\t\t\t\t\t  ");
/*------------------------------------------------------------*/	
if(p<33&&m<33&&c<33&&h<33&&e<33)
{ 
    System.out.println("|\t\t\t\t\t\tStatus: | FAIL");  /*continue.....*/
	System.out.println("|\tFail in all Subject");
}

else if((p<33&&c<33&&m<33&&h<33)||(p<33&&m<33&&h<33&&e<33)||(p<33&&h<33&&e<33&&c<33)||(p<33&&e<33&&c<33&&m<33)||(c<33&&m<33&&h<33&&e<33))
{    

		
	System.out.println("|\t\t\t\t\t\tStatus: | FAIL"); 
		

	if(p<33&&c<33&&m<33&&h<33)
		System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\thindi");
	
	else if(p<33&&m<33&&h<33&&e<33)
		System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");
	
	else if(p<33&&h<33&&e<33&&c<33)
		System.out.println("\tFail in four Subject:\n\tphysics\n\tchemistry\n\thindi\n\tEnglish");
	
	else if(p<33&&e<33&&c<33&&m<33)
		System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");
	
	else if(c<33&&m<33&&h<33&&e<33)
		System.out.println("|\tFail in four Subject:\n\tchemistry\n\tmath\n\thindi\n\tEnglish");
}

else if((p<33&&m<33&&c<33)||(p<33&&c<33&&h<33)||(p<33&&m<33&&h<33)||(c<33&&m<33&&h<33)||(p<33&&c<33&&e<33)||
(m<33&&h<33&&e<33)||(c<33&&h<33&&e<33)||(p<33&&h<33&&e<33)||(e<33 &&m<33&&c<33)||(p<33&&m<33&&e<33))
{     
    System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
	
	if(p<33&&m<33&&c<33)
			System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tchemistry ");
	
	else if(p<33&&c<33&&h<33)
			System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\thindi");
		
	else if(p<33&&m<33&&h<33)
			System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\thindi ");
		
	else if(c<33&&m<33&&h<33)
			System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\tmath\n|\thindi ");	
			
	else if(p<33&&c<33&&e<33)
			System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\tenglish ");	
	
	else if(m<33&&h<33&&e<33)
			System.out.println("|\tFail in three Subject:\n|\tmath\n|\thindi\n|\tenglish ");	
	
	else if(c<33&&h<33&&e<33)
			System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\thindi\n|\tenglish ");
	
	else if(p<33&&h<33&&e<33)
			System.out.println("|\tFail in three Subject:\n|\tphysics\n|\thindi\n|\tenglish ");
	
	else if(e<33 &&m<33&&c<33)
			System.out.println("|\tFail in three Subject:\n|\tmath\n|\tchemistry\n|\tenglish  ");
		
	else if(p<33&&m<33&&e<33)
			System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tenglish  ");	
	
}

else if((p<33&&m<33)||(p<33&&c<33)||(p<33&&h<33)||(p<33&&e<33)||
(m<33&&c<33)||(m<33&&h<33)||(m<33&&e<33)||(c<33&&h<33)||(c<33&&e<33)||(h<33&& e<33))
{
	 System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");
	 
	if(p<33&&m<33)
		System.out.println("|\tFail in two subject:\n|\tphysics\n|\tmath");
	
	else if(p<33&&c<33)	
		 System.out.println("|\tFail in two subject:\n|\tphysics\n|\tchemistry");
	
	else if(p<33&&h<33)	
		 System.out.println("|\tFail in two subject:\n|\tphysics\n|\thindi");
	 
	else if(p<33&e<33)	
		 System.out.println("|\tFail in two subject:\n|\tphysics\n|\tEnglish");
	 
	else if(m<33&c<33)	
		 System.out.println("|\tFail in two subject:\n|\tmath\n|\tchemistry");
	 
	else if(m<33&h<33)	
		 System.out.println("|\tFail in two subject:\n|\tmath\n|\thindi");
	 
	else if(m<33&e<33)	
		 System.out.println("|\tFail in two subject:\n|\tmath\n|\tenglish");
	 
	else if(c<33&h<33)	
		 System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tHindi");
	 
	else if(c<33&e<33)	
		 System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tenglish");
	 
	else if(h<33&e<33)	
		 System.out.println("|\tFail in two subject:\n|\tHindi\n|\tenglish");
}


else if(p<33||m<33||c<33||h<33|e<33)
{      System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");

	if(p<33)
		System.out.println("|\tFail in one subject\n|\tphysics");
	else if(m<33)
		System.out.println("|\tFail in one subject\n|\\tmath");
	else if(c<33)
		System.out.println("|\tFail in one subject\n|\tchemistry");
	else if(h<33)
		System.out.println("|\tFail in one subject\n|\thindi");
	else if(e<33)
		System.out.println("|\tFail in one subject\n|\tEnglish");
	
} /*COMPLETE*/

/*ELSE BLOCK-----   COUNT TOTAL PERSENTAGE*/
else
{
int total = p+c+m+h+e;
		double per=total/5.0;
		if(p>=33&&c>=33&&m>=33&&h>=33&&e>33)
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
}
}