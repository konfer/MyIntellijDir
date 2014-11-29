package com.AdapterPattern.Adapter;

import com.AdapterPattern.TarImpl.Target;

public class Adapter extends Adaptee implements Target
{

	  public Adapter()
	  {
			// TODO Auto-generated constructor stub
	  }

	  public void method()
	  {
			this.methodAdap();
	  }
	  /**
	   * @param args
	   */
	  public static void main(String[] args)
	  {
			Target t=new Adapter();
			t.method();

	  }

}
