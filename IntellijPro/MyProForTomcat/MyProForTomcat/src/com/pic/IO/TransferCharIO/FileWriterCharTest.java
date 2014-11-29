package com.pic.IO.TransferCharIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCharTest
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		String str="fdshah fhdishfa fds";
		char[] buffer=new char[str.length()];
		
		str.getChars(0, str.length(), buffer, 0);
		FileWriter f=new FileWriter("D:\\OutPut.txt",true);
		
//		for(int i=0;i<buffer.length;i++)
//		{
//			f.write(buffer[i]);
//		}
		
		f.write(buffer);
		
		f.close();

	}

}
