
package bookeCode.thinkingInJava.generics;

// : generics/ExplicitTypeSpecification.java
import bookeCode.thinkingInJava.typeinfo.pets.*;
import java.util.*;
import bookeCode.thinkingInJava.net.mindview.util.*;

public class ExplicitTypeSpecification
{
	static void f(Map<Person, List<Pet>> petPeople)
	{
	}

	public static void main(String[] args)
	{
		f(New.<Person, List<Pet>> map());
	}
} // /:~
