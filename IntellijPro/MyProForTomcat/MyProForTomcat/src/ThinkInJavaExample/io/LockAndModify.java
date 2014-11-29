package ThinkInJavaExample.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class LockAndModify extends Thread
{
	private ByteBuffer buff;
	private int start;
	private int end;
	private FileChannel fc;
	private String name;
	private int num;
	
	/**
	 * @param bBuffer
	 * @param _start
	 * @param _end
	 * @param fc
	 * @param _name
	 */
	public LockAndModify(ByteBuffer bBuffer,int _start,int _end,FileChannel fc,String _name,int _num)
	{
		this.fc=fc;
		this.start=_start;
		this.end=_end;
		this.name=_name;
		this.num=_num;
		bBuffer.limit(end);
		bBuffer.position(start);
		buff=bBuffer.slice();
	}
	
	public void run()
	{
		try
		{
			FileLock fl=fc.lock(start, end, false);
			System.out.println(name+" Locked: "+start+" to "+end);
			while(buff.hasRemaining())
			{	
				byte b=(byte)(buff.get()+num);
				System.out.println("before put :"+buff.position());
				buff.put(b);
				System.out.println("after put :"+buff.position());
				System.out.println(name+" "+buff.position()+" "+b);
			}
			fl.release();
			System.out.println(name+ " released: "+start+" to "+end); 
		}
		catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	

}
