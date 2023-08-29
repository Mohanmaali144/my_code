package animaldog;
import animaldata.AnimalData;

public class Dog extends AnimalData
{
	private String breed; 
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public String getBreed()
	{
		return this.breed;
	}
}