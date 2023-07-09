import java.util.Scanner;
class Hcf
{
	private int n1 ,n2;
	public void setData(int n1,int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}

	public int hcf()
	{
		n1=this.n1;
		n2=this.n2;
		while(n1!=n2)
		{
			if(n1<n2)
			{
				n2=n2-n1;
			}
			else
			{
				n1=n1-n2;
			}
		}
	   int hcf=n1;
	  return hcf;
	}	
}
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:   ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number:   ");
		int n2 = sc.nextInt();
		Hcf ob = new Hcf();
		ob.setData(n1,n2);
		System.out.println(ob.hcf());		
	}
}