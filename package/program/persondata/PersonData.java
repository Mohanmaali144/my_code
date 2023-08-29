package persondata;

public class PersonData
{
	private String name;
	private float height;
	private int age;
	private int weight;
	private String gender;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHeight(float height)
	{
		this.height = height;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public void setGender(String gender)
	{	
		this.gender = gender;
	}
	public void setAge(int age)
	{	
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}
	public float getHeight()
	{
		return this.height;
	}
	public int getWeight()
	{
		return this.weight;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getGender()
	{
		return this.gender;
	}	
}
