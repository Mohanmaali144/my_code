import java.io.*;
import java.util.Scanner;
class Cube {
	
	public void cube()throws FileNotFoundException, IOException,Exception
	{
		Scanner sc = new Scanner(System.in);
		File fobj = new File("cube.txt");
		FileOutputStream fos = new FileOutputStream(fobj);
		System.out.println("Enter any number:   ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x<=100)
		{	
			int i=1,cube=1;
			while(i<=y)
			{		 
			 cube = cube*x;			
			i++;
			}	
			String s=Integer.toString(cube);
			byte arr[]= s.getBytes();
			fos.write(arr);
			fos.write(32);
			fos.flush();
			x++;
		}
		fos.close();
	}
}
class Main{
	
	public static void main(String args[])throws Exception
	{
		Cube ob = new Cube();		
		ob.cube();
	}
}