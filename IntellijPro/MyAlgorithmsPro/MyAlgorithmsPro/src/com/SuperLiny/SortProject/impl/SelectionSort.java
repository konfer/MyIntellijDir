package com.SuperLiny.SortProject.impl;

import com.SuperLiny.SortProject.SortedUtil;
import com.SuperLiny.SortProject.interfaces.SortedClass;

public class SelectionSort implements SortedClass
{

	public void sorted(Comparable[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;i<n;i++)
			{
				if(SortedUtil.less(a[j],a[min]))
				{
					min=j;
				} 
				SortedUtil.exch(a, min, j);
			}
		}
	}

}
