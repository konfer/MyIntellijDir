package com.pic.IO.TransferByteIO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayOutputStreamTest
{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		String str = "My ByteArrayOutputStream Test";
		byte[] buffer = str.getBytes();
		f.write(buffer);
		f.write(84);
		byte[] result = f.toByteArray();
		
		for(int i = 0; i < result.length; i++)
		{
			System.out.print((char) result[i]);
		}
		
		OutputStream os=new FileOutputStream("D:\\OutPut.txt");
		f.writeTo(os);
		f.close();
		os.close();
	}

}
