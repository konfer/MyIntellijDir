package com.pic.IO.TransferByteIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataOutputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\OutPut.txt")));
		byte b=6;
		int i=2;  
		float f=4.0f;
		char ch='a';
		
		dos.writeInt(i);
		dos.writeByte(b);
		dos.writeChar(ch);
		dos.writeFloat(f);
		
		dos.close();
		
		InputStream is=new FileInputStream("D:\\OutPut.txt");
		DataInputStream dis=new DataInputStream(new BufferedInputStream(is));
		
		System.out.println(dis.readInt());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());
		
		dis.close();
				
	}
}
