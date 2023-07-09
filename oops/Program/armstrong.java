// Armstron

import java.util.Scanner;
class Arm
{
	private int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int getData()
	{
		return this.n;
	}
	public void isArmstrong()
	{
		int arm=0,re=0,count=0,pow=1,i=1; 
		int n = this.n;
		while(n>0)
		{
			n=n/10;
			count++;
		}

		n=this.n;

		while(n>0)
		{  
			re = n%10;
			i=1;pow=1;

			while(i<=count)
			{
			pow=pow*re;
			i++;
			}	
			arm=arm+pow;
			n=n/10;	
		}	
		if(arm==this.n)
			System.out.println(" Armstrong");
		else 
			System.out.println(" Not Armstrong");
	}	
}
class Test
{
	public static void main(String args[])
	{
		Arm ob=new Arm();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		ob.setData(n);
		ob.isArmstrong();
		//System.out.println(ob.getData());
	}
}