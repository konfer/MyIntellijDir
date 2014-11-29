package com.pic.IO.TransferCharIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		Writer wt=new FileWriter("D:\\OutPut.txt") ;
		BufferedWriter br=new BufferedWriter(wt);
		
		br.write("fjdhiw\n");
		br.write("/n");
		br.write("fhdiwohfe2");
		
		br.close();
	}

}
