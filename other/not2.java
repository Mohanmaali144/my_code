// Count not of given amount using ____if____
import java.util.Scanner;
class CountNot{

public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter amount: ");
int a = sc.nextInt();
int not2000 ,not1000,not500,not200,not100,not50,not20,not10,not5,not2,not1;

if(a>2000){
not2000 = a/2000;
a=a%2000;
System.out.println("not of 2000 = "+not2000);
}

if(a>1000){
not1000 = a/1000;
a = a%1000;
System.out.println("not of 1000 = "+not1000);
}

 if(a>500){
not500 = a/500;
a = a%500;
System.out.println("not of 500 = "+not500);
}

if(a>200){
not200 = a/200;
a = a%200;
System.out.println("not of 200 = "+not200);
}

if(a>100){
not100=a/100;
a=a%100;
System.out.println("not of 100 = "+not100);
}

 if(a>50){
not50= a/50;
a= a%50	; 
System.out.println("not of 50 = "+not50);
}

if(a>20){
not20=a/20;
a= a%20;
System.out.println("not of 20 = "+not20);
}

if(a>10)
not10=a/10;
a=a%10;
System.out.println("not of 10 = "+not10);
}

if(a>5){
not5= a/5;
a=a%5;
System.out.println("not of 5 = "+not5);
}

if(a>2){
not2=a/2;
a=a%2;
System.out.println("not of 2= "+not2);
}


System.out.println("not of 1 = "+a);

}
}