package com.pic.IO.NIOMyself;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MapByteBufferTest
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		RandomAccessFile raf=new RandomAccessFile("D:\\RandomAccess.txt", "rw");
		FileChannel randomFc=raf.getChannel();
		MappedByteBuffer mbb=randomFc.map(FileChannel.MapMode.READ_WRITE, 0, raf.length());
		
		while(mbb.hasRemaining())
		{
			System.out.println((char)mbb.get());
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
		
		mbb.put(0,(byte)98);
		raf.close();

	}

}
