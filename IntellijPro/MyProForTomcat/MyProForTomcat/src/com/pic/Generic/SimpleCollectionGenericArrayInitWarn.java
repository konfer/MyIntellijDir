package com.pic.Generic;

public class SimpleCollectionGenericArrayInitWarn<T>
{
	private T[] objArr;
	private int index=0;
	
	public SimpleCollectionGenericArrayInitWarn()
	{
		objArr=(T[])new Object[10];
	}
	
	public SimpleCollectionGenericArrayInitWarn(int capacity)
	{
		objArr=(T[])new Object[capacity];
	}
	
	public void add(T t)
	{
		objArr[index++]=t;
	}
	
	public int getLength()
	{
		return this.index;
	}
	
	public T get(int i)
	{
		return objArr[i];
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SimpleCollectionGenericArrayInitWarn<Integer> c=new SimpleCollectionGenericArrayInitWarn<Integer>();
		
		for(int i = 0; i < 10; i++)
		{
			c.add(i);
		}
		
		for(int i = 0; i < c.getLength(); i++)
		{
			System.out.println(c.get(i));
		}

	}

}
