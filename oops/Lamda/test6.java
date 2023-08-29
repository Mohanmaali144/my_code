interface in1 {
	
	String display();
}
class Main {
	
	public static void main(String []arfg)
	{
		
		// in1 ob =()-> return "hello";           //can not define this type
		in1 ob =()-> "hello";
		System.out.println(ob.display());
	}
	
}