// : enumerated/EnumMaps.java
// Basics of EnumMaps.

package bookeCode.thinkingInJava.enumerated;

import java.util.*;
import static bookeCode.thinkingInJava.enumerated.AlarmPoints.*;
import static bookeCode.thinkingInJava.net.mindview.util.Print.*;

interface Command
{
	void action();
}

public class EnumMaps
{
	public static void main(String[] args)
	{
		EnumMap<AlarmPoints, Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
		em.put(AlarmPoints.KITCHEN, new Command()
		{
			public void action()
			{
				print("Kitchen fire!");
			}
		});
		em.put(BATHROOM, new Command()
		{
			public void action()
			{
				print("Bathroom alert!");
			}
		});
		for(Map.Entry<AlarmPoints, Command> e : em.entrySet())
		{
			printnb(e.getKey() + ": ");
			e.getValue().action();
		}
		try
		{ // If there's no value for a particular key:
			em.get(UTILITY).action();
		}
		catch(Exception e)
		{
			print(e);
		}
	}
} /*
   * Output: BATHROOM: Bathroom alert! KITCHEN: Kitchen fire!
   * java.lang.NullPointerException
   */// :~