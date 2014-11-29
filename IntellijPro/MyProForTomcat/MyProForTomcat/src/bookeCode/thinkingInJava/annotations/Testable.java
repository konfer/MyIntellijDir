// : annotations/Testable.java

package bookeCode.thinkingInJava.annotations;

import bookeCode.thinkingInJava.net.mindview.atunit.*;

public class Testable
{
	public void execute()
	{
		System.out.println("Executing..");
	}

	@Test
	void testExecute()
	{
		execute();
	}
} // /:~
