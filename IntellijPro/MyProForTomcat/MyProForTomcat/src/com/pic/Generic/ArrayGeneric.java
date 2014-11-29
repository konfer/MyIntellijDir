package com.pic.Generic;

public class ArrayGeneric<T>
{
	private T[] arr;

	public T[] getArr()
	{
		return arr;
	}

	public void setArr(T[] arr)
	{
		this.arr = arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayGeneric<String> arrGen=new ArrayGeneric<String>();
		String[] str={"hfid","dhia"};
		arrGen.setArr(str);
		String[] str1=arrGen.getArr();
		for(int i = 0; i < str1.length; i++)
		{
			System.out.println(str[i]);
		}
	}

}
