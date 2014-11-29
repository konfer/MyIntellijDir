package com.pic.IO.TransferCharIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest
{

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
		Person p=new Person(1,"GOODMAN",5.42);
		RandomAccessFile raf=new RandomAccessFile("OutPut.txt", "rw");
		p.write(raf);
		
		Person p2=new Person();
		raf.seek(0);
		p2.read(raf);
		
		System.out.println(p2.getName()+" "+p2.getHeight());
	}
	
	

}
