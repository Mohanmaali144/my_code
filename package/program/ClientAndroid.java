import mobileandroid.Android;
class ClientAndroid
{
	public static void main(String []args)
	{
		Android ob = new Android();
		
		ob.setPrice(25000);
		ob.setBrand("Semsung");
		ob.setLength(6);
		ob.setWeight(400);
		ob.setColor("White");
		ob.setCamera(54);
		ob.setStorage(128);
		ob.setLock("Finger-print");
		System.out.println("Brand : "+ob.getBrand());
		System.out.println("Color : "+ob.getColor());
		System.out.println("Camera : "+ob.getCamera()+" MF");
		System.out.println("Storage : "+ob.getStorage()+" GB");
		System.out.println("Length : "+ob.getLength()+" Inch");
		System.out.println("Weight : "+ob.getWeight()+" Gram");
		System.out.println("Price : "+ob.getPrice()+" /-");
	}
}