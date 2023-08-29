package bl;
import bin.*;
import java.io.*;

public class Bl{

 	 public void creatFile()throws Exception
	{
		File fobj = new File("emplyeedata.txt");	
		FileOutputStream fos = new FileOutputStream(fobj);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Employee em = new Employee("kamal",1234,18000.50);
		oos.writeObject(em);
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fobj));	
		Employee obj = (Employee) ois.readObject();
		
		System.out.println(obj);
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		System.out.println(obj.getSalary());
	}	
}