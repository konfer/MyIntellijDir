package com.SuperLiny.SortProject;

import com.SuperLiny.SortProject.impl.SelectionSort;
import com.SuperLiny.SortProject.interfaces.SortedClass;
import com.SuperLiny.util.In;
import com.SuperLiny.util.StdOut;

public class SortExample
{
	private SortedClass subSort;

	public SortedClass getSubSort() 
	{
		return subSort;
	}

	public void setSubSort(SortedClass subSort)
	{
		this.subSort = subSort;
	}

	public void sort(Comparable[] a)
	{
		subSort.sorted(a);
	}

	

	private void show(Comparable[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			StdOut.println(a[i] + " ");
		}
		StdOut.println();
	}
	
	

	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SortExample se=new SortExample();
		SortedClass sc=new SelectionSort();
		se.setSubSort(sc);
		String[] a={"a","c","f","b","e"};
		System.out.println(a);
		se.sort(a);
		assert SortedUtil.isSorted(a);
		se.show(a);

	}

}
