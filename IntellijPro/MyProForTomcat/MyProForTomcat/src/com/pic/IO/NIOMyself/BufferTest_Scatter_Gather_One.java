package com.pic.IO.NIOMyself;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferTest_Scatter_Gather_One
{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		int booklen = 0;
		int authlen = 0;

		ByteBuffer bookBuf = ByteBuffer.wrap("java性能优化技巧".getBytes("utf-8"));
		ByteBuffer autBuf = ByteBuffer.wrap("葛一鸣".getBytes("utf-8"));

		booklen = bookBuf.limit();
		authlen = autBuf.limit();
		ByteBuffer[] bufs = new ByteBuffer[] { bookBuf, autBuf };
		
		FileOutputStream fos = new FileOutputStream("E:\\NIOTestOutput.txt");
		FileChannel fc = fos.getChannel();
		fc.write(bufs);
		
		ByteBuffer getBookBuffer=ByteBuffer.allocate(booklen);
		ByteBuffer getAutBuffer=ByteBuffer.allocate(authlen);
		ByteBuffer[] buff=new ByteBuffer[]{getBookBuffer,getAutBuffer};
		
		FileInputStream fis=new FileInputStream("E:\\NIOTestOutput.txt");
		FileChannel readChannel=fis.getChannel();
		readChannel.read(buff);
		
		String bookname=new String(buff[0].array(),"utf-8");
		String authname=new String(buff[1].array(),"utf-8");
		
		System.out.println(bookname+authname);
		
	}

}
