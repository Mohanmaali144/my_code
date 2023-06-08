/*mini Shop*/


import java.util.Scanner;

class Shop
{
public static void main(String []arg)
{
Scanner sc = new Scanner (System.in);

System.out.println("\nChoice are:" );

System.out.println("\npress 1 for Pen" );
System.out.println("press 2 for Pencil" );
System.out.println("press 3 for not-book" );
System.out.println("press 4 for bag " );
System.out.println("\nEnter choice:" );
int ch = sc.nextInt();

  double area,r,h;
  
  switch(ch)
  {
	case 1:
		System.out.println("\nCompany are:" );
        System.out.println("\nCello\nGoodluck\nGoldex\nFlair\nRoff" );
		System.out.println("\npress 1 for Cello" );
		System.out.println("press 2 for Goodluck" );
		System.out.println("press 3 for Goldex" );
		System.out.println("press 4 for Flair" );
		System.out.println("press 5 for Roff" );
		System.out.println("\nEnter choice:" );
		int ch2 = sc.nextInt();
		switch(ch2)
		{
			case 1:
				System.out.println("price of cello pen :   10/-" );
			break;	
			
			case 2:
				System.out.println("price of Goodluck pen :    2/-" );
			break;	
			
			case 3:
				System.out.println("price of Goldex pen :   15/-" );
			break;	
			
			case 4:
				System.out.println("price of Flair pen :   20/-" );
			break;	
			
			case 5:
				System.out.println("price of Roff pen :   12/-" );
			break;	
			
			default:
				System.out.println("invalid choice...!!!" );
		}
	break;
		
	case 2:	
		System.out.println("\nCompany are:" );
        System.out.println("\nDerwent\nApsara\nNatraj\nCamlin\nDoms" );
		System.out.println("\npress 1 for Derwent" );
		System.out.println("press 2 for Apsara" );
		System.out.println("press 3 for Natraj" );
		System.out.println("press 4 for Camlin" );
		System.out.println("press 5 for Doms" );
		System.out.println("\nEnter choice:" );
		int ch3 = sc.nextInt();
		switch(ch3)
		{
			case 1:
				System.out.println("price of Derwen pencil :   12/-" );
			break;	
			
			case 2:
				System.out.println("price of Apsara pencil :    8/-" );
			break;	
			
			case 3:
				System.out.println("price of Natraj pencil :   10/-" );
			break;	
			
			case 4:
				System.out.println("price of Camlin pencil :   20/-" );
			break;	
			
			case 5:
				System.out.println("price of Doms pencil :   5/-" );
			break;	
			
			default:
				System.out.println("invalid choice...!!!" );
		}
	break;
		
		
	case 3:
		
			System.out.println("\nCompany are:" );
			System.out.println("\nShiva\nClassmet\nFlash Notes\nClassic\nYellow" );
			System.out.println("press 1 for Shiva" );
			System.out.println("press 2 for Classmet" );
			System.out.println("press 3 for Flass Not" );
			System.out.println("press 4 for Classic" );
			System.out.println("press 5 for Yellow" );
			System.out.println("\nEnter choice:" );
			int ch4 = sc.nextInt();
		switch(ch4)
		{
			case 1:
				System.out.println("price of Shiva notbook :   120/-" );
			break;	
			
			case 2:
				System.out.println("price of Classmet notbook :    80/-" );
			break;	
			
			case 3:
				System.out.println("price of FlASH Not notbook  :   100/-" );
			break;	
			
			case 4:
				System.out.println("price of Classic notbook :   150/-" );
			break;	
			
			case 5:
				System.out.println("price of Yellow notbook :   50/-" );
			break;	
			
			default:
				System.out.println("invalid choice...!!!" );
		}
	break;
		
		case 4:
		
			System.out.println("\nCompany are:" );
			System.out.println("\nBaggit\nLavie\nSkybags\nDa milano\nEsbeda" );
			System.out.println("\npress 1 for Baggit" );
			System.out.println("press 2 for Lavie" );
			System.out.println("press 3 for Skybags" );
			System.out.println("press 4 for Da milano" );
			System.out.println("press 5 for Esbeda" );
			System.out.println("\nEnter choice:" );
			int ch5 = sc.nextInt();
		switch(ch5)
		{
			case 1:
				System.out.println("price of Baggit bag :   320/-" );
			break;	
			
			case 2:
				System.out.println("price of Lavie bag :    800/-" );
			break;	
			
			case 3:
				System.out.println("price of Skybags bag  :   600/-" );
			break;	
			
			case 4:
				System.out.println("price of Da milano bag :   350/-" );
			break;	
			
			case 5:
				System.out.println("price of Esbeda bag :   500/-" );
			break;	
			
			default:
				System.out.println("invalid choice...!!!" );
		}
	break;
		
		default:
		System.out.println("invalid choice...!!!" );
  }
  
  
}
}