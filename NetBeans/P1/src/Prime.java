import java.util.Scanner;
public class Prime {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        Operation ob = new Operation();
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        ob.prime(n);
    }
}
