package com.pic.IO.FileIO;

import java.io.File;
import java.util.ArrayList;

public class ShowAll
{
	public static int i;

	public ShowAll()
	{
		// TODO Auto-generated constructor stub
	}
	
	public static void showAllFiles(File f)
	{
		if(f.isFile())
		{
			System.out.println(showTabs(i)+" "+f.getName());
		}
		else if(f.isDirectory())
		{
			System.out.println(showTabs(i)+"/"+f.getName()+"/");
			i++;
			File[] files=f.listFiles();
			files=sorted(files);
			for(File file:files)
			{
				showAllFiles(file);
			}
			i--;
		}
	}
	
	public static File[] sorted(File[] files)
	{
		ArrayList<File> fs=new ArrayList<File>();
		for(File f:files)
		{
			if(f.isFile())
			{
				fs.add(f);
			}
		}
		for(File f:files)
		{
			if(f.isDirectory())
			{
				fs.add(f);
			}
		}
		return fs.toArray(new File[files.length]);
	}
	
	public static String showTabs(int i)
	{
		StringBuffer stringBuf=new StringBuffer();
		for(int j=0;j<i;j++)
		{
			stringBuf.append("\t");
		}
		return stringBuf.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		File f=new File("F:\\Algorithms");
		showAllFiles(f);
	}

}
