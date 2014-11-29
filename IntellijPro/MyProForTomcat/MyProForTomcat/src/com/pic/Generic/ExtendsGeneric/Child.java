package com.pic.Generic.ExtendsGeneric;

public class Child<T, V, K> extends Parent<T, V>
{
	private K k;

	public K getK()
	{
		return k;
	}

	public void setK(K k)
	{
		this.k = k;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
