package com.pic.Thread;

public class Counter
{
	public volatile static int count=0;
	public static void inc()
	{
		try
		{
			Thread.sleep(5);
		}
		catch(InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count++;
	//	System.out.println(count);
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		for(int i = 0; i < 2000; i ++ )
		{
			new Thread(new Runnable()
			{

				@Override
				public void run()
				{
					Counter.inc();
					
				}
				
			}).start();
		}
		
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----------------");
		System.out.println(Counter.count);

	}

}
