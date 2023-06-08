/*uncomplete*/
import java.util.Scanner;

class Subject
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);





System.out.println("\nChoice are:" );
System.out.println("\nBSC:  SUB.CODE - 1001" );
System.out.println("B.Tech :  SUB.CODE - 1002" );
System.out.println("BA   :  SUB.CODE - 1003" );
System.out.println("B.COM:  SUB.CODE - 1004" );
System.out.println("\nEnter choice:" );
int ch = sc.nextInt();

switch(ch)
{
	case 1001:
			System.out.println("\nChoice are:" );
			System.out.println("\nBSC AGRICULTURE:  SUB.CODE - 101" );
			System.out.println("BSC  BIOTECHNOLOGY :  SUB.CODE - 102" );
			System.out.println("BSC  CS :  SUB.CODE - 103" );
			System.out.println("BSC  biochemistry:  SUB.CODE - 104" );
			System.out.println("\nEnter choice:" );
			
			case 101:
			System.out.println("\nSubject:" );
			System.out.println("\n1. Food technology" );
			System.out.println("2. Plant genetics" );
			System.out.println("3. Agricultural meterology" );
			System.out.println("4. Horticulture" );
			System.out.println("5. Agronomy" );
			break;
			
			case 102:
			System.out.println("\nSubject:" );
			System.out.println("\n1. biomathematics" );
			System.out.println("2. biophysics" );
			System.out.println("3. microbiology " );
			System.out.println("4. biochemistry" );
			System.out.println("5. genetics" );
			break;
			
			case 103:
			System.out.println("\nSubject:" );
			System.out.println("\n1. mathematics" );
			System.out.println("2. physics" );
			System.out.println("3. computer graphics " );
			System.out.println("4. programing language" );
			System.out.println("5. artificial inteligenc" );
			break;
			
			case 104:
			System.out.println("\nSubject:" );
			System.out.println("\n1. biochemical dynamic" );
			System.out.println("2. organic chemistry" );
			System.out.println("3. general chemistry " );
			System.out.println("4. moleculer biology" );
			System.out.println("5. calculus" );
			break;
			
			
}

}}