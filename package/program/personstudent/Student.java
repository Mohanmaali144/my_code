package personstudent;
import persondata.PersonData;

public class Student extends PersonData
{
	private String clas;
	private int fees ;
	private int roll ;
	public void setClas(String clas)
	{
		this.clas = clas;
	}
	public String getClas()
	{
		return this.clas;
	}
	public void setFees(int fees)
	{
		this.fees = fees;
	}
	public int getFees()
	{
		return this.fees;
	}
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	public int getRoll()
	{
		return this.roll ;
	}
}