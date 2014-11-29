package com.pic.IO.NIOMyself;

import java.nio.ByteBuffer;

public class BufferSliceTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ByteBuffer buffer=ByteBuffer.allocate(16);
		for(int i = 0; i < buffer.capacity(); i++)
		{
			buffer.put((byte)i);
		}
		
		buffer.position(10);
		buffer.limit(12);
		
		ByteBuffer subBuffer=buffer.slice();
		
		for(int i = 0; i < subBuffer.capacity(); i++)
		{
			byte b=subBuffer.get(i);
			b*=10;
			subBuffer.put(i, b);
		}
		
		buffer.clear();
		
		while(buffer.hasRemaining())
		{
			System.out.println(buffer.get());
		}

	}

}
