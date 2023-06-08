import java.util.Scanner;
class Operator
{
   public static void main(String[]arg)
   {
	Scanner sc = new Scanner (System.in);
	
	
   System.out.println("\n\tchoice are..");
   System.out.println("\n\tpress 1 for Arithmetic operator ");
   System.out.println("\n\tpress 2 for Area...");
   System.out.println("\n\tpress 3 for Volume ...");
     
	System.out.println("\nEnter choice...");   
   int ch = sc.nextInt();
   
  double l,w,h,area,r,a,b,re,v;
  switch(ch)
  {
	  case 1:
	  
	     System.out.println("\tchoice Are :");
		 System.out.println("\npress + for additon:");
		 System.out.println("press - for substraction:");
		 System.out.println("press * for multiplication:");
		 System.out.println("press / for divide:");
		 System.out.println("press % for modulas:");
		 System.out.println("\nEnter your choice:");
          
		  char ch2 = sc.next().charAt(0);		 
		 switch(ch2)
	   {     	           	   
			case '+':
			System.out.println("Enter two numbers: ");
			 a = sc.nextDouble();
			 b = sc.nextDouble();
			 re = a+b;
			System.out.println("Addition = "+re);
			break;
					
			case '-':		
			System.out.println("Enter two numbers: ");
			 a = sc.nextDouble();
			 b = sc.nextDouble();
			 re = a-b;
			System.out.println("Substraction = "+re);
			break;
			
			case '*':
			System.out.println("Enter two numbers: ");
			 a = sc.nextDouble();
			 b = sc.nextDouble();
			 re = a*b;
			System.out.println("Substraction = "+re);
			break;
			
			case '/':
			
			 System.out.println("Enter two numbers: ");
			 a = sc.nextDouble();
			 b = sc.nextDouble();
			 re = a/b;
			 System.out.println("Division  = "+re);
			break;	
		
			case '%':
			System.out.println("Enter two numbers: ");
			 a = sc.nextDouble();
			 b = sc.nextDouble();
			 re = a%b;
			System.out.println("Modulas  = "+re);
			break;
			default: 
			  System.out.println("invalid choice...");
	    }
		break;
	case 2:
		 System.out.println("\tchoice Are :");
		 System.out.println("\npress 1 for recatngle:");
		 System.out.println("press 2 for circle:");
		 System.out.println("press 3 for base area of cone:");
		 System.out.println("press 4 for cylinder:");
		 System.out.println("\nEnter your choice:");
         int ch3 = sc.nextInt();
	       
		  switch(ch3)
		  {	
			case 1:
			
			System.out.print("Enter lenth: " );
			l = sc.nextDouble();
			System.out.println("Enter width: ");
			w = sc.nextDouble();
			area = l*w;
			System.out.println("Area of rectangle : "+area);
			break;
			
			case 2:				
			System.out.println("Enter redius: " );
			r = sc.nextInt();
			area = 3.14f*(r*r);
			System.out.print("Area of circle : "+area);
			break;
			
			case 3:
			System.out.println("Enter redius of cone: " );
			r = sc.nextDouble();
			area = 3.14f *(r*r);
			System.out.println("Base area of cone : "+area);
			break;
			
			case 4:
			System.out.println("Enter radius: " );
			r = sc.nextDouble();
			area = 2*3.14f*r+2*3.14f*(r*r);
			System.out.println("Area of cylinder : "+area);
			break;
			
			default:
			System.out.println("invalid choice...!!!");		
		  }
		  break;
	case 3:
		 System.out.println("\tchoice Are :");
		 System.out.println("\npress 1 for recatngle:");
		 System.out.println("press 2 for cone:");
		 System.out.println("press 3 for cylinder:");
		 System.out.println("\nEnter your choice:");
         int ch4 = sc.nextInt();
		 
		switch(ch4)  
		{ 
		case 1:
	    System.out.println("Enter Lenth of rectengal");
		l = sc.nextDouble();
		System.out.println("Enter with of rectengal");
		w = sc.nextDouble();
		System.out.println("Enter hight of rectengal");
		h = sc.nextDouble();
		v=l*w*h;
		System.out.println("volume of rectangle:  "+v);
		break;
		
		case 2:
		   System.out.println("Enter Radius: ");
			r = sc.nextDouble();
			System.out.println("Enter Height: ");
			h = sc.nextDouble();
		    v = (1/3) *3.14f * (r*r)*h ;
			System.out.println("vlume of cone : "+v);
			break;
			
		case 3:
            System.out.println("Enter Radius: ");
			r = sc.nextDouble();

			System.out.println("Enter Height: ");
			h = sc.nextDouble();
		    v=3.14f*(r*r)*h;
			System.out.println("volume of cylinder : "+v);
			break;	

			default:
				System.out.println("invalid choice...!!!");
        }
		break;	

    default:
	 System.out.println("invalid choice...!!!");
  }
   
  
   }
}