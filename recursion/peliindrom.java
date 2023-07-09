// pelindrom
class Pelindrom
{
	int rev=0;
	public static void main (String arg[])
	{
		Pelindrom ob = new Pelindrom();
		System.out.println("Enter a num");
		int n=sc.nextInt();
		ob.check_Pelin(n);
	}
	
	public void check_Pelin(int n)
	{
		this.rev(n);
		if(n==rev)
		{
			System.out.println("Pelindrom");
		}
		else
		{
			System.out.println("Not pelindrom");
		}
	}
	public int rev(int n)
	{
		if(n==0)
		{
			return rev;
		}
		int re = n%10;
		rev=rev*10+re;
		return this.rev(n/10);
	}
}