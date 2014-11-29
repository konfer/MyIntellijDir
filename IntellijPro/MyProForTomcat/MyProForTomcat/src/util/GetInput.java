package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class GetInput
{
	private GetInput()
	{
		
	}
	
	public static String getString() throws IOException
	{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		String s=br.readLine();
		br.close();
		return s;
	
	}
	
	public static int getInt() throws IOException
	{
		String s=getString();
		int i=Integer.parseInt(s);
		return i;
	}
	
	//public static void display()
	
}
