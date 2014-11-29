package com.pic.IO.SerializableTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.pic.IO.TransferCharIO.Person;

public class SerializableTest
{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Person p1=new Person(20,"zs",3.33);
		Person p2=new Person(30,"ls",3.33);
		Person p3=new Person(40,"ww",3.33);
		
		FileOutputStream fos=new FileOutputStream("D:\\Output.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream("D:\\OutPut.txt")));
		
		Person p4=(Person)ois.readObject();
		System.out.println(p4.getHeight()+" "+p4.getId()+" "+p4.getName());
		
		Person p5=(Person)ois.readObject();
		System.out.println(p5.getHeight()+" "+p5.getId()+" "+p5.getName());
		
		Person p6=(Person)ois.readObject();
		System.out.println(p6.getHeight()+" "+p6.getId()+" "+p6.getName());
		
		ois.close();

	}

}
