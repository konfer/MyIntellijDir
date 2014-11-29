package ThinkInJavaExample.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class LargeMappedFiles
{
	public static int length = 0x8FFFFFF;

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException,
			IOException
	{
		MappedByteBuffer out = new RandomAccessFile("E://textInputMap.txt",
				"rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0,
				length);
		
		for(int i=0;i<length;i++)
		{
			out.put((byte)'x');
		}
		
		System.out.println("finding writing");
		
		for(int i=length/2;i<length/2+6;i++)
		{
			System.out.println((char)out.get(i));
		}

	}

}
