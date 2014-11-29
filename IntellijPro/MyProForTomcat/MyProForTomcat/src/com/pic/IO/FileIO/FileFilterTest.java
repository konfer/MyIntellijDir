package com.pic.IO.FileIO;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilterTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		File f=new File("D:\\3DEUWEB");
//		String[] names=f.list();
//		for(String name:names)
//		{
//			if(name.lastIndexOf(".html")!=-1)
//			{
//				System.out.println(name);
//			}
//		}
		
		//FilenameFilter accept
		
		String[] names=f.list(new FilenameFilter()
		{
			
			@Override
			public boolean accept(File dir, String name)
			{
				if(name.endsWith(".html"))
				{
					return true;
				}
				return false;
			}
		});
		
		for(String name:names)
		{
			System.out.println(name);
		}
		
	}

}
