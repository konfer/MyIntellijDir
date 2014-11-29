package com.pic.IO.NIOMyself;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferTest
{

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis =  new FileInputStream("E:\\NIOTestInput.txt");
		FileOutputStream fos =  new FileOutputStream("E:\\NIOTestOutput.txt");
		FileChannel readFc =  fis.getChannel();
		FileChannel writeFc =  fos.getChannel();

		ByteBuffer buffer =  ByteBuffer.allocate(1024);
		System.out.println("limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
		
		for(int i =  0; i < 10; i++)                                                     
		{
			buffer.put((byte)i);
			System.out.println("limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
			
		}
		
		buffer.put(8, (byte)10);
		System.out.println("After put:limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
		
//		buffer.flip();
//		System.out.println("After flip:limit= "+buffer.limit()+" position= "+buffer.position()+" capacity= "+buffer.capacity());
//		
//		while(true)
//		{
			buffer.clear();
			//buffer.rewind();
			
			System.out.println("After clear:limit= "+buffer.limit()+" position= "+buffer.position()+" capacity= "+buffer.capacity());
			 
			readFc.read(buffer);
			System.out.println("buffer length:"+buffer.limit());
			//int len =  readFc.read(buffer);
			System.out.println("After read:limit= "+buffer.limit()+" position= "+buffer.position()+" capacity= "+buffer.capacity());
			
//			if(len ==  -1)  
//			{
//				break; qw 
//			}

			buffer.flip();
			
			while(buffer.hasRemaining())
			{
				System.out.println("After flip:limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
				
				System.out.println((char)buffer.get());
				System.out.println("After flip get:limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
				if(buffer.position()== 15)
				{
					buffer.rewind();
					System.out.println("After rewind:limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
					
					break;
				}
			}
			
			writeFc.write(buffer);
			
//			byte[] b=new byte[100];
//			buffer.get(b);
			
			System.out.println("After write:limit= "+buffer.limit()+"position= "+buffer.position()+"capacity= "+buffer.capacity());
			
			buffer.rewind();
			
			while(buffer.hasRemaining())
			{
				System.out.println((char)buffer.get());
				if(buffer.position()==4)
				{
					buffer.mark();
				}
			}
			
			System.out.println("after markTest:limit="+buffer.limit()+" position= "+buffer.position()+" capacity= "+buffer.capacity());
			buffer.reset();
			
			while(buffer.hasRemaining())
			{
				System.out.println((char)buffer.get());
				
			}
			System.out.println("after markTest:limit="+buffer.limit()+" position= "+buffer.position()+" capacity= "+buffer.capacity());
			
			
		//}

		readFc.close();
		writeFc.close();

	}

}
