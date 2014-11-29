package com.TempleDesignPattern;

public class ConcreteClass extends AbstractClass
{

	  public ConcreteClass()
	  {
			// TODO Auto-generated constructor stub
	  }

	  /**
	   * @param args
	   */
	  public static void main(String[] args)
	  {
			// TODO Auto-generated method stub
			AbstractClass ac=new ConcreteClass();
			ac.template();

	  }

	  @Override
      public void start()
      {
		    // TODO Auto-generated method stub
		    System.out.println("start");
      }

	  @Override
      public void run()
      {
			System.out.println("run");
		    // TODO Auto-generated method stub
		    
      }

	  @Override
      public void finish()
      {
			System.out.println("finish");
		    // TODO Auto-generated method stub
		    
      }

}
