package bookeCode.thinkingInJava.typeinfo;

// : typeinfo/SweetShop.java
// Examination of the way the class loader works.
import static bookeCode.thinkingInJava.net.mindview.util.Print.*;

class Candy
{
	static
	{
		print("Loading Candy");
	}
}

class Gum
{
	static
	{
		print("Loading Gum");
	}
}

/**
 * @author ly_kof
 * 
 */
class Cookie
{
	static
	{
		print("Loading Cookie");
	}
}

public class SweetShop
{
	public static void main(String[] args)
	{
		print("inside main");
		new Candy();
		//new Gum();
		print("After creating Candy");
		try
		{
			//Class.forName("Gum");
			Class.forName("bookeCode.thinkingInJava.typeinfo.Gum");
		}
		catch(ClassNotFoundException e)
		{
			print("Couldn't find Gum");
		}
		print("After Class.forName(\"Gum\")");
		new Cookie();
		print("After creating Cookie");
	}
} /*
   * Output: inside main Loading Candy After creating Candy Loading Gum After
   * Class.forName("Gum") Loading Cookie After creating Cookie
   */// :~
