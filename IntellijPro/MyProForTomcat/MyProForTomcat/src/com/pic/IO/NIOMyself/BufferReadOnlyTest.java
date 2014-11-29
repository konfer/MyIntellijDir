package com.pic.IO.NIOMyself;

import java.nio.ByteBuffer;

public class BufferReadOnlyTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ByteBuffer buffer=ByteBuffer.allocate(20);
		
		for(int i=0;i<buffer.capacity();i++)
		{
			buffer.put((byte)i);
		}
		
		buffer.flip();
		
		while(buffer.hasRemaining())
		{
			System.out.println(buffer.get());
		}
		buffer.put(0,(byte)38);
		
		buffer.clear();
		
		ByteBuffer readOnlyBuffer=buffer.asReadOnlyBuffer();
		System.out.println("limit= "+readOnlyBuffer.limit()+"position= "+readOnlyBuffer.position()+"capacity= "+readOnlyBuffer.capacity());
		
		
		readOnlyBuffer.flip();
		
		System.out.println("limit= "+readOnlyBuffer.limit()+"position= "+readOnlyBuffer.position()+"capacity= "+readOnlyBuffer.capacity());
		
		readOnlyBuffer.limit(15);
		readOnlyBuffer.position(10);
		readOnlyBuffer.flip();
		
		System.out.println("limit= "+readOnlyBuffer.limit()+"position= "+readOnlyBuffer.position()+"capacity= "+readOnlyBuffer.capacity());
		
		
		while(readOnlyBuffer.hasRemaining())
		{
			System.out.println(readOnlyBuffer.get());
		}
		
		buffer.position(5);
		buffer.limit(15);
		
		System.out.println("last read :limit= "+readOnlyBuffer.limit()+"position= "+readOnlyBuffer.position()+"capacity= "+readOnlyBuffer.capacity());
		System.out.println("last read :limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
		
		buffer.clear();
		
		System.out.println("last read :limit= "+readOnlyBuffer.limit()+"position= "+readOnlyBuffer.position()+"capacity= "+readOnlyBuffer.capacity());
		System.out.println("last read :limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
		
		readOnlyBuffer.position(5);
		
		buffer.limit(18);
		System.out.println("last read :limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
		
		
		buffer.put(5, (byte)50);
		buffer.put(7,(byte)70);
		buffer.put((byte)40);
		System.out.println("last read :limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
		
		
		while(readOnlyBuffer.hasRemaining())
		{
			System.out.println("get it "+readOnlyBuffer.get());
		}
		
		
		
	}

}
