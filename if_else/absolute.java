/*Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1*/

import java.util.Scanner;
class Absolute
{
	public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	
	if(num>=0)
	{
	  
	  System.out.println("absolute value is  "+num);
	  
	}
	else
	{
	   num = ~num;  
	   num = num+1;
	   System.out.println("absolute value is  "+num);
	}
	
	
	}}