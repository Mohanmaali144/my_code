//uncomplete

class Test extends Object {

	void finalize()
		{
			System.out.println("finalize");
		} 
	
	public static void main(String args[])
	{
		Test ob = new Test();
		ob.finalize();
	}

}