package com.pic.IO.TransferCharIO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.RandomAccess;

public class Person implements Serializable
{
	private int id;
	private double height;
	private String name;
	
	public Person()
	{
		
	}
	
	
	
	public int getId()
	{
		return id;
	}



	public void setId(int id)
	{
		this.id = id;
	}



	public double getHeight()
	{
		return height;
	}



	public void setHeight(double height)
	{
		this.height = height;
	}



	public String getName()
	{
		return name;
	}



	public void setName(String name)
	{
		this.name = name;
	}



	public Person(int id,String name,double height)
	{
		this.id=id;
		this.name=name;
		this.height=height;
	}
	
	public void write(RandomAccessFile raf) throws IOException
	{
		raf.writeInt(id);
		raf.writeUTF(name);
		raf.writeDouble(height);
	}
	
	public void read(RandomAccessFile raf) throws Exception
	{
		this.id=raf.readInt();
		this.name=raf.readUTF();
		this.height=raf.readDouble();
	}
	
	private void writeObject(ObjectOutputStream out) 
	{
		System.out.println("write Object");// TODO Auto-generated method stub

	}
	
	private void readObject(ObjectInputStream ois)
	{
		System.out.println("read Object");

	}
	
}
