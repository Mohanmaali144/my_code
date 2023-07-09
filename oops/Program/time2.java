import java.util.Scanner;
class Time
{
	private int h,m,s;
	public void setData(int h,int m,int s)
	{
		this.h = h;
		this.m= m;
		this.s = s;
	}
	public void display()
	{
		System.out.println("Hour = "+this.h);
		System.out.println("Minute = "+this.m);
		System.out.println("Second = "+this.s);
	}
	public void addTime(Time t1,Time t2)
	{			
		// this.h = t1.h + t2.h;
		// this.m = t1.m + t2.m;
		// this.s = t1.s + t2.s;		
		int total =	t1.h*3600+t1.m*60+t1.s+t2.h*3600+t2.m*60+t2.s;
		this.h = total/3600;
		this.m = (total%3600)/60;
		this.s = (total%3600)%60;		
	}
}
class Test
{
	public static void main(String arg[])
	{
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		t1.setData(4,50,55);
		t2.setData(5,20,182);
		t3.addTime(t1,t2);
		t3.display();
	}
}
	
