package com.pic.IO.SerializableTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamForArrayTest
{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		int[] numbers={1,2,3,4,5};
		String[] strings={"john","jim","jake"};
		
		FileOutputStream fos=new FileOutputStream("D:\\OutPut.txt",true);
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(fos));
		
		oos.writeObject(numbers);
		oos.writeObject(strings);
		
		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("D:\\OutPut.txt")));
		
		int[] newNumbers=(int[])(ois.readObject());
		String[] newStrings=(String[])(ois.readObject());
		
		for(int i=0;i<newNumbers.length;i++)
		{
			System.out.println(newNumbers[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < newStrings.length; i++)
		{
			System.out.println(newStrings[i]);
		}
		
		ois.close();
		
	}

}
