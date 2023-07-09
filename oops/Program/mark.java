import java.util.Scanner;
class DataClass
{
	
	private String name,corse,fname,mname,branch,sem;
	private int age,roll,year,physics,chemistry,math,hindi,english;
	
	public DataClass(String name, String fname ,String mname , String branch ,String sem,int age,int roll,int year,int physics,int chemistry,int math,int hindi,int english)
	{
		this.name   = name;
		this.age    = age;
		this.corse  = corse;
		this.fname  = fname;
		this.mname  = mname;
		this.branch = branch;
		this.sem    = sem;
		this.age    = age;
		this.roll   = year;
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
		this.hindi = hindi;
		this.english = english;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
class Main
{
	public static void main (String arg[])
	{
		Scanner sc = new Scanner(System.in);
		String name,corse,fname,mname,branch,sem;
		int age,roll,year,p,c,m,h,e;
		boolean z;
		int a[]= new int[3];
		DataClass []student = new DataClass[3];
		int i=0;
		int n=3;
		 while(i<n)
		 {	
			    sc.nextLine();
				System.out.println("Enter Your name");
				name=sc.nextLine();
				
				System.out.println("Enter Your Father name");
				fname=sc.nextLine();
				
				System.out.println("Enter Your Mother Name");
				mname=sc.nextLine();
				
				System.out.println("Enter Course name");
				corse=sc.nextLine();
				do{
				System.out.println("Enter Roll number");
				roll=sc.nextInt();
				sc.nextLine();
				z = false; //continue....
				a[i]=roll;
				
				for(int j=0; j<i; j++)
			    if(roll==a[j])
				{
					System.out.println("roll number alredy added\n");
					 z=true;
				}
				}while(z);
				
				System.out.println("Enter Your Branch name");
				branch=sc.nextLine();
				
				System.out.println("Enter Your Sem");
				sem=sc.nextLine();
				
				System.out.println("Enter Year");
				year=sc.nextInt();
				
				System.out.println("Enter Age");
				age=sc.nextInt();
			/*-----------------do while  START-----------------------*/	
				do{	
					System.out.println("Enter physics number:   ");
					p = sc.nextInt(); 
					if(p<0||p>100)	
					{
						System.out.println("Invalid mark Of physics..!!\nPleas re enter mark..");
					}
				}while(p<0||p>100);
					
				do{
					System.out.println("Enter chemistry number:   "); 
					c = sc.nextInt();
					if(c<0||c>100)	
					{
						System.out.println("Invalid mark Of chemistry..!!\nPleas re enter mark..");
					}
				}while(c<0||c>100);
				
				do{
				System.out.println("Enter math number:   ");
				m = sc.nextInt();
				  if(m<0||m>100)	
					{
						System.out.println("Invalid mark Of math..!!\nPleas re enter mark..");
					}	
				 }while(m<0||m>100);
				do{	 
				System.out.println("Enter hindi number:   ");
				h = sc.nextInt();
				if(h<0||h>100)	
					{
						System.out.println("Invalid mark Of Hindi..!!\nPleas re enter mark..");
					}	
				}while (h<0||h>100);
				
				 do{	
					System.out.println("Enter english number:   ");
					e = sc.nextInt();
					if(e<0||e>100)	
						{
							System.out.println("Invalid mark Of English..!!\nPleas re enter mark..");
						}			
					}while(e<0||e>100);
			
			student[i] = new DataClass(name,fname,mname,branch,sem,age,roll, year, p,c,m,h,e);
			i++;
			if(n>1)
				System.out.println("||     Enter Next person details    || ");
		}	
				
				//p[] = new Person ("raj" ,25);
				//p[] = new Person ("kumar" ,84);
					
				for( i=0; i<student.length; i++)
				{
					System.out.println("Person "+(i+1));
					System.out.println("Name  "+student[i].getName());
					System.out.println("Age "+student[i].getAge());
					System.out.println();
				}
		
	}
}