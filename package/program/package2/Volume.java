package package2;

public class Volume {
	
		public double square(double side1)
		{
			return  (side1*side1*side1);
		}
		
		public double triangle(double l,double b,double h)
		{
			return l*b*h;
		}
		
		public double circle(double r)
		{
			return 4/3*3.14*(r*r*r);
		}	
}