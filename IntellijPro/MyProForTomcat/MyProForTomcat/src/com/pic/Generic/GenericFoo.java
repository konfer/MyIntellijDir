package com.pic.Generic;

public class GenericFoo<T>
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
		GenericFoo<Boolean> foo1=new GenericFoo<Boolean>();
		GenericFoo<Integer> foo2=new GenericFoo<Integer>();
		
		foo1.setFoo(true);
		foo2.setFoo(3);
		
		System.out.println(foo1.getFoo());
		System.out.println(foo2.getFoo());

	}

}
