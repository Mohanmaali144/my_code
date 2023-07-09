class A
{
    int a =9;
    int b = 5;
    void show()
    {
        B ob2 = new B();
		ob2.display();	
		System.out.println("A = "+a+" B = "+b);
    }

	private class B
    {
        public void display()
        {
            System.out.println("Hello class B static");
        }
    }
}
class Main
{    
    public static void main(String[] args) 
    {
        A ob = new A();
        ob.show();
    }
}