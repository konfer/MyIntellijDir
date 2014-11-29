
package bookeCode.thinkingInJava.generics;

// : generics/LimitsOfInference.java
import bookeCode.thinkingInJava.net.mindview.util.New;
import bookeCode.thinkingInJava.typeinfo.pets.*;
import java.util.*;

public class LimitsOfInference
{
	static void f(Map<Person, List< ? extends Pet>> petPeople)
	{
	}

	public static void main(String[] args)
	{
		f(New.<Person,List<? extends Pet>>map()); // Does not compile
	}
} // /:
