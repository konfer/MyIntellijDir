package MyMiddleWareTest;

import bookeCode.thinkingInJava.net.mindview.util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * Created by root on 14-12-10.
 */
public class ChangeTestTwo extends Thread
{
	Exchanger<List<Integer>> exchanger;

	public ChangeTestTwo(Exchanger<List<Integer>> exchanger)
	{
		this.exchanger=exchanger;
	}

	@Override
	public void run()
	{
		List<Integer> l = new ArrayList<Integer>(2);
		l.add(4);
		l.add(5);

		try
		{
			l=exchanger.exchange(l);
		}catch (InterruptedException e){
			e.printStackTrace();
		}

	}

}
