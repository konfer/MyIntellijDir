package com.TempleDesignPattern;

public abstract class AbstractClass
{
	  public void template()
	  {
			this.start();
			this.run();
			this.finish();
	  }
	  
	  public abstract void start();
	  
	  public abstract void run();
	  
	  public abstract void finish();

	  public AbstractClass()
	  {
			// TODO Auto-generated constructor stub
	  }

	  /**
	   * @param args
	   */
	  public static void main(String[] args)
	  {
			// TODO Auto-generated method stub

	  }

}
