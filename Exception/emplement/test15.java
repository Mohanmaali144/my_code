class Test
    {
        public static void main(String args[]) 
        {
            int i,sum=10;
		   try 
            {
                for (i = -1; i < 5 ;i++)
                   sum = (sum / i);
            }
            catch(ArithmeticException ref) 
            {
				System.out.println("0");        	
            } 
			System.out.println("-------------------------");
			
            System.out.println(sum);
        }
    }