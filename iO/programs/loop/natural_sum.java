import java.io.*;
import java.util.Scanner;
class Natural
{
	public static void main(String[]arg)throws IOException
	{
		Scanner sc = new Scanner(System.in);

		File fobj = new File("natural.txt");
		FileOutputStream fos = new FileOutputStream(fobj);
				
		System.out.println("Enter any number number:   ");
		int n = sc.nextInt();
		int sum =0;
		int i=1;
			System.out.print("Sum of naturel is: ");
			while(i<=n)
			{	
				sum=sum+i;
				System.out.print(i);
				String s = Integer.toString(i);
				byte arr[]=s.getBytes();
				fos.write(arr);
				if(i!=n)
				 {
					 fos.write(43);//+
				 }			 
				 i++;
				}
				System.out.print(" = "+sum);
				String s = Integer.toString(sum);
				byte arr[]=s.getBytes();
				fos.write(61);
				fos.write(arr);
				fos.close();
			}
}