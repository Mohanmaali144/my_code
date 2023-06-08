import java.util.Scanner;

class Snake
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Player 1");
		System.out.println("Player 2");	
		int sum1=0,sum2=0,d=0;
		do{
			System.out.println("\n\tterm of player  1\n\tpress X for play : ");
			System.out.println("\n\tpress E : for Exite game");
			char ch1 = sc.next().charAt(0);
			if(ch1=='E')
			{
				System.exit(0);
			}
				
			else if(ch1=='X')
			{	
				if((sum1+d)<=20)
				{
					d = (int)(Math.random()*6+1);
					sum1 = sum1+d;
				}	
					if(sum1==2)
					{
						sum1=16;
						System.out.println("\n\tClimbing the Ladder :  2 - 16 ");
						
					}	
					else if(sum1==5)
					{	sum1=14;
						System.out.println("\n\tClimbing the Ladder :  5 - 14 ");
					}
					
					else if(sum1==8)
					{	sum1=11;
						System.out.println("\n\tClimbing the Ladder :  8 - 11 ");
					}
					else if(sum1==15)
					{	sum1=18;
						System.out.println("\n\tClimbing the Ladder :  15 - 18 ");
					}
					else if(sum1==12)
					{	sum1=6;
						System.out.println("\n\tSnake Bite:  12 - 6 ");
					}
					else if(sum1==9)
					{	sum1=3;
						System.out.println("\n\tSnake Bite:  9 - 3 ");
					}
					else if(sum1==17)
					{	sum1=10;
						System.out.println("\n\tSnake Bite:  17 - 10 ");
					}
					else if(sum1==19)
					{	sum1=7;
						System.out.println("\n\tSnake Bite:  19 - 7 ");
					}
					System.out.println("\n\tPlayer 1\n\tposition: "+sum1);
					System.out.println("|________________________________________|");
				
			}
		
			System.out.println("\n\tterm of player: 2\n\tpress Y : ");
			System.out.println("\n\tpress E : for Exite game");
			char ch2 = sc.next().charAt(0);
			if(ch2=='E')
			{
				System.exit(0);
			}
			else if(ch2=='Y')
			{
				if ((d+sum2)<=20)
				{ 	d = (int)(Math.random()*6+1);
					sum2 = sum2+d;
				}	
					if(sum2==2)
					{
						sum2=16;
						System.out.println("\n\tClimbing the Ladder :  2 - 16 ");
						
					}	
					else if(sum2==5)
					{	sum2=14;
						System.out.println("\n\tClimbing the Ladder :  5 - 14 ");
					}
					
					else if(sum2==8)
					{	sum2=11;
						System.out.println("\n\tClimbing the Ladder :  8 - 11 ");
					}
					else if(sum2==15)
					{	sum2=18;
						System.out.println("\n\tClimbing the Ladder :  15 - 18 ");
					}
					else if(sum2==12)
					{	sum2=6;
						System.out.println("\n\tSnake Bite:  12 - 6 ");
					}
					else if(sum2==9)
					{	sum1=2;
						System.out.println("\n\tSnake Bite:  9 - 3 ");
					}
					else if(sum2==17)
					{	sum2=10;
						System.out.println("\n\tSnake Bite:  17 - 10 ");
					}
					else if(sum2==19)
					{	sum2=7;
						System.out.println("\n\tSnake Bite:  19 - 7 ");
					}
					System.out.println("\n\tPlayer 2\n\tposition: "+sum2);
					System.out.println("|________________________________________|");								
			}

		}while(sum1!=20 && sum2!=20);
		
		if(sum1==20)
		{
			System.out.println("\n\t Position + "+d);
			System.out.println("\n\twinner is Playe : 1");
		}	
		else if(sum2==20)
		{
			System.out.println("\n\t Position + Last Dice"+d);
			System.out.println("\n\twinner is Playe : 2");
		}
	}
}


