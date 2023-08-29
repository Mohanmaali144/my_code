class A
{  
    public static void main(String [] args) 
    {

        System.out.println("O");
		
		try{
			throw new Exception();
		}
		catch(Exception ref)
		{
			System.out.println("kamal");
		}
		
    }  

}