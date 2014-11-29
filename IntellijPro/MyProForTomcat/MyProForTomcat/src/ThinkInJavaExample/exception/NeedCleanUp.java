package ThinkInJavaExample.exception;

public class NeedCleanUp
{
	public static int i;
	public final int count = i++;
	public final String name = getClassName();

	public void dispose()
	{
		System.out.println("Number " + count + " " + name + " class dispose.");
	}

	public String getClassName()
	{
		Class c = this.getClass();
		return c.getName();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		NeedCleanUp nc1 = new NeedCleanUp();

		try
		{

		}
		finally
		{
			nc1.dispose();
		}

		NeedCleanUp nc2 = new NeedCleanUp();
		NeedCleanUp nc3 = new NeedCleanUp();

		try
		{

		}
		finally
		{
			nc2.dispose();
			nc3.dispose();
		}

		try
		{
			NeedCleanUpException nc4 = new NeedCleanUpException();
			try
			{
				NeedCleanUpException nc5 = new NeedCleanUpException();
				try
				{

				}
				finally
				{
					nc5.dispose();
				}
			}
			catch(ConstrurctorException e1)
			{
				System.out.println(e1);
			}
			finally
			{
				nc4.dispose();
			}

		}
		catch(ConstrurctorException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class NeedCleanUpException extends NeedCleanUp
{
	public NeedCleanUpException() throws ConstrurctorException
	{

	}
}

class ConstrurctorException extends Exception
{

}
