package com.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component
{
	  private List<Component> list=new ArrayList<Component>();

	  public Composite()
	  {
			// TODO Auto-generated constructor stub
	  }
	  
	  public void add(Component com)
	  {
			list.add(com);
	  }
	  
	  public void remove(Component com)
	  {
			list.remove(com);
	  }
	  
	  public List<Component> getAll()
	  {
			return this.list;
	  }

	  @Override
      public void doSomeThing()
      {
		    for(Component com:list)
		    {
		    	  com.doSomeThing();
		    }
		    
      }

}
