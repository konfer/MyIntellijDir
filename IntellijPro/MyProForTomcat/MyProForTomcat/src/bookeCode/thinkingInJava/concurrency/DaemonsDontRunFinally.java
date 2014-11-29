
package bookeCode.thinkingInJava.concurrency;

// : concurrency/DaemonsDontRunFinally.java
// Daemon threads don't run the finally clause
import java.util.concurrent.*;
import static bookeCode.thinkingInJava.net.mindview.util.Print.*;

class ADaemon implements Runnable
{
	public void run()
	{
		try
		{
			print("Starting ADaemon");
			TimeUnit.SECONDS.sleep(1);
		}
		catch(Exception e)
		{
			print("Exiting via InterruptedException");
		}
		finally
		{
			print("This should always run?");
		}
	}
}

public class DaemonsDontRunFinally
{
	public static void main(String[] args) throws Exception
	{
		Thread t = new Thread(new ADaemon());
	//	t.setDaemon(true);
		t.start();
	}
} /*
   * Output: Starting ADaemon
   */// :~
