
package marksheetdetails;
import businesslogic.*;
import marksheetpojo1.Pojo;
import java.util.Scanner;
public class MarksheetDetails{
  
   //input Details
	public static int input(Pojo std[],OpMarksheet op,int j)
	{              
        // Pojo std[] = new Pojo[100];
        Scanner sc = new Scanner(System.in);
		String name,course,fname,mname,branch,uv;
		int age,roll,year,sem,physics,chemistry,math,hindi,english,total;
		double per;
		int i=j;
		int n;	
		System.out.println("\t| how many marksheet  want you Enter |");
		n = sc.nextInt();
		if(i>0)
			n = std[0].getN() + n;
		while(i<n)
		{	
			/* ------ input Details ------ */
			if(i>0&&i<n)
			{
				System.out.println("||     Enter Next person details    || ");
			}

		    sc.nextLine();
			System.out.println("Enter Your name");
			name=sc.nextLine();
			
			System.out.println("Enter Your Father name");
			fname = sc.nextLine();
			
			System.out.println("Enter Your Mother Name");
			mname = sc.nextLine();
			
			System.out.println("Enter Course name");
			course = sc.nextLine();
			
			System.out.println("Enter Roll number");
			roll = op.roll(std ,i);
			
			System.out.println("Enter University name");
			uv = sc.nextLine();
			
			System.out.println("Enter Your Branch name");
			branch = sc.nextLine();
			
			System.out.println("Enter Your Sem");
			sem = sc.nextInt();
			
			System.out.println("Enter Year");
			year = sc.nextInt();
			
			System.out.println("Enter Age");
			age = sc.nextInt();
			/*----------------- Mark -----------------------*/	
			System.out.println("Enter physics number:   ");
			physics = op.inputMark();

			System.out.println("Enter chemistry number:   "); 
			chemistry = op.inputMark();
			
			System.out.println("Enter math number:   ");
			math = op.inputMark();
			
			System.out.println("Enter hindi number:   ");
			hindi = op.inputMark();
			
			System.out.println("Enter english number:   ");
			english = op.inputMark();
			total = hindi+math+english+chemistry+physics;
			per = total/5;
		    std[i] = new Pojo(name,course,fname,mname,branch,uv,sem,age,roll, year, physics,chemistry,math,hindi,english,total,per,n);
			i++;
		}			
		//System.out.println("||-------------------------------------------------------------||\n");
		return n;
    }
	
	public void choice()
	{
		 Pojo std[] = new Pojo[100];
		OpMarksheet op = new OpMarksheet();
		Scanner sc = new Scanner(System.in);
		int ch,num;
		boolean flag=true;
		do{
			System.out.println("\t------------------------------------------------------------------------");
			System.out.println("\t|\t\t\t\tChoice are\t\t\t\t|");
			System.out.println("\t------------------------------------------------------------------------");
			System.out.println("\n");
			System.out.println("\t------------------------\t------------------------------------");
			System.out.println("\t  1 for insert Details    \t  2 for search Marksheet  ");
			System.out.println("\t------------------------\t------------------------------------");
			System.out.println();
			System.out.println("\t------------------------\t------------------------------------");
			System.out.println("\t  3 for Update Details   \t  4 for Exit  ");
			System.out.println("\t------------------------\t------------------------------------");
			System.out.println();
			System.out.println("\t---------------------------------------------------------------");
			System.out.println("\t\t\t\tEnter choice....\t\t\t");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					flag = false;
					input(std,op,0);
				break;	
				case 2:
					if(flag)
					{
						System.out.println("\t======================================+++++==============================");
						System.out.println("\t|\t\t\t\tFirst Enter Details\t\t\t|");
						System.out.println("\t======================================+++++==============================");
					}
					else
					{
						op.search(std,std[0].getN());
					}
				break;
				case 3:
				  	if(flag)
					{		
						System.out.println("\t======================================+++++==============================");
						System.out.println("\t|\t\t\t\tFirst Enter Details\t\t\t|");
						System.out.println("\t======================================+++++==============================");
					}
					else
					{
						op.update(std,op);
					}
					break;						 
			}
		}while(ch!=4);
	}
 
}

