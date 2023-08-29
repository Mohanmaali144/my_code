import java.util.Scanner;
import java.io.*;

class MaxArray {
	
	
	public void maxElement()throws IOException
	{
		File fobj = new File("maxElement.txt");
		FileOutputStream fos = new FileOutputStream(fobj);
		
		int arr[] = {1,2,3,4,5};
		char ch[] = arr.toCharArray();
		fos.write(ch);
		fos.flush();
		fos.close();
		
	}
}
class Main {
	
	public static void main(String args[])
	{
		MaxArray ob = new MaxArray();
		ob.maxElement();
	}
}