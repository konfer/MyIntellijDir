package com.pic.IO.TransferByteIO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStreamTest
{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		String temp = "abcde";
		byte[] b = temp.getBytes();
		InputStream bis=new ByteArrayInputStream(b);
		
		for(int i=0;i<temp.length();i++)
		{
			int c;
			while((c=bis.read())!=-1)
			{
				if(i==0)
				{
					System.out.println((char)c);
				}
				else
				{
					System.out.println(Character.toUpperCase((char)c));
				}
			}
			bis.reset();
		}

		

		// ByteArrayInputStream bis=new ByteArrayInputStream(b);
		// int
		// for(int i=0;i<temp.length();i++)
		// {
		// int c;
		// while((c.))
		// }

	}

}
