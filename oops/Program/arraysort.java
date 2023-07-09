import java.util.Scanner;
class ArraySort
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
			System.out.print(this.a[i]+" ");
		}					
	}	
	public void bubbleSort()
	{
		for(int i=0;i<this.len; i++)
		{
			for(int j=0; j<this.len-1-i;j++)
			{
				if(this.a[j]>this.a[j+1])
				{
					int temp = this.a[j+1];
					this.a[j+1]=this.a[j];
					this.a[j]=temp;
				}
			}
		} 	
	}
	public void insertionSort()
	{
		Scanner sc = new Scanner(System.in); 
		int temp=0,j,i;
		System.out.println("Enter new Element");
		for(i=0;i<this.len;i++)
		{
			this.a[i]=sc.nextInt();
			temp=this.a[i];
			for(j=i-1; j>=0 && this.a[j]>temp; j--)
			{
				 this.a[j+1]= this.a[j];	 
			}
			this.a[j+1]=temp;
		}			
	}
	public void selectionSort()
	{
		for(int i=0;i<this.len;i++)
		{
			int min = a[i];
			int pos=i;
			for(int j=i+1; j<this.len; j++)
			{
				if(this.a[j]<min)
				{
					min=this.a[j];
					pos=j;
				}
			}
			this.a[pos]=this.a[i];
			this.a[i]=min;
		}	
	}
}
class Test
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in); 
		ArraySort ob = new ArraySort();
		System.out.println("how many Element want you enter ");
		int len = sc.nextInt();
		ob.setData(len);
		ob.inputArray();
		int ch;
		do{
			System.out.println("\nyour choises are..");
			System.out.println("\t1 for Show Array\n\t2 for BubbleSort ");
			System.out.println("\t3 for InsertionSort\n\t4 SelectionSort");
			System.out.println("\t5 for Exit");
			System.out.println("Enter your choice...");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					ob.showArray();
				break;	
				
				case 2:
					ob.bubbleSort();
				break;

				case 3:
					ob.insertionSort();
				break;
					
				case 4:
					ob.selectionSort();
				break;				
			}
			
		}while(ch!=5);
	}
}