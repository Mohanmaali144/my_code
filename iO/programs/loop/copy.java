import java.io.*;

class Main {

	public static void main(String args[] )throws IOException
	{
		File fobj = new File("f2.txt");	
		FileInputStream fos = new FileinputStream("cube.txt");
		FileOututStream f = new FileOutputStream(fobj);
		
		int m;
		
		while(true)
		{
			m = fos.read();
			if(m==-1)
				break;
			
			f.write(m);
		}
		
	}
}