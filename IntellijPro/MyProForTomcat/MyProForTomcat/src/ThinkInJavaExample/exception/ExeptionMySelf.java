package ThinkInJavaExample.exception;

public class ExeptionMySelf
{
	public void f() throws MyException
	{
		System.out.println("ready");
		throw new MyException("My Exception");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ExeptionMySelf ems=new ExeptionMySelf();
		try
		{
			ems.f();
		}
		catch(MyException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

class MyException extends Exception
{

	public MyException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}