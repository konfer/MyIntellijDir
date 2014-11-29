package com.pic.IO.TransferCharIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileStreamTest_FileWriter_FileReader
{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		Reader rd = new FileReader("F:\\ByteArrayInputStreamTest.java");
		BufferedReader br = new BufferedReader(rd);
		String str;

		Writer wt = new FileWriter("D:\\OutPut.txt");
		BufferedWriter bw = new BufferedWriter(wt);

		while((str = br.readLine()) != null)
		{
			System.out.println(str);
			bw.write(str + "\n");
		}

		bw.close();
		br.close();

		// Writer wt=new FileWriter("D:\\OutPut.txt") ;
		// BufferedWriter br=new BufferedWriter(wt);
		//
		// br.write("fjdhiw\n");
		// br.write("/n");
		// br.write("fhdiwohfe2");
		//
		// br.close();

		// Writer wt=new FileWriter("D:\\OutPut.txt");
		// BufferedWriter bw=new BufferedWriter(wt);
		//
		//
		// bw.write("ouhghufd");

		//

	}

}
