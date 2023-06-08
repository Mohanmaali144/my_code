/*task 06_____28/04/2023
  mini calculator */
  
import java.util.Scanner;
class Test
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter first number:  ");
	int num1 = sc.nextInt();
	
	System.out.println("Enter operator:  ");
	char op = sc.next().charAt(0);
	
	System.out.println("Enter second number:  ");
	int num2 = sc.nextInt();
	
	if(op=='+' || op=='-' || op=='/' || op=='*')
	{ 
     
	 if(op=='+')
	 {
		System.out.println(num1+" + "+num2+" = "+(num1+num2)); 
	 }
	 	  
	else if(op=='-')
	 {
		System.out.println(num1+" - "+num2+" = "+(num1-num2)); 
	 }
	 
	 else if(op=='*')
	 {
		System.out.println(num1+" * "+num2+" = "+(num1*num2)); 
	 }
	 
	 else if(op=='/')
	 {
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
         int re = num1%num2;
        System.out.println("remainder:  "+re);		 
	 }
				
	}
	else
	{
		System.out.println("Invalid operator....!!"); 
	}
	
}
}