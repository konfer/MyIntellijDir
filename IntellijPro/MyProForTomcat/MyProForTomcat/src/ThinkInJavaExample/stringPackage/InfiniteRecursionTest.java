package ThinkInJavaExample.stringPackage;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursionTest
{
	
	public String toString()
	{
		return "InfiniteRecursion address: "+super.toString()+"\n";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		List<InfiniteRecursionTest> list=new ArrayList<InfiniteRecursionTest>();
		for(int i=0;i<10;i++)
		{
			list.add(new InfiniteRecursionTest());
		}
		
		System.out.println(list);

	}

}
