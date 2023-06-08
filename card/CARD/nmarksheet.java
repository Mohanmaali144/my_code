import java.util.Scanner;
 class Test
 {
 public static void main(String args[])
 {
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter any time");
 int total,per,i=1;
 int n=sc.nextInt();
 sc.nextLine();
 
 while(i<=n)
 {
 
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
 System.out.println("----------------------------------------------------------------------");
 System.out.println("\t\t\t\tRGPV-BHOPAL\t\t\t\t                                           ");
 System.out.println("----------------------------------------------------------------------");
 System.out.println("Roll\t:"+Roll+ "\t\t\t\t\t\t Course:"+course);
 System.out.println("Name\t:"+name+ "\t\t\t\t\t Branch:"+Branch);
 System.out.println("FName\t:"+FName+ "\t\t\t\t\t Sem:"+Sem);
 System.out.println("MName\t:"+MName+ "\t\t\t\t\t year:"+year);
 System.out.println("----------------------------------------------------------------------");
 System.out.println("\n\tSubCode  SubName      MaxMark      MinMark  ObtMarks   status");
 System.out.print("\tCSE-501    Physics        100           33       "+p );
 if(p>33)
 System.out.println("  \tPass");
 else
 System.out.println("  \tFail");
 System.out.print("\tCSE-502    Chemistry      100           33       "+c);
 if(c>33)
 System.out.println("  \tPass");
 else
 System.out.println("  \tFail");
 System.out.print("\tCSE-503    Mahts          100           33       "+m);
 if(m>33)
 System.out.println("  \tPass");
 else
 System.out.println("  \tFail");
 System.out.print("\tCSE-504    Hindi          100           33       "+h);
 if(h>33)
 System.out.println("  \tPass");
 else
 System.out.println("  \tFail");
 System.out.print("\tCSE-505    English        100           33       "+e);
 if(e>33)
 System.out.println("  \tPass");
 else
 System.out.println("  \tFail");
 System.out.println("-------------------------------------------------------------------");
 
 
  if(p<33&c<33&&m<33&&h<33&&e<33)
  {
  
    System.out.println("Fail in all subject");
  }
   else if((p<33&&c<33&&m<33&&h<33)||(p<33&&c<33&&m<33&&e<33)||(c<33&&m<33&&e<33&&h<33)
           ||(m<33&&p<33&&e<33&&h<33)||(h<33&&e<33&&p<33&&c<33)){
       
      if(p<33&&c<33&&m<33&&h<33)
            System.out.println("Fail in four subject \n physics \n chemistry \nmaths \nhindi");
      else if(p<33&&c<33&&m<33&&e<33)
            System.out.println("Fail in four subject \n physics \n chemistry \nmaths \nenglish");
      else if(c<33&&m<33&&e<33&&h<33)
            System.out.println("Fail in four subject  \n chemistry \nmaths \nenglisg \n hindi");   
      else if(m<33&&p<33&&e<33&&h<33)
            System.out.println("Fail in four subject  \n maths \nphysics \nenglish \n hindi");
      else 
            System.out.println("Fail in four subject  \nhindi \nenglish \nphysics \n chemistry");
     
     
    }
  
      else if((p<33&&c<33&&m<33)||(p<33&&c<33&&h<33)||(p<33&&h<33&&e<33)||(m<33&&c<33&&h<33)||(m<33&&h<33&&e<33)||
              (c<33&&h<33&&e<33)||(e<33&&m<33&&c<33)||(e<33&&m<33&&p<33)||(p<33&&m<33&&h<33)||(p<33&&c<33&&e<33)){
      
         if(p<33&&c<33&&m<33)
               System.out.println("Fail in Three subject \nphysic \nchemisry \nmaths");
        else if(p<33&&c<33&&h<33)
               System.out.println("Fail in Three subject \nphysic \nchemistry \nhindi");
        else if(p<33&&h<33&&e<33)
               System.out.println("Fail in Three subject \nphysic \nhindi \nenglish");
        else if(m<33&&c<33&&h<33)
               System.out.println("Fail in Three subject \nmath \nchemistry \nhindi");
        else if(m<33&&h<33&&e<33)
               System.out.println("Fail in Three subject \nmath \nhindi \nenglish");
        else if(c<33&&h<33&&e<33)
               System.out.println("Fail in Three subject \nchemistry \nhindi \nenglish");
        else if(e<33&&m<33&&c<33)
               System.out.println("Fail in Three subject \nenglish \nmath \nchemistry ");
        else if(e<33&&m<33&&p<33)
               System.out.println("Fail in Three subject \nenglish \nmath \nphysic");
        else if(p<33&&m<33&&h<33)
               System.out.println("Fail in Three subject \nphysic \nmaths \nhindi");
        else 
               System.out.println("Fail in Three subject \nphysic \nchemistry \nenglish");
      
      
        } else if((p<33&&c<33)||(p<33&&m<33)||(p<33&&h<33)||(p<33&&e<33)||(c<33&&m<33)
                ||(c<33&&h<33)||(c<33&&e<33)||(m<33&&h<33)||(m<33&&e<33)||(h<33&&e<33)){
       
           if(p<33&&c<33)
                 System.out.println("Fail in Two subject \nphysic \nchemistry ");
          else if(p<33&&m<33)
                 System.out.println("Fail in Two subject \nphysic \nmath ");
          else if(p<33&&h<33)
                 System.out.println("Fail in Two subject \nphysic \nhindi");
          else if(p<33&&e<33)
                 System.out.println("Fail in Two subject \nphysic \nenglish");
          else if(c<33&&m<33)
                 System.out.println("Fail in Two subject \nchemistry \nmath");
          else if(c<33&&h<33)
                 System.out.println("Fail in Two Subject \nchemistry \nenglish");
          else if(c<33&&e<33)
                 System.out.println("Fail in Two subject \nchemistry \nenglish ");
          else if(m<33&&h<33)
                 System.out.println("Fail in Two subject \nmath \nhindi");
          else if(m<33&&e<33)
                 System.out.println("Fail in Two subject \nmath \nenglish");
          else 
                 System.out.println("Fail in Two subject\nhindi \nenglish");
       
       
          }else if((p<33)||(c<33)||(m<33)||(h<33)||(e<33)){
               if(p<33)
                    System.out.println("Fail in one subject \nphysic");
              else if(c<33) 
                    System.out.println("Fail in one subject \nchemistry");
              else if(m<33)
                    System.out.println("Fail in one subject \nmath");
              else if(h<33) 
                    System.out.println("Fail in one subject \nhindi");
              else if(e<33) 
                    System.out.println("Fail in one subject \nenglish") ;
                    
                      }else
                                      {
                                                    total =p+c+m+h+e;
                                                     per=total/5;
                                                    System.out.println("total="+total);
    			                             System.out.println("per="+per);
    			    System.out.println("----------------------------------------------------------------------------------------");
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
            i++;
            sc.nextLine();
        }
                              
					
	}
					
	}				
	
   

