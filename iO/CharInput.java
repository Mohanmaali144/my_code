 //char input
import java.io.*;    
class Main {  
 
    public static void main(String[] args) throws IOException{  
        
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));  
 
		System.out.println("Enter a character");
       
	   char c = (char)ob.read();  
       System.out.println(c);  
    }
}  