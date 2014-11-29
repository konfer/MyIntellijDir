package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetString
{
	public static String getString() throws IOException
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		String s=br.readLine();
		System.out.println("Test git branch");
		System.out.println("master amd branch");
		System.out.println("branch dev Test");
		return s;
	}
	
	//public static void display()
	
}
