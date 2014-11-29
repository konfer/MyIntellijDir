package ThinkInJavaExample.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class FileLocking
{

	/**
	 * @param args  
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileOutputStream fos=new FileOutputStream("file.txt");
		FileLock fl=fos.getChannel().tryLock();
		if(fl!=null)
		{
			System.out.println("file locked");
			TimeUnit.MILLISECONDS.sleep(1000);
			fl.release();
			System.out.println("lock released");
		}
		fos.close();
	}

}
