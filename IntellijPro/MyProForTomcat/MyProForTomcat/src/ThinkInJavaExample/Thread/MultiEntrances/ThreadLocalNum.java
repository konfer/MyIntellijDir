
package ThinkInJavaExample.Thread.MultiEntrances;

public class ThreadLocalNum
{
	private static ThreadLocal<Integer> localNum = new ThreadLocal<Integer>()
	{

		@Override
		protected Integer initialValue()
		{
			// TODO Auto-generated method stub
			return 0;
		}

	};

	public static void increment()
	{

		localNum.set(localNum.get() + 1);
	}

	public static int getNum()
	{
		return localNum.get();
	}

}
