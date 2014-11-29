package com.pic.Generic.DataStructrueGenericTest;

public class GenericMemoryCell<T>
{
	private T storedValue;
	
	public T read()
	{
		return storedValue;
	}
	
	public void write(T t)
	{ 
		storedValue=t;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		GenericMemoryCell<Integer> cellOne=new GenericMemoryCell<Integer>();
		cellOne.write(4);
		Object cellTwo=cellOne;
		GenericMemoryCell<String> cellThree=(GenericMemoryCell<String>)cellTwo;
		String s=cellThree.read();

	}

}
