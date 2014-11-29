package ThinkInJavaExample.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IoFIleCreateException
{
	public BufferedReader br;

	public IoFIleCreateException(String name) throws Exception
	{
		try
		{
			br = new BufferedReader(new FileReader(name));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("cannot find:" + name);
			throw e;
		}
		catch(Exception e1)
		{
			try
			{
				br.close();
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			throw e1;
		}
	}

	public String getStringLine()
	{
		String s;
		try
		{
			s = br.readLine();
		}
		catch(IOException e)
		{
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}

	public void dispose()
	{
		try
		{
			br.close();
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			throw new RuntimeException("close failed");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String s;
		try
		{
			IoFIleCreateException ifce = new IoFIleCreateException(
					"failed.java");
			try
			{
				s = ifce.getStringLine();
				while(s != null)
				{
					System.out.println(s);
				}
			}
			catch(Exception e1)
			{
				System.out.println("Caught Exception in main");
				e1.printStackTrace();
			}
			finally
			{
				ifce.dispose();
			}
		}
		catch(Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
