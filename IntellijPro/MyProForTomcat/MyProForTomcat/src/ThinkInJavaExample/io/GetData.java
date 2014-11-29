package ThinkInJavaExample.io;

import java.nio.ByteBuffer;

public class GetData
{
	private static final int Bsize=1024;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ByteBuffer bb=ByteBuffer.allocate(Bsize);
		
		int i=0;
		while(i++<bb.limit())
		{
			if(bb.get()!=0)
			{
				System.out.println("nonzero");
			}
		}
		
		System.out.println("i="+i);
		bb.rewind();
	
	    bb.asShortBuffer().put((short)975);
	    System.out.println(bb.getShort());
		
	}

}
