package com.pic.IO.FileIO;

import java.io.File;

public class DeleteAll
{
	
	public static void deleteAllFile(File f)
	{
		if(f.isFile())
		{
			f.delete();
		}
		else
		{
			File[] files=f.listFiles();
			for(File file:files)
			{
			    deleteAllFile(file);
			}
			f.delete();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		File f=new File("F:\\test");
		deleteAllFile(f);
	}

}
