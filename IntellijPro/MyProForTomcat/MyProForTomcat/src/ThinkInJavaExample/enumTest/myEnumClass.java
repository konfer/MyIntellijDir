package ThinkInJavaExample.enumTest;

public class myEnumClass
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		for(myEnum m:myEnum.values())
		{
			System.out.println(m);
		}
		
		System.out.println("--------------------------------");
		
		for(String s:"GROUND,CRAWLING,HANGING".split(","))
		{
			myEnum m=Enum.valueOf(myEnum.class, s);
			System.out.println(m);
			System.out.println(m.getDeclaringClass());
			System.out.println(m==myEnum.CRAWLING);
			System.out.println(m==myEnum.valueOf("GROUND"));
			System.out.println("//////////");
		}
		
		System.out.println("--------------------------------");
		
		for(myEnum m:myEnum.class.getEnumConstants())
		{
			System.out.println(m);
		}

	}

}
