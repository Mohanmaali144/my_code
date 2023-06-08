
// 

import java.util.Scanner;

class Max
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first num");
		int n = sc.nextInt();
		
		System.out.println("Enter second num");
		int x = sc.nextInt();
				
		int max = Math.max(n,x);
		System.out.println("max num is: "+max);
	}
}


class Min
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first num");
		int n = sc.nextInt();
		
		System.out.println("Enter second num");
		int x = sc.nextInt();
				
		int min = Math.min(n,x);
		System.out.println("Min num is: "+min);
	}
}



class sqr
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num");
		int n = sc.nextInt();
				
		double sqr = Math.sqrt(n);
		System.out.println("sqr is : "+sqr);
	}

}




class Abs
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num");
		int n = sc.nextInt();
				
		int absulet = Math.abs(n);
		System.out.println("absulet value is : "+absulet);
	}
}


class Random
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
				
		int random =(int)(Math.random()*6+1 );
		System.out.println("rendom num is: "+random);
	}
}


class Floor
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num");
		double n = sc.nextDouble();
		
		double floor = Math.floor(n);
		System.out.println("floor num is: "+floor);
	}
}


class FloorDiv
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num");
		int x = sc.nextInt();
		
		System.out.println("Enter num");
		int y = sc.nextInt();
		
		int floor = Math.floorDiv(x,y);
		System.out.println("floor num is: "+floor);
	}
}


class Rint
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num");
		double x = sc.nextDouble();
		
		double rint = Math.rint(x);
		System.out.println("floor num is: "+rint);
	}
}


class Power
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first num");
		int n = sc.nextInt();
		
		System.out.println("Enter no of power");
		int x = sc.nextInt();
				
		int pow =(int)( Math.pow(n,x));
		System.out.println("power: "+pow);
	}
}

class Hypot
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first num");
		int n = sc.nextInt();
		
		System.out.println("Enter no of power");
		int x = sc.nextInt();
				
		int hp =(int)( Math.hypot(n,x));
		System.out.println("Hypot: "+hp);
	}
}


