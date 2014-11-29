package com.Recusion.Anagram;

import java.io.BufferedReader;
import com.util.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram
{
	private static int count;
	private static int size;
	private static char[] arrChar=new char[10];
	
	private static GetString stringBuilder=new GetString();
	
	
	public static void displayWord()
	{
		if(count<99)
		{
			System.out.println(" ");
		}
		if(count<9)
		{
			System.out.println(" ");
		}
		System.out.println(++count +" ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arrChar[i]);
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter a word:");
		String input=stringBuilder.getString();
		size=input.length();
		count=0;
		for(int i=0;i<size;i++)
		{
			arrChar[i]=input.charAt(i);
		
		}
		doAnagram(size);
	}
	
	public static void doAnagram(int StringSize)
	{
		if(StringSize==1) 
		{
			return;
		}
		for(int i=0;i<StringSize;i++)
		{
			doAnagram(StringSize-1);
			if(StringSize==2)
			{
				displayWord();
			}
			rotate(StringSize);
		}
		
	}
	
	public static void rotate(int StringSize)
	{
		int position=size-StringSize;
		char temp=arrChar[size-1];
		for(int i=size-1;i>position;i--)
		{
			arrChar[i]=arrChar[i-1];
		}
		arrChar[position]=temp;
	}
	
}

