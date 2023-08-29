package animalcow;
import animaldata.AnimalData;
public class Cow extends AnimalData
{
	private String breed; 
	private String tail;
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public String getBreed()
	{
		return this.breed;
	}
	public void setTail(String tail)
	{
		this.tail = tail;
	}
	public String getTail()
	{
		return this.tail;
	}
}