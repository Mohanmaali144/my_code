import java.util.Scanner;

class Snake2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Player 1 Name:");
		String p1 = sc.next();
		System.out.println("Player 2 Name: ");	
		String p2 = sc.next();
		int sum1=0,sum2=0,d=0;
		char ch1,ch2;
		do{
			do{
				System.out.println("\n\tterm of "+p1+"\n\tpress X : for play  ");
				System.out.println("\tpress E : for Exit game");
				 ch1 = sc.next().charAt(0);
				if(ch1=='E')
					System.exit(0);
				if(ch1!='X')
					System.out.println("\n\tThis is not Your term\n\t");			
			  }while(ch1!='X');
				  
			switch(ch1)
			{				
				case 'X':
				
						d = (int)(Math.random()*6+1);
						if((sum1+d)<=100)
						sum1 = sum1+d;
					System.out.println("\n\tPlayer  "+p1+"\n\tDice: "+d);
					switch(sum1)
					{
						case 1:
							sum1=38;
							System.out.println("\n\tClimbing the Ladder :  1 to 38 ");
						break;	
						case 4:
							sum1=14;
							System.out.println("\n\tClimbing the Ladder :  4 to 14 ");
						break;	
						case 9:
							sum1=31;
							System.out.println("\n\tClimbing the Ladder :  9 to 31 ");
						break;
						case 21:
							sum1=42;
							System.out.println("\n\tClimbing the Ladder :  21 t0 42 ");
						break;	
						case 51:
							sum1=67;
							System.out.println("\n\tClimbing the Ladder :  51 to 67 ");
						break;	
						case 28:
							sum1=84;
							System.out.println("\n\tClimbing the Ladder :  28 to 84 ");
						break;
						
						case 72:
							sum1=91;
							System.out.println("\n\tClimbing the Ladder :  72 to 91 ");
						break;
						
						case 80:
							sum1=99;
							System.out.println("\n\tClimbing the Ladder :  80 to 99 ");
						break;
						/*-----snake bite-----*/
						case 17:
							sum1=7;
							System.out.println("\n\tSnake Bite:  17 to 7 ");
						break;
						
						case 54:
							sum1=34;
							System.out.println("\n\tSnake Bite:  54 to 34 ");
						break;

						case 62:
							sum1=29;
							System.out.println("\n\tSnake Bite:  62 to 29 ");
						break;

						case 64:
							sum1=60;
							System.out.println("\n\tSnake Bite:  64 to 60 ");
						break;
						
						case 87:
							sum1=36;
							System.out.println("\n\tSnake Bite:  87 to 36 ");
						break;
						
						case 93:
							sum1=73;
							System.out.println("\n\tSnake Bite:  93 to 73 ");
						break;
						
						case 95:
							sum1=75;
							System.out.println("\n\tSnake Bite:  95 to 75 ");
						break;
						
						case 98:
							sum1=79;
							System.out.println("\n\tSnake Bite:  98 to 71 ");
						break;
										
					} 	
				System.out.println("\n\tposition: "+sum1);
				System.out.println("|________________________________________|");
						
			}
			 if(sum1==100)break;
			 do{
					System.out.println("\n\tterm of "+p2+"\n\tpress Y : for play  ");
					System.out.println("\tpress E : for Exite game");
					 ch2 = sc.next().charAt(0);
					if(ch2=='E')
					System.exit(0);
					if(ch2!='Y')
						System.out.println("\n\tThis is not Your term\n\t");
				}while(ch2!='Y');	
				
			switch(ch2)
			{			
					case 'Y':
					
						d = (int)(Math.random()*6+1);
						if((sum2+d)<=100)
						sum2 = sum2+d;
					System.out.println("\n\tPlayer  "+p2+"\n\tDice: "+d);
					switch(sum2)
					{						
						case 1:
							sum2=38;
							System.out.println("\n\tClimbing the Ladder :  1 to 38 ");
						break;	
						case 4:
							sum2=14;
							System.out.println("\n\tClimbing the Ladder :  4 to 14 ");
						break;	
						case 9:
							sum2=31;
							System.out.println("\n\tClimbing the Ladder :  9 to 31 ");
						break;
						case 21:
							sum2=42;
							System.out.println("\n\tClimbing the Ladder :  21 to 42 ");
						break;	
						case 51:
							sum2=67;
							System.out.println("\n\tClimbing the Ladder :  51 to 67 ");
						break;	
						case 28:
							sum2=84;
							System.out.println("\n\tClimbing the Ladder :  28 to 84 ");
						break;
						
						case 72:
							sum2=91;
							System.out.println("\n\tClimbing the Ladder :  72 to 91 ");
						break;
						
						case 80:
							sum2=99;
							System.out.println("\n\tClimbing the Ladder :  80 to 99 ");
						break;
						/*-----snake bite-----*/
						case 17:
							sum2=7;
							System.out.println("\n\tSnake Bite:  17 to 7 ");
						break;
						
						case 54:
							sum2=34;
							System.out.println("\n\tSnake Bite:  54 to 34 ");
						break;

						case 62:
							sum2=29;
							System.out.println("\n\tSnake Bite:  62 to 29 ");
						break;

						case 64:
							sum2=60;
							System.out.println("\n\tSnake Bite:  64 to 60 ");
						break;
						
						case 87:
							sum2=36;
							System.out.println("\n\tSnake Bite:  87 to 36 ");
						break;
						
						case 93:
							sum2=73;
							System.out.println("\n\tSnake Bite:  93 to 73 ");
						break;
						
						case 95:
							sum2=75;
							System.out.println("\n\tSnake Bite:  95 to 75 ");
						break;
						
						case 98:
							sum2=79;
							System.out.println("\n\tSnake Bite:  98 to 71 ");
						break;
										
					}
				System.out.println("\n\tposition: "+sum2);
				System.out.println("|________________________________________|");
						
			}
			
		}while(sum1!=100 && sum2!=100);
		
		System.out.println("____________________________");
		System.out.println("|     ___CONGRATULATION___");
		
		if(sum1==100)
		{
	
			System.out.println("|\n|\tWinner is "+p1);
		}	
		else if(sum2==100)
		{

			System.out.println("|\n|\twinner is "+p2);			
		}
		System.out.println("|____________________________");
	}
}
	