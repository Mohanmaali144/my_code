
class Handling 
    {
        public static void main(String args[]) 
        {
            try 
            {
                System.out.print("Kamal" + " " + 1 / 0);
            }
            catch(ArithmeticException ref) 
            {
				System.out.print("Lalu");        	
            }
        }
    }