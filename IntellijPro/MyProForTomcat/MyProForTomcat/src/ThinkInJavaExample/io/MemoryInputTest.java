 package ThinkInJavaExample.io;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInputTest
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		StringReader in=new StringReader(BufferedInputFile.read("D:\\config.xml"));
		int c;
		while((c=in.read())!=-1)
		{
			System.out.print((char)c);
		}

	}

}
