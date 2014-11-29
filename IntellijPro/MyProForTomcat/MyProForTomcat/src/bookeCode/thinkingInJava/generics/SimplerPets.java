
package bookeCode.thinkingInJava.generics;

// : generics/SimplerPets.java
import bookeCode.thinkingInJava.typeinfo.pets.*;
import java.util.*;
import bookeCode.thinkingInJava.net.mindview.util.*;

public class SimplerPets
{
	public static void main(String[] args)
	{
		Map<Person, List< ? extends Pet>> petPeople = New.map();
		// Rest of the code is the same...
	}
} // /:~
