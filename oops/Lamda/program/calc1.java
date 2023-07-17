interface MyCalc {

	double display(double a,double b);
}




class MyMain {
	
	public static void main(String []args)
	{
		MyCalc ob = (x,y)-> (x+y);
		MyCalc ob1 = (x,y)-> (x-y);
		MyCalc ob2 = (x,y)-> (x*y);
		MyCalc ob3 = (x,y)-> (x/y);
		
		System.out.println(ob1.display(8,6));
	}
}