package com.AdapterClassPattern.Adapter;

import com.AdapterClassPattern.TarImpl.Target;

public class Adapter implements Target
{
	  private Adaptee adp;
	  
	  public Adapter(Adaptee adp)
	  {
			this.adp=adp;
	  }

	  @Override
      public void method()
      {
			adp.methodInvo();
		    // TODO Auto-generated method stub
		    
      }
	  
	  public static void main(String[] args)
      {
			Adaptee adpe=new Adaptee();
		    Adapter adp=new Adapter(adpe);
		    adp.method();
      }

}
