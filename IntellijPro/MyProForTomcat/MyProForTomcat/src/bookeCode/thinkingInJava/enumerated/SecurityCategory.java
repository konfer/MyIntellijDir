package bookeCode.thinkingInJava.enumerated;

// : enumerated/SecurityCategory.java
// More succinct subcategorization of enums.
import bookeCode.thinkingInJava.net.mindview.util.*;

enum SecurityCategory
{
	STOCK(Security.Stock.class), BOND(Security.Bond.class);
	Security[] values;

	SecurityCategory(Class<? extends Security> kind)
	{
		values = kind.getEnumConstants();
	}

	public Security[] getValues()
	{
		return values;
	}



	interface Security
	{
		enum Stock implements Security
		{
			SHORT, LONG, MARGIN
		}

		enum Bond implements Security
		{
			MUNICIPAL, JUNK
		}
	}

	public Security randomSelection()
	{
		return Enums.random(values);
	}

	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i++)
		{
			SecurityCategory category = Enums.random(SecurityCategory.class);
			System.out.println(category + ": " + category.randomSelection());
		}
		 
		System.out.println("-------------");
		
		for(SecurityCategory s:SecurityCategory.class.getEnumConstants())
		{
			for(SecurityCategory.Security se:s.getValues())
			{
				System.out.println(s+":"+se);
			}
		}
		
	}
} /*
   * Output: BOND: MUNICIPAL BOND: MUNICIPAL STOCK: MARGIN STOCK: MARGIN BOND:
   * JUNK STOCK: SHORT STOCK: LONG STOCK: LONG BOND: MUNICIPAL BOND: JUNK
   */// :~
