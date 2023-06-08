/*Travling from indore ... */
import java.util.Scanner;

class Travel
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("\nChoice for travling..from INDORE\n\ncity:" );
System.out.println("\n\npress 1 for BHOPAL" );
System.out.println("press 2 for DEWAS" );
System.out.println("press 3 for HARDA" );
System.out.println("\nEnter your choice" );
int ch = sc.nextInt();

switch(ch)
{
	case 1:
		System.out.println("\nIndore >> Bhopal : Distance 195 skm " );
		System.out.println("press 1 travel by BUS" );
		System.out.println("press 2 travel by TRAIN" );
		System.out.println("press 3 travel by CAR" );
		System.out.println("\nEnter your choice" );
		int ch2 = sc.nextInt();

		switch(ch2)
		{
			case 1:
			System.out.println("\nTravel in BUS" );
			System.out.println("\npress 1 sleeper BUS" );
			System.out.println("press 2 AC bus" );
			System.out.println("press 3 simple " );
			System.out.println("\nEnter choice" );
			int ch3 = sc.nextInt();
			switch(ch3)
			{
				case 1:
				  System.out.println("1 ticket  700/-:\nticket Book in sleeper bus.... " );
				 break; 
				 
				 case 2:
				  System.out.println("1 ticket  800/-:\nticket Book in AC bus " );
				 break; 
				 
				 case 3:
				  System.out.println("1 ticket  300/-:\nticket Book in simple bus" );
				 break; 
				 default:
				 System.out.println("invalid.. choice..!!" );
				 break;
				 
				 
			} break;
			
			case 2:
			System.out.println("\nTravel in TRAIN" );
			System.out.println("\npress 1 FIRST CLASS SEAT" );
			System.out.println("press 2 SECOND CLASS SEAT" );
			System.out.println("press 3 LOW CLASS SEAT " );
			System.out.println("\nEnter choice" );
			int ch4 = sc.nextInt();
			switch(ch4)
			{
				case 1:
				  System.out.println("1 ticket  2000/-:\nticket Book in first class seat in train.... " );
				break; 
				 
				case 2:
				  System.out.println("1 ticket  1500/-:\nticket Book in second class seat in train.... " );
				break; 
				 
				case 3:
				  System.out.println("1 ticket  850/-:\nticket Book in low class seat in train.... " );
				break; 
				 
				 default:
					  System.out.println("invalid.. choice..!!" );
				break;
			
			}break;
			
			case 3:
				 System.out.println("\nTravel in CAR" );
				 System.out.println("\npress 1 Alto car" );
				 System.out.println("press 2 Tavera car" );
				 System.out.println("press 3 Bolero car" );			 
				 System.out.println("\nEnter choice" );
				 int ch5 = sc.nextInt();
				switch(ch5)
				{
					case 1:
					System.out.println("Alto car fare is 1400/- " );
					break; 
					
					case 2:
					System.out.println("Tavera car fare is 1200/- " );
					break; 
					
					case 3:
					System.out.println("Bolero car fare is 1600/- " );
					break; 
					
					default:
					  System.out.println("invalid.. choice..!!" );
					 
				}
		
		}
	break;
	
	case 2:
		System.out.println("\nINDORE >> DEWAS :  Distance 47 km" );
		System.out.println("press 1 travel by BUS" );
		System.out.println("press 2 travel by TRAIN" );
		System.out.println("press 3 travel by CAR" );
		System.out.println("\nEnter your choice" );
		int ch6 = sc.nextInt();

		switch(ch6)
		{
			case 1:
			System.out.println("\nTravel in BUS" );
			System.out.println("\npress 1 sleeper BUS" );
			System.out.println("press 2 AC bus" );
			System.out.println("press 3 simple " );
			System.out.println("\nEnter choice" );
			int ch7 = sc.nextInt();
			switch(ch7)
			{
				case 1:
				  System.out.println("1 ticket  900/-:\nticket Book in sleeper bus.... " );
				 break; 
				 
				 case 2:
				  System.out.println("1 ticket  850/-:\nticket Book in AC bus " );
				 break; 
				 
				 case 3:
				  System.out.println("1 ticket  450/-:\nticket Book in simple bus" );
				 break; 
				 default:
				 System.out.println("invalid.. choice..!!" );
				 break;
				 
				 
			} break;
			
			case 2:
			System.out.println("\nTravel in TRAIN" );
			System.out.println("\npress 1 FIRST CLASS SEAT" );
			System.out.println("press 2 SECOND CLASS SEAT" );
			System.out.println("press 3 LOW CLASS SEAT " );
			System.out.println("\nEnter choice" );
			int ch8 = sc.nextInt();
			switch(ch8)
			{
				case 1:
				  System.out.println("1 ticket  3000/-:\nticket Book in first class seat in train.... " );
				break; 
				 
				case 2:
				  System.out.println("1 ticket  2000/-:\nticket Book in second class seat in train.... " );
				break; 
				 
				case 3:
				  System.out.println("1 ticket  950/-:\nticket Book in low class seat in train.... " );
				break; 
				 
				 default:
					  System.out.println("invalid.. choice..!!" );
				break;
			
			}break;
			
			case 3:
				 System.out.println("\nTravel in CAR" );
				 System.out.println("\npress 1 Alto car" );
				 System.out.println("press 2 Tavera car" );
				 System.out.println("press 3 Bolero car" );			 
				 System.out.println("\nEnter choice" );
				 int ch9 = sc.nextInt();
				switch(ch9)
				{
					case 1:
					System.out.println("Alto car fare is 1700/- " );
					break; 
					
					case 2:
					System.out.println("Tavera car fare is 1300/- " );
					break; 
					
					case 3:
					System.out.println("Bolero car fare is 1500/- " );
					break; 
					
					default:
					  System.out.println("invalid.. choice..!!" );
					 
				}
		
		}
		break;	
	case 3:
		System.out.println("\nINDORE >> HARDA:  Distance  158 km"  );
		System.out.println("press 1 travel by BUS" );
		System.out.println("press 2 travel by TRAIN" );
		System.out.println("press 3 travel by CAR" );
		System.out.println("\nEnter your choice" );
		int ch10 = sc.nextInt();

		switch(ch10)
		{
			case 1:
			System.out.println("\nTravel in BUS" );
			System.out.println("\npress 1 sleeper BUS" );
			System.out.println("press 2 AC bus" );
			System.out.println("press 3 simple " );
			System.out.println("\nEnter choice" );
			int ch11 = sc.nextInt();
			switch(ch11)
			{
				case 1:
				  System.out.println("1 ticket  400/-:\nticket Book in sleeper bus.... " );
				 break; 
				 
				 case 2:
				  System.out.println("1 ticket  550/-:\nticket Book in AC bus " );
				 break; 
				 
				 case 3:
				  System.out.println("1 ticket  350/-:\nticket Book in simple bus" );
				 break; 
				 default:
				 System.out.println("invalid.. choice..!!" );
				 break;
				 
				 
			} break;
			
			case 2:
			System.out.println("\nTravel in TRAIN" );
			System.out.println("\npress 1 FIRST CLASS SEAT" );
			System.out.println("press 2 SECOND CLASS SEAT" );
			System.out.println("press 3 LOW CLASS SEAT " );
			System.out.println("\nEnter choice" );
			int ch12 = sc.nextInt();
			switch(ch12)
			{
				case 1:
				  System.out.println("1 ticket  1500/-:\nticket Book in first class seat in train.... " );
				break; 
				 
				case 2:
				  System.out.println("1 ticket  1200/-:\nticket Book in second class seat in train.... " );
				break; 
				 
				case 3:
				  System.out.println("1 ticket  350/-:\nticket Book in low class seat in train.... " );
				break; 
				 
				 default:
					  System.out.println("invalid.. choice..!!" );
				break;
			
			}break;
			
			case 3:
				 System.out.println("\nTravel in CAR" );
				 System.out.println("\npress 1 Alto car" );
				 System.out.println("press 2 Tavera car" );
				 System.out.println("press 3 Bolero car" );			 
				 System.out.println("\nEnter choice" );
				 int ch13 = sc.nextInt();
				switch(ch13)
				{
					case 1:
					System.out.println("Alto car fare is 1000/- " );
					break; 
					
					case 2:
					System.out.println("Tavera car fare is 800/- " );
					break; 
					
					case 3:
					System.out.println("Bolero car fare is 700/- " );
					break; 
					
					default:
					  System.out.println("invalid.. choice..!!" );
					 
				}
		
		}
	break;
		
	default:
	System.out.println("invalid.. choice..!!" );	
	
	
}

}}