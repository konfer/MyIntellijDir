package com.CommandPattern;

import com.CommandPattern.CommandImpl.Command;

public class ComcreteCommand implements Command
{
	  private Receiver receiver;

	  public ComcreteCommand(Receiver rec)
	  {
			this.receiver=rec;
	  }

	  @Override
      public void execute()
      {
		    receiver.doAction();
		    
      }
	  
	  

}
