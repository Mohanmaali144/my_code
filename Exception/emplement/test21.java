 
 class C{
   

	public static void throwit () 
    {
        System.out.println("throwit ");
        //throw new RuntimeException();
    }
	
	
    public static void main(String [] args) 
    {
        try 
        {
            System.out.println("hello ");
            throwit();
        }
        catch (Exception ref ) 
        {
           //System.out.println(ref);
		   System.out.println("catch ");
        }
        finally 
        {
            System.out.println("finally ");
        }
        System.out.println("after ");
    }
}