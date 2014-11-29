package ThinkInJavaExample.enumTest;

public enum MyOzWitch
{
	WEST("Miss Gulch, aka the Wicked Witch of the West"), NORTH("Glinda, the Good Witch of the North"), EAST(
			"Wicked Witch of the East, wearer of the Ruby Slippers, crushed by Dorothy's house"), SOUTH("Good by inference, but missing");
	
	private String description;

	MyOzWitch(String descripiton)
	{
		this.description=descripiton;
	}

	public String getDescription()
	{
		return description;
	}
	
	public static void main(String[] args)
	{
		for(MyOzWitch m:MyOzWitch.class.getEnumConstants())
		{
			System.out.println(m.getDescription());
		}
	}
	
}
