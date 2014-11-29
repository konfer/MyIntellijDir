package com.pic.IO.TransferByteIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTestOne
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		OutputStream os=new FileOutputStream("D:\\OutPut.txt" );
		String str="good"; 
		byte[] buffer=str.getBytes();
		
		os.write(buffer);
		os.close();
	}

}
