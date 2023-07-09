// Encapsulation
class Employee		
{
	private int emp_id;     // private variable
	
	private void setId(int emp_1) // setId method  for Modify 
	{
		emp_id = emp_1;
	}
	public int getId()	// getId method  for get value
	{
		return emp_id;
	}
}
class Emp
{
	public static void main(String []arg)
	{
		Employee E = new Employee();
		E.setId(12);
		System.out.println(E.getId());	
	}	
}