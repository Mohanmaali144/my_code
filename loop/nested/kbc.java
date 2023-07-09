// KBC 10 question_________15/05/2023
// Project
import java.util.Scanner;

class Kbc
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner (System.in);	
		System.out.println("\n1)Which of the following option leads to the portability and security of Java?");
		
		System.out.println("\n1 : Bytecode is executed by JVM");
		System.out.println("2 : The applet makes the Java code secure and portable");
		System.out.println("3 : Use of exception handling");
		System.out.println("4 : Dynamic binding between objects");
		System.out.println("\nEnter any answer Number");
		int ch= sc.nextInt();	
		
		switch(ch)
		{case 1:
		System.out.println("\nCorrect : Bytecode is executed by JVM");
		System.out.println("\n2) Which of the following is not a Java features?");
		System.out.println("\n1 : Dynamic");
		System.out.println("2 : Architecture Neutral");
		System.out.println("3 : Use of pointers");
		System.out.println("4 : Object-oriented");
		System.out.println("\nEnter any answer Number");
		int ch2= sc.nextInt();
		switch(ch2)
		{
			case 3:
				System.out.println("\nCorrect : Use of pointers");
				System.out.println("\n3) Which of the following is a mutable class in java?");
				System.out.println("\n1 : java.lang.String");
				System.out.println("2 : java.lang.Byte");
				System.out.println("3 : java.lang.StringBuilder");
				System.out.println("4 : java.lang.Short");
				System.out.println("\nEnter any answer Number");
				int ch3= sc.nextInt();
				switch(ch3)
				{
					case 3:
					System.out.println("\nCorrect : java.lang.StringBuilder");
					System.out.println("\n4) _____ is used to find and fix bugs in the Java programs.");
					System.out.println("\n1 :JVM");
					System.out.println("2 :JRE ");
					System.out.println("3 :JDK");
					System.out.println("4 :JDB ");
					System.out.println("\nEnter any answer Number");
					int ch4= sc.nextInt();
					switch(ch4)
					{  
						case 4:
						System.out.println("\nCorrect : JDB");
						System.out.println("\n5)Which of the following for loop declaration is not valid?");
						System.out.println("\n1 :for ( int i = 99; i >= 0; i / 9 )");
						System.out.println("2 :for ( int i = 7; i <= 77; i += 7 )");
						System.out.println("3 :for ( int i = 20; i >= 2; - -i )");
						System.out.println("4 :for ( int i = 2; i <= 20; i = 2* i )");
						System.out.println("\nEnter any answer Number");
						int ch5= sc.nextInt();
						switch(ch5)
						{
							case 1:
							System.out.println("\nCorrect :for ( int i = 99; i>=0; i / 9)");
							System.out.println("\n6) What is the return type of the hashCode() method in the Object class? ");
							System.out.println("\n1: Object");
							System.out.println("2 :int");
							System.out.println("3 :long");
							System.out.println("4 :void");
							System.out.println("\nEnter any answer Number");
							int ch6= sc.nextInt();
							switch(ch6)
							{
								case 2:
								System.out.println("\nCorrect : int ");
								System.out.println("\n7) Which of the following is true about the anonymous inner class? ");
								System.out.println("\n1: It has only methods");
								System.out.println("2 :Objects can't be created");
								System.out.println("3 :It has a fixed class name");
								System.out.println("4 :It has no class name");
								System.out.println("\nEnter any answer Number");
								int ch7= sc.nextInt();
								switch(ch7)
								{
									case 4:
									System.out.println("\nCorrect :It has no class name ");
									System.out.println("\n8) Which package contains the Random class?  ");
									System.out.println("\n1:java.util package ");
									System.out.println("2 :java.lang package");
									System.out.println("3 :java.awt package");
									System.out.println("4 :java.io package");
									System.out.println("\nEnter any answer Number");
									int ch8= sc.nextInt();
									
									switch(ch8)
									{
										case 1:
										System.out.println("\nCorrect :java.util package ");
										System.out.println("\n8)In which memory a String is stored, when we create a string using new operator ? ");
										System.out.println("\n1:Stack");
										System.out.println("2 :String memory");
										System.out.println("3 :Heap memory");
										System.out.println("4 :Random storage space");
										System.out.println("\nEnter any answer Number");
										int ch9= sc.nextInt();
										
										switch(ch9)
										{
											case 3:
											System.out.println("\nCorrect :Heap memory");
											System.out.println("\n9) Which of the following is a reserved keyword in Java?");
											System.out.println("\n1:object");
											System.out.println("2 :strictfp");
											System.out.println("3 :main");
											System.out.println("4 :system");
											System.out.println("\nEnter any answer Number");
											int ch10= sc.nextInt();
											switch(ch10)
											{
												case 2:
													System.out.println("\nCorrect :strictfp");
													System.out.println("Congratulations...\n You win 7,0000000/-");
													System.exit(0);	
											}
										default :
										System.out.println("\n Wrong answer..!!\n You win 6,0000000/-");
										System.exit(0);	
										}
									default :
									System.out.println("\n Wrong answer..!!\n You win 5,5000000/-");
									System.exit(0);	
									}
								default :
								System.out.println("\n Wrong answer..!!\n You win 4,5000000/-");
								System.exit(0);	
								}
							default :
							System.out.println("\n Wrong answer..!!\n You win 3,3500000/-");
							System.exit(0);	
							}
						default :
						System.out.println("\n Wrong answer..!!\n You win 2,7000000/-");
						System.exit(0);
						}
					default :
					System.out.println("\n Wrong answer..!!\n You win 1,50,00000/-");
					System.exit(0);	
					}
				default :
				System.out.println("\n Wrong answer..!!\n You win 1,00000/-");
				System.exit(0);	
				}
		default:
		System.out.println("\n Wrong answer..!!\n You win 10,000/-");
		System.exit(0);		
		}
		default:
			System.out.println("\n Wrong answer\n Pleas Try next time");
		}
	}
}
			