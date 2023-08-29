//2^1 + 2^2 + 2^3 + 2^4 + 2^5
import java.io.*;
import java.util.Scanner;
class Power1
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		File fobj = new File("pow_series.txt");
		FileOutputStream fos = new FileOutputStream(fobj);
		System.out.println("Enter any number:   ");
		int x = sc.nextInt();

		System.out.println("Enter power:   ");
		int y = sc.nextInt();
		int i=1,power=1,sum=0;
		String s="";
		byte arr[];	
		 while(i<=y)
		 {
			power = power * x;
			s = Integer.toString(x);
			arr= s.getBytes();
			fos.write(arr);
			fos.write(136);
			s = Integer.toString(i);
			arr[]= s.getBytes();
			fos.write(i+48);
			//System.out.print(x+"^"+i);
			sum=sum+power;
			if(i<y) {
				fos.write(53);
			}
			i++;
		 }
		 //System.out.println(" = "+sum);
		  s = Integer.toString(sum);
		arr[]= s.getBytes();
		fos.write(arr);
	  }
   }