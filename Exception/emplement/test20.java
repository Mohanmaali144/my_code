public class B 
{  
    public static void main(String [] args) 
    {
        try 
        {
            Method();  
            System.out.print("A");  
        } 
        catch (RuntimeException ref) 
        { 
            System.out.print("B"); 
        } 
        catch (Exception ref) 
        { 
            System.out.print("C"); 
        } 
        finally 
        {
            System.out.print("D"); 
        } 
        System.out.print("E"); 
    } 
    public static void Method() 
    { 
        throw new RuntimeException(); 
    } 
}