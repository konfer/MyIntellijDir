package ThinkInJavaExample.Thread.MultiEntrances;

public class MyCounter
{
	private volatile int count;
	
	public synchronized void increment()
	{
		count++;
	}
	
	public synchronized int getValue()
	{
		return count;
	}

}
