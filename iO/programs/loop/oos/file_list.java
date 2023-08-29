import java.io.*;

class ListName {

	public static void main(String args[])
	{
		File f = new File("D:/java/iO/programs/loop");
		String list[];
		list = f.list();
		
		for(String li :list)
		{
			System.out.println(li);
		}
		
		System.out.println(list.length);
	}
}