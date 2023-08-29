package vehiclecar;
import vehicledata.Vehicle;
public class Car extends Vehicle 
{
	private String num_plate;
	private int wheel;
	public void setNumPlate(String num_plate)
	{
		this.num_plate = num_plate;
	}
	public String getNumPlate()
	{
		return this.num_plate;
	}
	public void setWheel(int wheel)
	{
		this.wheel= wheel;
	}
	public int getWheel()
	{
		return this.wheel;
	}
}