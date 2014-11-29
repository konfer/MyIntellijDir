
package ThinkInJavaExample.Thread.MultiEntrances;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyEntrance implements Runnable
{
	private static List<MyEntrance> entrances = new ArrayList<MyEntrance>();
	private static MyCounter myCounter=new MyCounter();

	private static boolean cancal = false;

	private final int id;

	public MyEntrance(int id)
	{
		this.id = id;
		entrances.add(this);
	}

	@Override
	public void run()
	{
		while(!cancal)
		{
			ThreadLocalNum.increment();
			myCounter.increment();
			System.out.println(this+" Total:"+myCounter.getValue());
		}
	}
	
	public static void isCancal()
	{
		cancal=true;
	}

	public static int getNum()
	{
		return ThreadLocalNum.getNum();
	}

	public static int getTotalCount()
	{
		return myCounter.getValue();
	}
	
	public String toString()
	{
		return "Entrance "+id+": "+getNum();
	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException
	{
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 3; i ++ )
		{
			exec.execute(new MyEntrance(i));
		}
		TimeUnit.MILLISECONDS.sleep(50);
		MyEntrance.isCancal();
		exec.shutdown();
		System.out.println("total:"+MyEntrance.getTotalCount());
	}

}
