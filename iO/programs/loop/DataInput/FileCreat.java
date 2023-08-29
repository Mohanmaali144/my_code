// file creat by object type array
import java.io.*;
import java.util.Scanner;
class MyFile {
	
	public static void main(String args[]) throws IOException,NullPointerException
	{
		
		Scanner sc = new Scanner(System.in);	
		File fobj[] = new File[100];			
		int ch=1 ;
		int i=0;
		do{		
			switch(ch)
			{
				case 1:					
					System.out.println("Enter File name");
					String fname = sc.next();
					fobj[i] = new File(fname);
					if(fobj[i].exists())
					{
						System.out.println("File Already Exists !!\n");
					}
					else{
						fobj[i].createNewFile();
						System.out.println("|--  File created  --|\n");
					}
				break;
				case 2:
					break;				
				default:
					System.out.println("Invalid choice");
			}
			i++;
			System.out.println("choice are :");
			System.out.println("1 for creat new file");
			System.out.println("2 for Exit\n");
			System.out.println("Enter choice....");
			ch = sc.nextInt();	
		}while(ch!=2);
		
		FileOutputStream fos[] = new FileOutputStream[100];
		int j=0;
		while(j!=i)
		{
			
			fos[j] = new FileOutputStream(fobj[j]);
			System.out.println("Enter a String ");
			
			sc.nextLine();
			String s = sc.nextLine();
			fos[j].write(s.getBytes());
			fos[j].close();
			j++;
		}
		System.out.println("done...");
	}
}