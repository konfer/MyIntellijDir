package com.pic.IO.TransferCharIO;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;

public class CharSetTest
{
	public static void main(String[] args)
	{
		Properties p=System.getProperties(); 
		p.list(System.out);
		
		SortedMap<String ,Charset> map=Charset.availableCharsets();
		Set<String> set=map.keySet();
		
		for(Iterator<String> iter=set.iterator();iter.hasNext();)
		{
			System.out.println(iter.next());
		}
		
	}
}
