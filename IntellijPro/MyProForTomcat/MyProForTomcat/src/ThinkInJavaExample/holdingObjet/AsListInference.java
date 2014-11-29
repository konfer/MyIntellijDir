package ThinkInJavaExample.holdingObjet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInference
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		List<snow> snowList=Arrays.asList(new Crusty(),new Slush(),new Powder());
		List<snow> snow2=Arrays.<snow>asList(new Light(),new Heavy());
		//List<snow> snow2=Arrays.<snow>aslist(new Light(),new Heavy());
		
		List<snow> snow3=new ArrayList<snow>();
		Collections.addAll(snow3, new Light(),new Heavy());

	}
 
}

class snow
{
	
}

class Powder extends snow
{
	
}

class Light extends Powder
{
	
}

class Heavy extends Powder
{
	
}

class Crusty extends snow
{
	
}

class Slush extends snow
{
	
}



