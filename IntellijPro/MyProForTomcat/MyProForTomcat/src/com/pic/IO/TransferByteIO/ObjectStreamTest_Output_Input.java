package com.pic.IO.TransferByteIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectStreamTest_Output_Input
{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("D:\\OutPut.txt"));
		
		output.writeUTF("regret");
		output.writeInt(1);
		output.writeFloat(2.5f);
		output.writeObject(new Date());
		
		output.close();
		
		ObjectInputStream input=new ObjectInputStream(new FileInputStream("D:\\OutPut.txt"));
		
		String name=input.readUTF();
		int i=input.readInt();
		float f=input.readFloat();
		Date d=(Date)input.readObject();
		
		System.out.println(name+" "+i+" "+f+" "+d);
		
		
	}

}
