package bookeCode.thinkingInJava.strings;

// : strings/Immutable.java
import static bookeCode.thinkingInJava.net.mindview.util.Print.*;

public class Immutable
{
	public static String upcase(String s)
	{
		return s.toUpperCase();
	}

	public static void main(String[] args)
	{
		String q = "howdy";
		print(q); // howdy
		String qq = upcase(q);
		print(qq); // HOWDY
		print(q); // howdy
	}
} /*
   * Output: howdy HOWDY howdy
   */// :~