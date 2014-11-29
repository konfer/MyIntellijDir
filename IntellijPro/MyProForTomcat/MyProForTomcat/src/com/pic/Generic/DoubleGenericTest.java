package com.pic.Generic;

public class DoubleGenericTest<T, V>
{
	private T t;
	private V v;

	public T getT()
	{
		return t;
	}

	public void setT(T t)
	{
		this.t = t;
	}

	public V getV()
	{
		return v;
	}

	public void setV(V v)
	{
		this.v = v;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		DoubleGenericTest<Integer, Boolean> dg=new DoubleGenericTest<Integer, Boolean>();
		dg.setT(3);
		dg.setV(false);
		
		System.out.println(dg.getT()+"F"+dg.getV());

	}

}
