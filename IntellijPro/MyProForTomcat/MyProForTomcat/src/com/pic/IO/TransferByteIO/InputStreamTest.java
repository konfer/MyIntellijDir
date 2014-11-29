package com.pic.IO.TransferByteIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		InputStream fis=new FileInputStream("D:\\sgecconfig.xml");
		byte[] buf=new byte[20000];
		int length=0;
		int i=0;
		while((length=fis.read(buf, 0, buf .length))!=-1)
		{
//			String str=new String(buf,0,length);
//			System.out.println(str);
//			i++;
		}
	//	fis.read(buf, 0, buf.length);
		String str=new String(buf,0,buf.length);
		System.out.println(str);
		fis.close();
	}

}
