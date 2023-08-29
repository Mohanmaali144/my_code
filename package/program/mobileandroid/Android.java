package mobileandroid;
import mobiledata.MobileData;
public class Android extends MobileData
{	
	private int camera;
	private float storage;
	private String lock;
	public void setCamera(int camera)
	{
		this.camera = camera;
	}
	public int getCamera()
	{
		return this.camera;
	}
	public void setStorage(float storage)
	{
		this.storage = storage;
	}
	public float getStorage()
	{
		return this.storage;
	}
	public void setLock(String lock)
	{
		this.lock = lock;
	}
	public String getLock()
	{
		return this.lock;
	}
}