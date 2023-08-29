import java.io.*;

class Main {

	public static void main(String args[]) throws IOException
	{
		File fobj = new File("primitive.txt");
		
		FileOutputStream fos = new FileOutputStream(fobj);
		
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeByte(55);
		dos.writeInt(500);
		dos.writeChar('m');
		//dos.writeChar('p');	
		dos.writeLong(665789);
		dos.writeFloat(5.5f);
		
		dos.close();
		fos.close();
		
		
		
		DataInputStream dis = new DataInputStream(new FileInputStream(fobj));
		
		System.out.println("value = "+dis.readByte());
		System.out.println(" value = "+dis.readInt());
		//System.out.println("value = "+dis.readByte());
		
		
		
		System.out.println(" value = "+dis.readChar());
		//System.out.println("value = "+dis.readByte());
		
		//System.out.println(" value = "+dis.readChar());
		


		//System.out.println(" value = "+dis.readLong());
		//System.out.println(" value = "+dis.readChar());
		
		
		
		System.out.println(" value = "+dis.readFloat());
		System.out.println(" value = "+dis.readLong());			
		dos.close();
		fos.close();
				
	}
}

