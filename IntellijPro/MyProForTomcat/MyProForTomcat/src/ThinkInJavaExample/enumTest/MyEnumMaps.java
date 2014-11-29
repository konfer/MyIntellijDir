package ThinkInJavaExample.enumTest;

import java.util.EnumMap;
import ThinkInJavaExample.enumTest.Num;

public class MyEnumMaps
{
	

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		EnumMap<Num, MyCommand> em=new EnumMap<Num, MyCommand>(Num.class);
		em.put(Num.one,new MyCommand(){

			@Override
			public void execute()
			{
				System.out.println();
				
			}
			
		});
		
		em.put(Num.two, new MyCommand()
		{

			@Override
			public void execute()
			{
				System.out.println();
				
			}
			
		});

	}

}
