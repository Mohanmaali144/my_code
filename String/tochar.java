
class ToChar {
	
	public static void main(String args[])
	{
		
		//String s1 = "Nitin";
		StringBuilder s1 = new StringBuilder("Nitin");
		int i;
		char s[] = new char [10];
		
		for( i=0; i<s1.length();i++) {
		
			 s[i] = s1.charAt(i);
		}
		for( i=0; i<s1.length();i++) {
			System.out.println(s[i]+" = "+(int)s[i]);
		} 
	}
	
}

