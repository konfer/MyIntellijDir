package ThinkInJavaExample.enumTest;

public enum myEnum
{
	GROUND, CRAWLING, HANGING;
	
	public String toString()
	{
		return name()+" Num:"+ordinal();
	}
}
