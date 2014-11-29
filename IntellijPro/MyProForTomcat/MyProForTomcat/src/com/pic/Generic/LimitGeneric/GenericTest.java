package com.pic.Generic.LimitGeneric;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest<T>
{

	private T foo;

	public T getFoo()
	{
		return foo;
	}

	public void setFoo(T foo)
	{
		this.foo = foo;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		GenericTest<? extends List> ge=null;
		
		ge=new GenericTest<ArrayList>();
		ge=new GenericTest<LinkedList>();

	}

}
