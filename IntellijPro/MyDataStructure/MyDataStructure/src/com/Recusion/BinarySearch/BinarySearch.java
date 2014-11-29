package com.Recusion.BinarySearch;

public class BinarySearch
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		OrderArray ord=new OrderArray(10);
		ord.insert(10);
		ord.insert(19);
		ord.insert(23);
		ord.insert(67);
		ord.insert(11);
		ord.insert(13);
		ord.insert(56);
		ord.insert(32);
		ord.insert(99);
		
		ord.display();
		
		ord.find(23);
		
		int searchKey=32;
		
		if(ord.find(searchKey)!=ord.size())
		{
			System.out.println("Found "+ord.find(searchKey));
		}
		else
		{
			System.out.println("can't find "+searchKey);
		}
		

	}

}
