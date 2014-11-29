package com.Recusion.BinarySearch;

public class OrderArray
{
	private long[] a;
	private int nElems;
	private int max;

	public OrderArray(int _max)
	{
		max = _max;
		a = new long[_max];
		nElems = 0;
		System.out.println("true");
	}

	public int size()
	{
		return nElems;
	}

	// error1 漏写
	// error2 循环内nElems超过范围
	// error3 大小判断条件出错
	public void insert(long value)
	{
		if(nElems == max)
		{
			System.out.println("Array is full, can't insert");
			return;
		}
		int m=0;
		for(; m < nElems; m++)
		{
			if(a[m] > value)
			{
				break;
			}
		}
		for(int i = nElems; i > m; i--)
		{
			a[i] = a[i - 1];
		}
		// 漏写以下
		a[m] = value;
		nElems++;
	}

	public int find(long value)
	{
		return refind(value, 0, nElems);
	}

	// warning 1:应编写适用于起始值及终点值可变版本,方便调用自身递归
	// warning 2:可直接return调用自身递归
	// error:未考虑无匹配情况
	public int refind(long value, int lowerBound, int upperBound)
	{
		int mid = (upperBound + lowerBound) / 2;
		if(a[mid] == value)
		{
			return mid;
		}
		else if(lowerBound > upperBound)
		{
			return nElems;
		}
		else
		{
			if(a[mid] > value)
			{
				return refind(value, lowerBound, mid - 1);
			}
			else if(a[mid] < value)
			{
				return refind(value, mid + 1, upperBound);
			}
		}
		return nElems;
	}

	public void display()
	{
		for(int i = 0; i < nElems; i++)
		{
			System.out.println(a[i]);
		}
	}
}
