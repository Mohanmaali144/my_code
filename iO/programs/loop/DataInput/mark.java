import java.io.*;
import java.util.Scanner;
class Main {
	 public static void main(String args[]) throws IOException
	 {
		File fobj = new File("stdData.txt");
		FileOutputStream fos = new FileOutputStream(fobj,true);
		
		
		Scanner sc = new Scanner(System.in);
		String s = "roll     |       name        |      mark";
		
		fos.write(s.getBytes());
		fos.write(10);
		fos.close();
		
		FileOutputStream fos2 = new FileOutputStream(fobj,true);
		//DataOutputStream dos = new DataOutputStream(fos2);
		//int roll = 104;
		
		for(int i =1 ; i<=1;i++)
		{	
			int roll  = sc.nextInt();
			s = roll+"            Mohan              80";
			fos2.write(s.getBytes());
		}
			
		System.out.println("file saved");
		fos2.close();
		
		FileInputStream fis = new FileInputStream(fobj);
		DataInputStream dos = new DataInputStream(fis);
		System.out.println(dos.readInt());
	 }
}