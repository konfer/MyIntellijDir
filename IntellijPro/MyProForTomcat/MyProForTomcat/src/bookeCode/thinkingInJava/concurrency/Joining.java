
package bookeCode.thinkingInJava.concurrency;

// : concurrency/Joining.java
// Understanding join().
import static bookeCode.thinkingInJava.net.mindview.util.Print.*;

class Sleeper extends Thread
{
	private int duration;
	private String Myname;

	public String getMyName()
	{
		return Myname;
	}

	public Sleeper(String name, int sleepTime)
	{
		super(name);
		this.Myname = name;
		duration = sleepTime;
		start();
	}

	public void run()
	{
		try
		{
			System.out.println(Myname + " begin");
			sleep(duration);
		}
		catch(InterruptedException e)
		{
			print(getName() + " was interrupted. " + "isInterrupted(): " + isInterrupted());
			return;
		}
		print(getName() + " has awakened");
	}
}

class Joiner extends Thread
{
	private Sleeper sleeper;
	private String name;

	public Joiner(String name, Sleeper sleeper)
	{
		super(name);
		this.name = name;
		this.sleeper = sleeper;
		start();
	}

	public void run()
	{
		try
		{
			System.out.println(name + " join here");
			sleeper.join();
		}
		catch(InterruptedException e)
		{
			print("Interrupted");
		}
		print(getName() + " join completed");
	}
}

public class Joining
{
	public static void main(String[] args)
	{
		Sleeper 
			sleepy = new Sleeper("Sleepy", 1000), 
			grumpy = new Sleeper("Grumpy", 1000);
		System.out.println("first ------------------");
		Joiner 
			dopey = new Joiner("Dopey", sleepy),
			doc = new Joiner("Doc", grumpy);
		System.out.println("sec --------------------");
		grumpy.interrupt();
	}
} /*
   * Output: Grumpy was interrupted. isInterrupted(): false Doc join completed
   * Sleepy has awakened Dopey join completed
   */// :~
