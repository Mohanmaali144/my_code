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
		this.h = t1.h + t2.h;
		this.m = t1.m + t2.m;
		this.s = t1.s + t2.s;
		if(this.s>=60 || this.m>=60)
		{
			this.m = this.m + s/60;
			this.s = s%60;
			this.h = this.h + m/60;
			this.m = m%60;			
		}
	}
	public void (Time t1,Time t2)
	{		
		this.h = t1.h + t2.h;
		this.m = t1.m + t2.m;
		this.s = t1.s + t2.s;
		if(this.s>=60 || this.m>=60)
		{
			this.m = this.m + s/60;
			this.s = s%60;
			this.h = this.h + m/60;
			this.m = m%60;			
		}
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
		//t1.display();
		//t2.display();
		t3.addTime(t1,t2);
		t3.display();
	}
}
	
