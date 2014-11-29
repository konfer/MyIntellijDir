
package bookeCode.thinkingInJava.enumerated;

// : enumerated/NonEnum.java
enum Explore1
{
	HERE, THERE
}

public class NonEnum
{
	public static void main(String[] args)
	{
		Class<Explore1> intClass = Explore1.class;
		try
		{
			for(Object en : intClass.getEnumConstants())
			{
				System.out.println(en);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
} /*
   * Output: java.lang.NullPointerException
   */// :~
