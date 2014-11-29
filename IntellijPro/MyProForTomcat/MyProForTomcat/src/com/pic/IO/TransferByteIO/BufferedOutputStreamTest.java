package com.pic.IO.TransferByteIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamTest
{

	public static void main(String[] args) throws IOException
	{
		OutputStream os=new FileOutputStream("D:\\config.xml");
		BufferedOutputStream bos=new BufferedOutputStream(os);
		bos.write("buffered stream".getBytes());
		bos.close();
	}
	
}
 