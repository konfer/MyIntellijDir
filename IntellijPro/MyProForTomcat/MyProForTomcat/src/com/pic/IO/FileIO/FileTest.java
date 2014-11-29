package com.pic.IO.FileIO;

import java.io.File;
import java.io.IOException;

public class FileTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		File f=new File("D:"+File.separator+"/sdEXTN.TXT");
		
		try
		{
			System.out.println(f.createNewFile());
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
