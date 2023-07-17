import java.util.Scanner;

class Student {
	int rolno;
	String name;
	public Student() {
		
	}
	public Student(int rolno,String name)
	{
		this.rolno = rolno;
		this.name = name;
	}
	public void display() {
		
		System.out.println("Roll = "+this.rolno);
		System.out.println("Name = "+this.name);
	}
}
interface Extra {
	int total();
}
class Marks extends Student {
	
	int physics,chemistry,math;
	public Marks(int physics,int chemistry,int math,int rolno,String name) {
		
		super(rolno,name);
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
	}
	public void display()
	{
		super.display();
		System.out.println("physics = "+this.physics);
		System.out.println("chemistry = "+this.chemistry);
		System.out.println("chemistry = "+this.physics);
	} 
	
}
class Result extends Marks implements Extra {
	2
	public Result(int physics,int chemistry,int math,int rolno,String name) {
		
		super(physics,chemistry,math,rolno,name);
	}
	@Override
	 public int total()
	 {
		 return this.physics + this.chemistry+this.math;
	 }
	 public void display()
	 {
		 super.display();
	 } 
	 public double percentage(int tot)
	 {
		 return tot/3.0;
	 }
}
class StudentClint {
	
	public static void main(String args[])
	{
		Result ob = new Result (80,70,50,101,"Nitin");
		ob.display();
		int tot = ob.total();
		double per = ob.percentage(tot);
		System.out.println("total = "+tot);
		System.out.println("percentage = "+per);	
	}
}