package com.pic.Generic;

public class WrapperGeneric<T>
{
	private GenericFoo<T> g;

	public GenericFoo<T> getG()
	{
		return g;
	}

	public void setG(GenericFoo<T> g)
	{
		this.g = g;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		GenericFoo<Integer> gf=new GenericFoo<Integer>();
		gf.setFoo(3);
		
		WrapperGeneric<Integer> wg=new WrapperGeneric<Integer>();
		wg.setG(gf);
		
		GenericFoo<Integer> g=wg.getG();
		System.out.println(g.getFoo());

	}

}
