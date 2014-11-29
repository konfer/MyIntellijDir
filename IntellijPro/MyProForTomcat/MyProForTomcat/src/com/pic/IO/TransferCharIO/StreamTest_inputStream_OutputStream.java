package com.pic.IO.TransferCharIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class StreamTest_inputStream_OutputStream
{
	public static void main(String[] args) throws IOException
	{
		OutputStream os=new FileOutputStream("D:\\OutPut.txt");
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);
		bw.write("fh12hefg8qwhfdsiahf8o1fh8eodhwofeh2oq8he3qhfehfuidshfiuo3ehfieo");
		bw.write("\n");
		bw.write("c2q3fgdw");
		bw.close();
		
		InputStream is=new FileInputStream("D:\\OutPut.txt");
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		
		String str=br.readLine();
		
		while(str!=null)
		{
			System.out.println(str);
			str=br.readLine();
		}
		
		br.close();
		
		
	}
}
