package com.CommandPattern;

import com.CommandPattern.CommandImpl.Command;

public class Invoker
{
	  private Command com;

	  public Invoker(Command com)
	  {
			this.com=com;
	  }
	  
	  public void doInvokeAction()
	  {
			com.execute();
	  }
	  
	  public static void main(String[] args)
      {
		    Receiver rec=new Receiver();
		    Command com=new ComcreteCommand(rec);
		    Invoker inv=new Invoker(com);
		    inv.doInvokeAction();
      }

}
