package ThinkInJavaExample.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public class LockingMappedFiles
{
	public static final int LENGTH=0x8A;
	public static FileChannel fc;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		fc=new RandomAccessFile("E://_textInputMap.txt", "rw").getChannel();
		MappedByteBuffer out=fc.map(FileChannel.MapMode.READ_WRITE, 0, LENGTH);
		for(int i=0;i<LENGTH;i++)
		{
			out.put((byte)'x');
		}
		
		new LockAndModify(out, 0, 0+LENGTH/3, fc,"1/3",1).start();
		new LockAndModify(out, LENGTH/2, LENGTH/2+LENGTH/4, fc,"1/2",2).start();
		
	}

}
