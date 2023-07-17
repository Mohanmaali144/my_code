//Complete Marksheet with Pojo
import java.util.Scanner;
//all the data member in pojo class
class Pojo
{
	private String name,course,fname,mname,branch,uv;
	private int sem,age,roll,year, physics,chemistry,math,hindi,english,total,n;
	private double per;
   
   public Pojo(String name,String course,String fname,String mname,String branch,String uv,int sem,int age,int roll,int year,int physics,int chemistry,int math,int hindi,int english,int total, double per,int n )
   {
       this. name = name;
       this.course = course;
       this.fname = fname;
       this.mname = mname;
       this.branch = branch;
       this.uv = uv;
       this.sem = sem;
       this.age = age;
       this.roll = roll;
       this.year = year;
       this.physics = physics;
       this.chemistry = chemistry;
       this.math = math ;
       this.hindi = hindi;
       this.english = english;
       this.total = total;
       this.per = per;
	   this.n = n;
   }
   
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getUv() {
        return uv;
    }
    public void setUv(String uv) {
        this.uv = uv;
    }
    public int getSem() {
        return sem;
    }
    public void setSem(int sem) {
        this.sem = sem;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPhysics() {
        return physics;
    }
    public void setPhysics(int physics) {
        this.physics = physics;
    }
    public int getChemistry() {
        return chemistry;
    }
    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getHindi() {
        return hindi;
    }
    public void setHindi(int hindi) {
        this.hindi = hindi;
    }
    public int getEnglish() {
        return english;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public double getPer() {
        return per;
    }
    public void setPer(double per) {
        this.per = per;
    }
	public int getN()
	{
		return this.n;
	}
	public void setN(int n)
	{
		this.n = n;
	}
}

// all Operetion performing
class  OpMarksheet
{
	public int roll(Pojo std[],int i)
	{
		Scanner sc = new Scanner(System.in);
        int roll ;
		boolean flag;
		do{
			flag = false;
			roll = sc.nextInt();
			for(int j=0;j<i;j++)
			{
				if(roll==std[j].getRoll())
				{
					System.out.println("Roll number already Added\nre enter roll number");
					flag = true;
				}
			}
		}while(flag);					
		return roll;
    }

    //mark check
    public int inputMark()
	{
		Scanner sc = new Scanner(System.in);
		int mark;
		do{	
				mark = sc.nextInt(); 
				if(mark<0||mark>100)	
				{
					System.out.println("Invalid mark...!!\nPleas re enter mark..");
				}
			}while(mark<0||mark>100);
			return mark;			
	}

    public void printMarksheet(Pojo ref[] , int i)
    {
        System.out.println("|-------------------------------------------------------------------------|");	
		
		System.out.println("|\t\t\t\t"+ref[i].getUv()+"                               ");
		System.out.println("|\tRoll  : "+ref[i].getRoll()+"\t\t\t\t\tCourse : "+ref[i].getCourse()+"      ");
		System.out.println("|\tName  : "+ref[i].getName()+"\t\t\t\t\tBranch : "+ref[i].getBranch()+"  ");	
		System.out.println("|\tFName : "+ref[i].getFname()+"\t\t\t\t\tSem    : "+ref[i].getSem()+"      ");
		System.out.println("|\tMName : "+ref[i].getMname()+"\t\t\t\t\tYear   : "+ref[i].getYear()+"     ");
		System.out.println("|");
		System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    ");
		System.out.println("|\tBSC101       physics        100            33            "+ref[i].getPhysics()+"       ");
		System.out.println("|\tBSC102       chemestry      100            33            "+ref[i].getChemistry()+"       ");
		System.out.println("|\tBSC103       Mathes         100            33            "+ref[i].getMath()+"       ");
		System.out.println("|\tBSC104       Hindi          100            33            "+ref[i].getHindi()+"       ");
		System.out.println("|\tBSC105       English        100            33            "+ref[i].getEnglish()+"       ");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
		System.out.println("|\t\t\t\t\t\t\t\t\t  ");
	/*------------------------------------------------------------*/
		// mark check
		if(ref[i].getPhysics() < 33 && ref[i].getMath() < 33 && ref[i].getChemistry() < 33 && ref[i].getHindi() < 33 && ref[i].getEnglish() < 33)
		{ 
			System.out.println("|\t\t\t\t\t\tStatus: | FAIL");  /*continue.....*/
			System.out.println("|\tFail in all Subject");
		}
		else if((ref[i].getPhysics()<33&& ref[i].getChemistry()<33&&ref[i].getMath()<33&&ref[i].getHindi()<33)||
		(ref[i].getPhysics()<33&&ref[i].getMath()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33)||
		(ref[i].getPhysics()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33&&ref[i].getChemistry()<33)||
		(ref[i].getPhysics()<33&&ref[i].getEnglish()<33&&ref[i].getChemistry()<33&&ref[i].getMath()<33)||
		(ref[i].getChemistry()<33&&ref[i].getMath()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33))
		{    				
			System.out.println("|\t\t\t\t\t\tStatus: | FAIL"); 			

			if(ref[i].getPhysics()<33&&ref[i].getChemistry()<33&&ref[i].getMath()<33&&ref[i].getHindi()<33)
				System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\thindi");
			
			else if(ref[i].getPhysics()<33&&ref[i].getMath()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33)
				System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");
			
			else if(ref[i].getPhysics()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33&&ref[i].getChemistry()<33)
				System.out.println("\tFail in four Subject:\n\tphysics\n\tchemistry\n\thindi\n\tEnglish");
			
			else if(ref[i].getPhysics()<33&&ref[i].getEnglish()<33&&ref[i].getChemistry()<33&&ref[i].getMath()<33)
				System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");
			
			else if(ref[i].getChemistry()<33&&ref[i].getMath()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33)
				System.out.println("|\tFail in four Subject:\n\tchemistry\n\tmath\n\thindi\n\tEnglish");
		}

		else if((ref[i].getPhysics()<33&&ref[i].getMath()<33&&ref[i].getChemistry()<33)||(ref[i].getPhysics()<33&&ref[i].getChemistry()<33&&ref[i].getHindi()<33)||(ref[i].getPhysics()<33&&ref[i].getMath()<33&&ref[i].getHindi()<33)||(ref[i].getChemistry()<33&&ref[i].getMath()<33&&ref[i].getHindi()<33)||(ref[i].getPhysics()<33&&ref[i].getChemistry()<33&&ref[i].getEnglish()<33)||
		(ref[i].getMath()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33)||(ref[i].getChemistry()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33)||(ref[i].getPhysics()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33)||(ref[i].getEnglish()<33 &&ref[i].getMath()<33&&ref[i].getChemistry()<33)||(ref[i].getPhysics()<33&&ref[i].getMath()<33&&ref[i].getEnglish()<33))
		{     
			System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
			
			if(ref[i].getPhysics()<33&&ref[i].getMath()<33&&ref[i].getChemistry()<33)
					System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tchemistry ");
			
			else if(ref[i].getPhysics()<33&&ref[i].getChemistry()<33&&ref[i].getHindi()<33)
					System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\thindi");
				
			else if(ref[i].getPhysics()<33&&ref[i].getMath()<33&&ref[i].getHindi()<33)
					System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\thindi ");
				
			else if(ref[i].getChemistry()<33&&ref[i].getMath()<33&&ref[i].getHindi()<33)
					System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\tmath\n|\thindi ");	
					
			else if(ref[i].getPhysics()<33&&ref[i].getChemistry()<33&&ref[i].getEnglish()<33)
					System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\tenglish ");	
			
			else if(ref[i].getMath()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33)
					System.out.println("|\tFail in three Subject:\n|\tmath\n|\thindi\n|\tenglish ");	
			
			else if(ref[i].getChemistry()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33)
					System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\thindi\n|\tenglish ");
			
			else if(ref[i].getPhysics()<33&&ref[i].getHindi()<33&&ref[i].getEnglish()<33)
					System.out.println("|\tFail in three Subject:\n|\tphysics\n|\thindi\n|\tenglish ");
			
			else if(ref[i].getEnglish()<33 &&ref[i].getMath()<33&&ref[i].getChemistry()<33)
					System.out.println("|\tFail in three Subject:\n|\tmath\n|\tchemistry\n|\tenglish  ");
				
			else if(ref[i].getPhysics()<33&&ref[i].getMath()<33&&ref[i].getEnglish()<33)
					System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tenglish  ");				
		}

		else if((ref[i].getPhysics()<33&&ref[i].getMath()<33)||(ref[i].getPhysics()<33&&ref[i].getChemistry()<33)||(ref[i].getPhysics()<33&&ref[i].getHindi()<33)||(ref[i].getPhysics()<33&&ref[i].getEnglish()<33)||
		(ref[i].getMath()<33&&ref[i].getChemistry()<33)||(ref[i].getMath()<33&&ref[i].getHindi()<33)||(ref[i].getMath()<33&&ref[i].getEnglish()<33)||(ref[i].getChemistry()<33&&ref[i].getHindi()<33)||(ref[i].getChemistry()<33&&ref[i].getEnglish()<33)||(ref[i].getHindi()<33&& ref[i].getEnglish()<33))
		{
			System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");
			 
			if(ref[i].getPhysics()<33&&ref[i].getMath()<33)
				System.out.println("|\tFail in two subject:\n|\tphysics\n|\tmath");
			
			else if(ref[i].getPhysics()<33&&ref[i].getChemistry()<33)	
				 System.out.println("|\tFail in two subject:\n|\tphysics\n|\tchemistry");
			
			else if(ref[i].getPhysics()<33&&ref[i].getHindi()<33)	
				 System.out.println("|\tFail in two subject:\n|\tphysics\n|\thindi");
			 
			else if(ref[i].getPhysics()<33&ref[i].getEnglish()<33)	
				 System.out.println("|\tFail in two subject:\n|\tphysics\n|\tEnglish");
			 
			else if(ref[i].getMath()<33&ref[i].getChemistry()<33)	
				 System.out.println("|\tFail in two subject:\n|\tmath\n|\tchemistry");
			 
			else if(ref[i].getMath()<33&ref[i].getHindi()<33)	
				 System.out.println("|\tFail in two subject:\n|\tmath\n|\thindi");
			 
			else if(ref[i].getMath()<33&ref[i].getEnglish()<33)	
				 System.out.println("|\tFail in two subject:\n|\tmath\n|\tenglish");
			 
			else if(ref[i].getChemistry()<33&ref[i].getHindi()<33)	
				 System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tHindi");
			 
			else if(ref[i].getChemistry()<33&ref[i].getEnglish()<33)	
				 System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tenglish");
			 
			else if(ref[i].getHindi()<33&&ref[i].getEnglish()<33)	
				 System.out.println("|\tFail in two subject:\n|\tHindi\n|\tenglish");
		}

		else if(ref[i].getPhysics()<33||ref[i].getMath()<33||ref[i].getChemistry()<33||ref[i].getHindi()<33||ref[i].getEnglish()<33)
		{      System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");

			if(ref[i].getPhysics()<33)
				System.out.println("|\tFail in one subject\n|\tphysics");
			else if(ref[i].getMath()<33)
				System.out.println("|\tFail in one subject\n|\tmath");
			else if(ref[i].getChemistry()<33)
				System.out.println("|\tFail in one subject\n|\tchemistry");
			else if(ref[i].getHindi()<33)
				System.out.println("|\tFail in one subject\n|\thindi");
			else if(ref[i].getEnglish()<33)
				System.out.println("|\tFail in one subject\n|\tEnglish");
			
		} /*COMPLETE*/

		/*ELSE BLOCK  [ Check Division ] */
		else
		{
			if(ref[i].getPhysics()>=33&&ref[i].getChemistry()>=33&&ref[i].getMath()>=33&&ref[i].getHindi()>=33&&ref[i].getEnglish()>33)
			{
				System.out.println("|\t\t\t\t\t\tStatus: | PASS");
			}
			else
			{
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
			}  
			System.out.println("|\tTotal mark is:  "+ref[i].getTotal()+"\t\t\t\t\t\t  ");		
			System.out.println("|\tPersentage is:  "+ref[i].getPer()+"\t\t");
			if(ref[i].getPer()>=60)
			{
				System.out.println("|\tpass in first Division\t\t\t\t\t\t  ");
			}
			else if(ref[i].getPer()>=45)
			{
				System.out.println("|\tpass in Second Division\t\t\t\t\t\t  ");
			}
			else if(ref[i].getPer()>=33)
			{
				System.out.println("|\tpass in Third Division\t\t\t\t\t\t  ");	
			}	
			else
			{
			System.out.println("|\t---- FAIL ----");
			}									
		}/*COMPLETE*/
		System.out.println("|-------------------------------------------------------------------------|");
	}

	//Method for search marksheet
    public void search(Pojo student[], int n)
    {
        Scanner sc = new Scanner(System.in);
		int choice,searchRoll; 
        String searchName;  
		int i=0;	 
		do{
			 System.out.println("Your choices are....."); 
			 System.out.println("\t1 For Search by Roll Number"); 
			 System.out.println("\t2 For Search by Name"); 
			 System.out.println("\t3 For Search by Division"); 
			 System.out.println("\t4 For Back"); 
			 System.out.print("\tEnter Your choice : "); 
			 choice = sc.nextInt(); 
			 sc.nextLine();
			switch(choice)
			{
				case 1:
					System.out.println("serch by roll.......\nEnter roll");
					searchRoll = sc.nextInt();
					for( i=0; i<n; i++)
					{						
						 if(student[i].getRoll()==searchRoll)
						 {
							printMarksheet(student,i);   // CONTIUE...................WITH ERROR........
						 }					 
						 System.out.println();
					}
					break;
					case 2:
						System.out.println("serch by name.......\nEnter name");
						searchName = sc.nextLine();
						for( i=0; i<n; i++)
						{							
							 if(student[i].getName().equals(searchName))
							 {
								 printMarksheet(student,i);
							 }					 
							 System.out.println();
						}
					break;	
									
					case 3:
					do{
						 System.out.println("Your choices are....."); 
						 System.out.println("\t1 For first division"); 
						 System.out.println("\t2 For second division"); 
						 System.out.println("\t3 For third Division"); 
						 System.out.println("\t0 For Back"); 
						 System.out.print("\tEnter Your choice : "); 
						 choice = sc.nextInt(); 
						  switch(choice)
						  {
							  case 1:
									for(i=0; i<n; i++)
									{
										if(student[i].getPer()>=60 && student[i].getPhysics()>=33 && student[i].getChemistry()>=33&&
										student[i].getMath()>=33&&student[i].getHindi()>=33 && student[i].getEnglish()>=33)
										
										{
											printMarksheet(student,i); 
										}
									}
							  break;
							  case 2:
								for(i=0; i<n; i++)
									{
										if(student[i].getPer()>=45 && student[i].getPer()<60
										&& student[i].getPhysics()>=33 && student[i].getChemistry()>=33
										&& student[i].getMath()>=33&&student[i].getHindi()>=33 && student[i].getEnglish()>=33)
										{
											printMarksheet(student,i); 
										}
									}
							  break;
							  case 3:
								for(i=0; i<n; i++)
									{
										if(student[i].getPer()>=33 && student[i].getPer()<45
										&& student[i].getPhysics()>=33 && student[i].getChemistry()>=33
										&& student[i].getMath()>=33&&student[i].getHindi()>=33 && student[i].getEnglish()>=33)
										{
											printMarksheet(student,i); 
										}
									}
			
								break;	
							}
						 }while(choice!=0);		
			}
		}while(choice!=4);
    }

	public void update(Pojo std[],OpMarksheet op)
	{		
		std[0].setN(Marksheet.input(std,op,std[0].getN()));
	}

}
//client class 
class Marksheet{
    
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
    
	public static void main(String[] args)
	{       
		Marksheet ob = new Marksheet();
		ob.choice();
    }
}

