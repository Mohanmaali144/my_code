// stack overflow



class Main {

	
	public  static int stack(int count)
	{
		count++;
		System.out.println(count);
		Main.stack(count);
		
		return count;
	}
	
	
	public static void main (String args[])
	{
		int count=0;
		Main.stack(count);
		
	}
}