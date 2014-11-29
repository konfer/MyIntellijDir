package ThinkInJavaExample.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile
{
	public static String read(String filename) throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sBuilder=new StringBuilder();
		while((s=br.readLine())!=null)
		{
			sBuilder.append(s+"\n");
		}
		br.close();
		return sBuilder.toString();
		
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		System.out.println(read("D:\\config.xml"));

	}

}
