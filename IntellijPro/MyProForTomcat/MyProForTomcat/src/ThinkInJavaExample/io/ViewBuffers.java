package ThinkInJavaExample.io;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;

public class ViewBuffers
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ByteBuffer byteBuffer=ByteBuffer.wrap(new byte[]{0,0,0,0,0,5,3,'a'});
		byteBuffer.rewind();
		
		System.out.println("Byte Buffer");
		
		while(byteBuffer.hasRemaining())
		{
			System.out.print(byteBuffer.position()+"->"+byteBuffer.get()+", ");
		}
		
		System.out.println();
		
		Buffer b=byteBuffer.rewind();
		
		FloatBuffer cb=((ByteBuffer)b).asFloatBuffer();
		System.out.println("After rewind12:limit= "+cb.limit()+"position= "+cb.position()+"capacity= "+cb.capacity());
		
		
		System.out.println("Float Buffer");
		
		while(cb.hasRemaining())  
		{
			System.out.print(cb.position()+"->"+cb.get()+", ");
		}
		
		System.out.println();

	}

}
