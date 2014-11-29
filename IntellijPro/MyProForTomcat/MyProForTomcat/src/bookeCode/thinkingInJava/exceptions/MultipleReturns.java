package bookeCode.thinkingInJava.exceptions;

// : exceptions/MultipleReturns.java
import static bookeCode.thinkingInJava.net.mindview.util.Print.*;

public class MultipleReturns
{
	public static void f(int i)
	{
		print("Initialization that requires cleanup");
		try
		{

			if(i == 1)
			{
				print("Point 1");
				return;
			}

			if(i == 2)
			{
				print("Point 2");
				return;
			}

			if(i == 3)
			{
				print("Point 3");
				return;
			}
			print("End");
			return;
		}
		finally
		{
			print("Performing cleanup");
		}
	}

	public static void main(String[] args)
	{
		for(int i = 1; i <= 4; i++)
		{
			f(i);
			System.out.println("-------------");
		}
	}
} /*
   * Output: Initialization that requires cleanup Point 1 Performing cleanup
   * Initialization that requires cleanup Point 1 Point 2 Performing cleanup
   * Initialization that requires cleanup Point 1 Point 2 Point 3 Performing
   * cleanup Initialization that requires cleanup Point 1 Point 2 Point 3 End
   * Performing cleanup
   */// :~
