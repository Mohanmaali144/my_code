import 	package1.Area;
import  package2.Volume;
import  package3.Density;

class ClientClass
{
	public static void main(String []args) {
		
		Area ar = new Area();
		Volume vm = new Volume();
		Density dn = new Density();
		
		System.out.println(ar.circle(34.5));
	}
}