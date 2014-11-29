// : interfaces/interfaceprocessor/Apply.java
package bookeCode.thinkingInJava.interfaces.interfaceprocessor;

import static bookeCode.thinkingInJava.net.mindview.util.Print.*;

public class Apply
{
	public static void process(Processor p, Object s)
	{
		print("Using Processor " + p.name());
		print(p.process(s));
	}
} // /:~
