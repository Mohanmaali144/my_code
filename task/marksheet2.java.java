/*creat  a marksheet2 of five subject  using ef else and all operater*/

import java.util.Scanner;
class Test
{
public static void main(String[]arg)
{
Scanner sc = new Scanner(System.in);
/*-----------------------------------------------------*/
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

if(p<33&&m<33&&c<33&&h<33&&e<33)
{
	System.out.println("Fail in all Subject");
}

else if((p<33||m<33||c<33||h<33)||(p<33||m<33||c<33||e<33)||(p<33||m<33||h<33||e<33)||(p<33||c<33||h<33||e<33)||(m<33||c<33||h<33||e<33))  
{
	     /*First*/
		if(p<33&&m<33&&c<33&&h<33)	
		{
			System.out.println("Fail in Four Subject:\nphysic,math,chemistry,hindi");
		}
		/*--------------------*/
		else if((p<33||m<33||c<33)||(p<33||m<33||h<33)||(p<33||c<33||h<33)||(c<33||m<33||h<33))
		{
			if(p<33&&m<33&&c<33)
			{
				System.out.println("Fail in Three Subject:\nphysic,math,chemistry");
			}			
			
			/*first of first*/
			else if(p<33&&m<33&&c<33)
			{
				System.out.println("Fail in three Subject physics,math,chemistry");
			}

			else if((p<33&&m<33)||(p<33&&c<33)||(m<33&&c<33))
			{
				if(p<33&&m<33)		
					System.out.println("Fail in physics and math");
		
				else if(p<33&&c<33)
					System.out.println("Fail in physics and chemistry");
		
				else 
				System.out.println("Fail in Math and chemistry");
			}

			else if(p<33||m<33||c<33)
			{
				if(p<33)
					System.out.println("Fail in physics ");
				else if(c<33)
					System.out.println("Fail in Chemistry ");
	
				else
					System.out.println("Fail in math ");
			/*end-- first of first*/
			}	
		
		} /*first End*/
		
		
		/*-------------second-----------------*/
		
       else if(p<33&&m<33&&c<33&&e<33)	
		{
			System.out.println("Fail in Four Subject:\nphysic,math,chemistry,english");
		}
		/*--------------------*/
		else if((p<33||m<33||c<33)||(p<33||m<33||e<33)||(p<33||c<33||e<33)||(c<33||m<33||e<33))
		{
			if(p<33&&m<33&&c<33)
			{
				System.out.println("Fail in Three Subject:\nphysic,math,chemistry");
			}
			
			
			/*first of second*/
			else if(p<33&&m<33&&c<33)
			{
				System.out.println("Fail in three Subject physics,math,chemistry");
			}

			else if((p<33||m<33)||(p<33||c<33)||(m<33||c<33))
			{
				if(p<33&&m<33)		
					System.out.println("Fail in physics and math");
		
				else if(p<33&&c<33)
					System.out.println("Fail in physics and chemistry");
		
				else 
				System.out.println("Fail in Math and chemistry");
			}

			else if(p<33||m<33||c<33)
			{
				if(p<33)
					System.out.println("Fail in physics ");
				else if(c<33)
					System.out.println("Fail in Chemistry ");
	
				else
					System.out.println("Fail in math ");
			/*end-- first of first*/
			}	
		
		} /*second End*/


       /* -------------third start--------------- */
	   else if(p<33&&m<33&&h<33&&e<33)	
		{
			System.out.println("Fail in Four Subject:\nphysic,math,hindi,english");
		}
		/*--------------------*/
		else if((p<33||m<33||h<33)||(p<33||m<33||e<33)||(p<33||h<33||e<33)||(h<33||m<33||e<33))
		{
			if(p<33&&m<33&&h<33)
			{
				System.out.println("Fail in Three Subject:\nphysic,math,hindi");
			}
			
			
			/*first of third*/
			else if(p<33&&m<33&&h<33)
			{
				System.out.println("Fail in three Subject physics,math,hindi");
			}

			else if((p<33||m<33)||(p<33||h<33)||(m<33||h<33))
			{
				if(p<33&&m<33)		
					System.out.println("Fail in physics and math");
		
				else if(p<33&&h<33)
					System.out.println("Fail in physics and hindi");
		
				else 
				System.out.println("Fail in Math and hindi");
			}

			else if(p<33||m<33||h<33)
			{
				if(p<33)
					System.out.println("Fail in physics ");
				else if(h<33)
					System.out.println("Fail in hindi");
	
				else
					System.out.println("Fail in math ");
			/*end-- first of third*/
			}	
		
		} 
       /*-------------third end-------------*/
	   
	     /*-------------fourth start-------------*/
		 else if(p<33&&c<33&&h<33&&e<33)	
		{
			System.out.println("Fail in Four Subject:\nphysic,chemistry,hindi,english");
		}
		/*--------------------*/
		else if((p<33||c<33||h<33)||(p<33||c<33||e<33)||(p<33||h<33||e<33)||(h<33||c<33||e<33))
		{
			if(p<33&&c<33&&h<33)
			{
				System.out.println("Fail in Three Subject:\nphysic,chemistry,hindi");
			}
			
			
			/*first of fourt*/
			else if(p<33&&c<33&&h<33)
			{
				System.out.println("Fail in three Subject physics,chemistry,hindi");
			}

			else if((p<33||c<33)||(p<33||h<33)||(c<33||h<33))
			{
				if(p<33&&c<33)		
					System.out.println("Fail in physics and chemistry");
		
				else if(p<33&&h<33)
					System.out.println("Fail in physics and hindi");
		
				else 
				System.out.println("Fail in chemistry and hindi");
			}

			else if(p<33||c<33||h<33)
			{
				if(p<33)
					System.out.println("Fail in physics ");
				else if(h<33)
					System.out.println("Fail in hindi");
	
				else
					System.out.println("Fail in chemistry ");
			/*end-- first of fourth*/
			}	
		
		} 
		 
		 /*-------------fourth end-------------*/
	    
		 /*-------------fifth Start-------------*/
		 
		 else if(m<33&&c<33&&h<33&&e<33)	
		{
			System.out.println("Fail in Four Subject:\nmath,chemistry,hindi,english");
		}
		/*--------------------*/
		else if((m<33||c<33||h<33)||(m<33||c<33||e<33)||(m<33||h<33||e<33)||(h<33||c<33&&e<33))
		{
			if(m<33&&c<33&&h<33)
			{
				System.out.println("Fail in Three Subject:\nmath,chemistry,hindi");
			}
			
			
			/*first of fifth*/
			else if(m<33&&c<33&&h<33)
			{
				System.out.println("Fail in three Subject math,chemistry,hindi");
			}

			else if((m<33||c<33)||(m<33||h<33)||(c<33||h<33))
			{
				if(m<33&&c<33)		
					System.out.println("Fail in math and chemistry");
		
				else if(m<33&&h<33)
					System.out.println("Fail in math and hindi");
		
				else 
				System.out.println("Fail in chemistry and hindi");
			}

			else if(m<33||c<33||h<33)
			{
				if(m<33)
					System.out.println("Fail in math ");
				else if(h<33)
					System.out.println("Fail in hindi");
	
				else
					System.out.println("Fail in chemistry ");
			/*end-- first of fifth*/
			}	
		
		} 
		 
		 /*-------------fifth end-------------*/
}

	}
}