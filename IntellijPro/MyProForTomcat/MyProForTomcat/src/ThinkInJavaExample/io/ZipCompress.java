package ThinkInJavaExample.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipOutputStream;

public class ZipCompress
{

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		FileOutputStream fos=new FileOutputStream("E:\\text.zip");
		CheckedOutputStream csum=new CheckedOutputStream(fos, new Adler32());
		ZipOutputStream zos=new ZipOutputStream(csum);
		BufferedOutputStream out =new BufferedOutputStream(zos);
		zos.setComment("A test of java zipping");
		
		//for(String str:args)

	}

}
