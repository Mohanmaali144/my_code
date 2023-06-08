
import java.util.Scanner;

class Temp21
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;
for(i=1; i<=10; System.out.print(++i+" "));
// 2 3 4 5 6 7 8 9 10 11
}}


class Temp20
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;
for(i=1; i<=10; System.out.print(i+++" "));
// 1 2 3 4 5 6 7 8 9 10
}}

class Temp19
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;
for(i=1; i>=10; ++i,System.out.print(i+" "));
// none
}}


class Temp18
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;
for(i=1; i<=10; i++,System.out.print(i+" "));
// 2 3 4 5 6 7 8 9 10 11
}}


class Temp17
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;
for(i=1; i<=10;System.out.print(i+" "),i++);
// 1 2 3 4 5 6 7 8 9 10
}}


class Temp16
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i,j;

for(i=1,j=3; j<=5; i++,j+=3)
System.out.print(i+" "+j+" ");
// 1 3
}}

class Temp15
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i,j;

for(i=1,j=3; i<=10; i++,j+=3)
System.out.print(i+" "+j+" ");
//1 3 2 6 3 9 4 12 5 15 6 18 7 21 8 24 9 27 10 30
}}

/*
class Temp14
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;
for( ;  ; );
System.out.print(" hello ");
//  error: unreachable statement
}}
*/
class Temp13
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;
for( ;  ;System.out.print(" hello "));
//  Infinite.. hello
}}

class Temp12
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;
for( ;  ;)
	System.out.print(" hello ");
//  Infinite.. hello
}}

class Temp11
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
	System.out.print(" hello ");;
	;
	System.out.print(" hii ");
//   hello  hii
}}

class Temp10
{
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
	System.out.print(" hello ");;	
	// hello
}}


class Temp9
{ 
public static void main(String []arg)
{
int i=1;
Scanner sc = new Scanner(System.in);
	
	for(; i<=10 ; )
	{
		System.out.print(i+" ");
		i++;
	}
	//1 2 3 4 5 6 7 8 9 10
}}


class Temp8
{ 
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int sum;	
	System.out.println("Enter a number");
	int n = sc.nextInt();
	for(sum=0; n>0; sum+=n%10, n/=10  );
		System.out.print(sum+" ");	
	// input 10,  output -1	
}}

class Temp7
{ 
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int sum,r;	
	System.out.println("Enter a number");
	int n = sc.nextInt();
	for(sum=0; n>0;n=n/10)
	{
		r=n%10;
		sum=sum+r;
	}	
	System.out.print(sum+" ");
	// 78 - 15 digit sum

}}

class Temp5
{ 
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int fact,i;	
	System.out.println("Enter a number");
	int n = sc.nextInt();

	for(i=1,fact=1; i<=n; fact*=i,i++);
	System.out.print(fact);
	// factorial _ find
}}

class Temp4
{ 
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;	

	for(i=1; i<=10;System.out.print("hello "), i++);

 // Hello 10 time	
}}

class Temp3
{ 
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;	

	for(i=1; i<=10; i++);
	{ 
	System.out.println(i);
	}
	System.out.println("Hello");
 // 11
 //Hello	
}}

class Temp2
{ 
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;	

	for(i=1; i<=10; i++)
	{ 
	System.out.print(i+" ");
	}
	// 1 2 3 4 5 6 7 8 9 10
}}


class Temp1
{ 
public static void main(String []arg)
{
Scanner sc = new Scanner(System.in);
int i;	

	for(i=1; i<=10; i++)
	{ 
	System.out.print(" hello ");
	}
	// hello 10 time
}}





