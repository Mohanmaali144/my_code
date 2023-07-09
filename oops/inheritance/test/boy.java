//single
class School
{
	double  ten;
	public void setData(double ten)
	{
		this.ten = ten;
	}
	public void per()
	{
		if(this.ten>=60)
		{
			System.out.println("you can addmit in 11th and can take any subject");
		}
		else if(this.ten>=45)
		{
			System.out.println("you can addmit in 11th but can not take math subject");
		}
		else if(this.ten>=33)
		{
			System.out.println("you can addmit in 11th but can take only art or Ag");
		}
		else
		{
			System.out.println("you are fail");
		}
		
		
	}
} 
class College extends School
{
	private double twel;
	public void setData(double ten,double twel )
	{
		this.setData(ten);
		this.twel=twel;
	}
	public void per(int ten)
	{
		if(this.twel>60 && ten>60)
		{
			System.out.println("You can admit in college and can take any subject");
		}
		else if(this.twel>=45 || (ten>=45&&this.twel>=33))
		{
			System.out.println("You can admit in college but can not take B.tac subject");
		}
		else if(this.twel>=33)
		{
			System.out.println("You can admit in college and  can take only BA or Bsc seed subject");
		}
		else
		{
			System.out.println("You can not admit in college ");
		}		
	}
}
class Main
{
	public static void main(String []args)
	{
		College ob = new College();
		ob.setData(60.7,67);
		//ob.per();
		ob.per(56);
	}
}