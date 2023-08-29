package companydata;

public class CompanyData {

	private String cName;
	private String owner;
	private  int employee;
	
	public void setCName(String cName)
	{
		this.cName = cName;
	}
	public String getCName()
	{
		return this.cName;
	}
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	public String getOwner()
	{
		return this.owner;
	}
	public void setEmployee(int employee)
	{
		this.employee = employee;
	}
	public int getEmployee()
	{
		return this.employee;
	}
}