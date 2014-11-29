package ThinkInJavaExample.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class TextFileTest extends ArrayList<String>
{
	
	public TextFileTest(String fileName)
	{
		this(fileName, "\n");
	}
	
	public TextFileTest(String fileName,String splitter)
	{
		super(Arrays.asList(read("D://sgecconfig.xml").split(splitter)
				));
		if(get(0).equals(" "))
		{
			remove(0);
		}
	}
	
	public static String read(String fileName)
	{
		StringBuilder sBuilder=new StringBuilder();
		try
		{
			File f=new File(fileName);
			BufferedReader br=new BufferedReader(new FileReader(f.getAbsoluteFile()));
			try
			{
				String s;
				while((s=br.readLine())!=null)
				{
					sBuilder.append(s);
					sBuilder.append("\n");
				}
			}
			finally
			{
				br.close();
			}
		}catch(IOException e){
			throw new RuntimeException();
		}
		return sBuilder.toString();
	}
	
	public void write(String fileName)
	{
		try
		{
			PrintWriter out=new PrintWriter(new File(fileName).getAbsoluteFile());
			try
			{
				for(String str:this)
				{
					out.println(str);
				}
			}
			finally
			{
				out.close();
			}
		}catch(IOException e){
			throw new RuntimeException();
		}
	}
	
	public void outPut()
	{
		for(String str:this)
		{
			System.out.println(str);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		TextFileTest txtList=new TextFileTest("D:\\sgecconfig.xml", "<");
		
		System.out.println(txtList.get(45));

	}

}
