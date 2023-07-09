import java.util.Scanner;
class ArrayOp
{
	private int a[];
	private int len;
	public void setData(int len)
	{	
		this.a= new int[10];
		this.len = len	;
	}
	public int len()
	{
		return a.length;
	}
	public void inputArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element in Array");
		for(int i=0; i<this.len; i++)
		{
			this.a[i]=sc.nextInt();
		}
	}
	public void showArray()
	{
		System.out.println("\nArray Element are..");
		for(int i=0; i<this.len; i++)
		{
			System.out.print(a[i]+" ");
		}					
	}
	public void ascending()
	{	 	
		for(int i=0; i<this.len; i++)
		{
			for(int j=i+1; j<this.len; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
						a[i] = a[j];
						a[j]= temp;
				}
			}
		}					
	}
	public void descending()
	{	 	
		for(int i=0; i<this.len; i++)
		{
			for(int j=i+1; j<this.len-1; j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
						a[i] = a[j];
						a[j]= temp;
				}
			}
		}					
	}
	
	public int maxEle()
	{
		int max = this.a[0];
		for(int i=0;i<this.len; i++)
		{
			if(this.a[i]>max)
			{
				max=this.a[i];
			}
		}
		return max;
	}
	public int minEle()
	{
		int min =this.a[0];
		for(int i=0;i<this.len; i++)
		{
			if(this.a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	
	public int sMax(ArrayOp ob)
	{
		int max=ob.maxEle();
		int smax=0;		
		for(int i=0; i<this.len; i++)
		{
			if(this.a[i]>max)
			{
				smax=max;
				max=this.a[i];
			}
			else if(a[i]>smax && a[i]<max)
			{
				smax=a[i];
			}
		}
		return smax;
	}
	public int sMin(ArrayOp ob)
	{
		int min=maxEle() ; //ob.minEle();
		int smin=0;		
		for(int i=0; i<this.len; i++)
		{
			if(this.a[i]<min)
			{
				smin=min;
				min=this.a[i];
			}
			else if(a[i]<smin && a[i]>min)
			{
				smin=a[i];
			}
		}
		return smin;
	}
	public int sumEle()
	{
		int sum=0;
		for(int i=0;i<this.len;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public void reverse()
	{
		for(int i=0; i<this.len/2; i++)
		{
			int temp= this.a[i];
			this.a[i]= this.a[this.len-i-1];	
			this.a[this.len-i-1]=temp;		 	
		}			
	}
	public void under(int s1,int s2)
	{
		System.out.print("Element are: ");
		for(int i=0; i<this.len; i++)		
		{
			if(this.a[i]>=s1 && this.a[i]<=s2)
					System.out.print(this.a[i]+" ");	
		}			
	}
	public void printOdd()
	{	
		System.out.print("\nOdd Element are: ");
		for(int i=0;i<this.len;i++)
		{ 
			if(this.a[i]%2!=0)
				System.out.print(this.a[i]+" ");
		}
	}
	public void printEven()
	{	
		System.out.print("\nEven Element are: ");
		for(int i=0;i<this.len;i++)
		{ 
			if(this.a[i]%2==0)
			System.out.print(this.a+" ");
		}
	}
}
class Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in); 
		ArrayOp ob = new ArrayOp();
		System.out.println("how many Element want you enter ");
		int len = sc.nextInt();
		ob.setData(len);
		
		System.out.println("Array is Empty");
		int ch;
		do{
			System.out.println("\nyour choises are..");
			System.out.println("\t1 for insert Element");
			System.out.println("\t2 for show Array\n\t3 for Ascending array");
			System.out.println("\t4 for Descending Array\n\t5 for a Max Element");
			System.out.println("\t6 for Min Element Array\n\t7 for secondMax");
			System.out.println("\t8 for SecondMin Element \n\t9 for sum Element");
			System.out.println("\t10 for reverse Element \n\t11 for print Element under given range ");
			System.out.println("\t12 for print even Element \n\t13 for print odd Element");			
			System.out.println("\t14 for Exit");
			System.out.println("Enter your choice...");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
				 ob.inputArray();
				break;
				case 2:
					ob.showArray();
				break;
				case 3:
					ob.ascending();
				break;
				case 4:
					ob.descending();
				break;
				case 5:
					System.out.println("Max = "+ob.maxEle());
				break;
				case 6:
					System.out.println("Min = "+ob.minEle());
				break;
				case 7:
					System.out.println("SMax = "+ob.sMax(ob));
				break;
				case 8:
					System.out.println("SMin = "+ob.sMin(ob));
				break;
				case 9:
					System.out.println("Sum = "+ob.sumEle());
				break;
				case 10:
					ob.reverse();
				break;	
				case 11:
					System.out.println("Enter a satrting  range");
					int s1 = sc.nextInt();
					System.out.println("Enter a Ending range");
					int s2 = sc.nextInt();
					ob.under(s1,s2);
				break;
				case 12:
					ob.printEven();
				break;
				case 13:
					ob.printOdd();
				break;				
			}
		}while(ch!=14);
	}
}