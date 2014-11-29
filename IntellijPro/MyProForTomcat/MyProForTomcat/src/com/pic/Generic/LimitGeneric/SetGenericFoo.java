package com.pic.Generic.LimitGeneric;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetGenericFoo<T extends Set<Boolean>>
{
	private T[] t;

	public SetGenericFoo()
	{
		// TODO Auto-generated constructor stub
	}

	public T[] getT()
	{
		return t;
	}

	public void setT(T[] t)
	{
		this.t = t;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SetGenericFoo<HashSet<Boolean>> hashSetG = new SetGenericFoo<HashSet<Boolean>>();
		SetGenericFoo<TreeSet<Boolean>> treeSetG = new SetGenericFoo<TreeSet<Boolean>>();
		
//		Set hashSet=new HashSet<Boolean>();
//		Set treeSet=new TreeSet<Boolean>();
		
		HashSet<Boolean>[] h=new HashSet[10];
		hashSetG.setT(h);
		
		TreeSet<Boolean>[] t=new TreeSet[10];
		treeSetG.setT(t);

	}

}
