package ThinkInJavaExample.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FormattedMemoryInputTest
{
	
	public static void printFileByByteArrayInputStream(String filename) throws IOException
	{
		String str=BufferedInputFile.read(filename);
		ByteArrayInputStream bis=new ByteArrayInputStream(str.getBytes());
		DataInputStream dis=new DataInputStream(new BufferedInputStream(bis));
//		while(dis.available()!=0)
//		{
//			System.out.print((char)dis.readByte());
//		}
		//System.out.println((char)in.readByte());
	}
	
	public static void printFileByFileInputStream(String filename) throws IOException
	{
		FileInputStream fis=new FileInputStream(filename);
		DataInputStream dis=new DataInputStream(new BufferedInputStream(fis));
//		while(dis.available()!=0)
//		{
//			System.out.print((char)dis.readByte());
//		}
	}


	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
//		long time=System.currentTimeMillis();
//		printFileByByteArrayInputStream("D:\\sgecconfig.xml");
//		System.out.println(System.currentTimeMillis()-time);
//		long time1=System.currentTimeMillis();
//		printFileByFileInputStream("D:\\sgecconfig.xml");
//		System.out.println(System.currentTimeMillis()-time1);
		
		File f=new File("D:\\sgecconfig.xml");
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());

	}

}
