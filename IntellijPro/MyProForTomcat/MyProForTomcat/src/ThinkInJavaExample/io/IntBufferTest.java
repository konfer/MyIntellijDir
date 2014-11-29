package ThinkInJavaExample.io;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class IntBufferTest
{

	private static final int BSize=1024;
	
	/** 
	 * @param args
	 */
	public static void main(String[] args)
	{ 
		ByteBuffer bb=ByteBuffer.allocate(BSize);
		IntBuffer intBuffer=bb.asIntBuffer();
		
		intBuffer.put(new int[]{11,22,33,44,55,66});
		
		System.out.println(intBuffer.get(3));
		
		intBuffer.put(3, 25);
		
		intBuffer.flip(); 
		
		while(intBuffer.hasRemaining())
		{
			int i=intBuffer.get();
			System.out.println(i);
		}

	}

}
