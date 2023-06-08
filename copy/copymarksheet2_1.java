/*creat  a marksheet2 of five subject  using ef else and all operater*/

import java.util.Scanner;
class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);
/*-----------------------------------------------------*/
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
	
	
/*-------------------------------------------------*/

if((p<0||p>100)||(m<0||m>100)||(c<0||c>100)||(h<0||h>100)||(e<0||e>100))
 {
	 System.out.println("invalid mark......\n pleas Enter Again.. this is last time");
	/*-------------------re enter___1__--------------------------------------*/
System.out.println("Enter physics number:   ");
 p = sc.nextInt(); 

System.out.println("Enter chemistry number:   "); 
 c = sc.nextInt(); 

System.out.println("Enter math number:   ");
 m = sc.nextInt(); 

System.out.println("Enter hindi number:   ");
 h = sc.nextInt();

System.out.println("Enter english number:   ");
 e = sc.nextInt();
	
	
/*-------------------------------------------------*/

if((p<0||p>100)||(m<0||m>100)||(c<0||c>100)||(h<0||h>100)||(e<0||e>100))
 {
	/*-------------------re enter___1__--------------------------------------*/
	
	 System.out.println("invalid mark.... !!.....");
	
	/*-------------------re enter___1__---end-----------------------------------*/
	
 }

	
	
else{
	

	System.out.println("|-------------------------------------------------------------------------|");
	
	System.out.println("|\t\t\t\tRGPV BHOPAL                               ");
	System.out.println("|\tRoll  : "+roll+"\t\t\t\t\tCourse : "+corse+"      ");
	System.out.println("|\tName  : "+name+"\t\t\t\t\tBranch : "+branch+"  ");	
	System.out.println("|\tFName : "+fname+"\t\t\t\t\tSem    : "+sem+"      ");
	System.out.println("|\tMName : "+mname+"\t\t\t\t\tYear   : "+year+"     ");
	System.out.println("|");
	System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    ");
	System.out.println("|\tBSC101       physics        100            33            "+p+"       ");
	System.out.println("|\tBSC102       chemestr       100            33            "+c+"       ");
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
	 System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
	 
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
{      System.out.println("|\t\t\t\t\t\tStatus: | FAIL");

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
	else
	{
	  
		

	}
	
	
}
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
	  System.out.println("| \n");						
      System.out.println("|-------------------------------------------------------------------------|");
						
		

}
}
	
	/*-------------------re enter___1__---end-----------------------------------*/
	
	
 }

	
	
else{
	

	System.out.println("|-------------------------------------------------------------------------|");
	
	System.out.println("|\t\t\t\tRGPV BHOPAL                               ");
	System.out.println("|\tRoll  : "+roll+"\t\t\t\t\tCourse : "+corse+"      ");
	System.out.println("|\tName  : "+name+"\t\t\t\t\tBranch : "+branch+"  ");	
	System.out.println("|\tFName : "+fname+"\t\t\t\t\tSem    : "+sem+"      ");
	System.out.println("|\tMName : "+mname+"\t\t\t\t\tYear   : "+year+"     ");
	System.out.println("|");
	System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    ");
	System.out.println("|\tBSC101       physics        100            33            "+p+"       ");
	System.out.println("|\tBSC102       chemestr       100            33            "+c+"       ");
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
	 System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
	 
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
{      System.out.println("|\t\t\t\t\t\tStatus: | FAIL");

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
	else
	{
	  
		

	}
	
	
}
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
     System.out.println("| \n");
									
     System.out.println("|-------------------------------------------------------------------------|");

}
}



}
}