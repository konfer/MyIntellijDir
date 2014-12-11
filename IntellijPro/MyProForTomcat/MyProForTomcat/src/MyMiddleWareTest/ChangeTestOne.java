package MyMiddleWareTest;

import bookeCode.thinkingInJava.net.mindview.util.CountingGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * Created by root on 14-12-10.
 */
public class ChangeTestOne extends Thread
{
	Exchanger<List<Integer>> exchanger;

	public ChangeTestOne(Exchanger<List<Integer>> exchanger)
	{
		this.exchanger=exchanger;
	}

	//inal Exchanger<List<Integer>> exchanger = new Exchanger<List<Integer>>();

	@Override
	public void run()
	{
		List<Integer> l = new ArrayList<Integer>(2);
		l.add(1);
		l.add(2);
		try
		{
			l = exchanger.exchange(l);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread1" + l);
	}

}


