
class ToChar {	
	
	public static char[] StringtoChar(StringBuilder s1)
	{
		int i;
		char s[] = new char [30];	
		for( i=0; i<s1.length();i++) {
		
			 s[i] = s1.charAt(i);
		}
		return s;
	} 
}

class Main {
	
	public static void main(String args[])
	{
		StringBuilder s1 = new StringBuilder("Rohit");
		char s[] = ToChar.StringtoChar(s1);
		for( int i=0; i<s1.length();i++) {
			System.out.println(s[i]+" = "+(int)s[i]);
		} 
	}
}





