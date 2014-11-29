package ThinkInJavaExample.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class UsingBuffers
{
	public static void symmertricScramble(CharBuffer cb)
	{
		while(cb.hasRemaining())
		{
			cb.mark();
			char c1=cb.get();
			char c2=cb.get();
			cb.reset();
			cb.put(c2).put(c1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		char[] data="UsingBuffers".toCharArray();
		ByteBuffer bb=ByteBuffer.allocate(data.length*2);
		CharBuffer cb=bb.asCharBuffer();
		cb.put(data);
		
		System.out.println(cb.rewind());
		symmertricScramble(cb);
		System.out.println(cb.rewind());
		symmertricScramble(cb);
		System.out.println(cb.rewind());

	}

}
