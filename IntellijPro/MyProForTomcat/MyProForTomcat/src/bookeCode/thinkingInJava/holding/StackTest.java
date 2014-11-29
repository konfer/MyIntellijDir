package bookeCode.thinkingInJava.holding;

// : holding/StackTest.java
import bookeCode.thinkingInJava.net.mindview.util.*;

public class StackTest
{
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();
		for(String s : "My dog has fleas".split(" "))
		{
			stack.push(s);
		}
		while(!stack.empty())
		{
			System.out.print(stack.pop() + " ");
		}
	}
} /*
   * Output: fleas has dog My
   */// :~
