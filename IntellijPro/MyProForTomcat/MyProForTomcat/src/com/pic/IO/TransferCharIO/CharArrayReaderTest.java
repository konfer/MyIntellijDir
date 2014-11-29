package com.pic.IO.TransferCharIO;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTest
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		String temp="fhduwhuweo";
		char[] ch=new char[temp.length()];
		temp.getChars(0, temp.length(), ch, 0);
		
		CharArrayReader input=new CharArrayReader(ch);
		
		int i;
		while((i=input.read())!=-1)
		{
			System.out.println((char)i);
		}
		
		input.close();

	}

}
