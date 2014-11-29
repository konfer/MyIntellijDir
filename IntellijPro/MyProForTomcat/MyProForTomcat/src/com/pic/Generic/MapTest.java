package com.pic.Generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		People p1=new People(1);
		People p2=new People(2);
		People p3=new People(3);
		
		p1.setName("p1");
		p2.setName("p2");
		p3.setName("p3");
		
		Map<String ,People> map=new HashMap<String ,People>();
		
		map.put("1", p1);
		map.put("2", p2);
		map.put("3", p3);
		
		Set<String> set=map.keySet();
		
		for(Iterator<String> iter=set.iterator();iter.hasNext();)
		{
			String str=iter.next();
			People p=(People)map.get(str);
			System.out.println(str+":"+p.getName());
		}
		
		Set<Map.Entry<String, People>> setForEntry=map.entrySet();
		for(Iterator<Map.Entry<String, People>> iter=setForEntry.iterator();iter.hasNext();)
		{ 
			Map.Entry<String, People> entry=iter.next();
			String name=entry.getKey();
			People p=entry.getValue();
			System.out.println(name+":"+p.getName());
		}
		

	}

}
