// : typeinfo/pets/ForNameCreator.java
package bookeCode.thinkingInJava.typeinfo.pets;

import java.util.*;

public class ForNameCreator extends PetCreator
{
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	
	// Types that you want to be randomly created:
	private static String[] typeNames = { "bookeCode.thinkingInJava.typeinfo.pets.Mutt",
			"bookeCode.thinkingInJava.typeinfo.pets.Pug", "bookeCode.thinkingInJava.typeinfo.pets.EgyptianMau",
			"bookeCode.thinkingInJava.typeinfo.pets.Manx", "bookeCode.thinkingInJava.typeinfo.pets.Cymric", "bookeCode.thinkingInJava.typeinfo.pets.Rat",
			"bookeCode.thinkingInJava.typeinfo.pets.Mouse", "bookeCode.thinkingInJava.typeinfo.pets.Hamster" };
	
	static
	{
		loader();
	}


	@SuppressWarnings("unchecked")
	private static void loader()
	{
		try
		{
			for(String name : typeNames)
				types.add((Class<? extends Pet>) Class.forName(name));
		}
		catch(ClassNotFoundException e)
		{
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Class<? extends Pet>> types()
	{
		return types;
	}
} // /:~
