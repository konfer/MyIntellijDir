
package bookeCode.thinkingInJava.io;

// : io/DirList.java
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"}
import java.util.regex.*;
import java.io.*;
import java.util.*;

import util.GetInput;

public class DirList
{
	public static void main(String[] args) throws IOException
	{
		File path = new File("D:\\");
		System.out.println(path.getName());
		String[] list;
		String str=GetInput.getString();
		if(str.length() == 0)
		{
			list = path.list();
		}
		else
		{
			list = path.list(new DirFilter(str));
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list)
		{
			System.out.println(dirItem);
		}
	}
}

class DirFilter implements FilenameFilter
{
	private Pattern pattern;

	public DirFilter(String regex)
	{
		pattern = Pattern.compile(regex);
	}

	public boolean accept(File dir, String name)
	{
		return pattern.matcher(name).matches();
	}
} /*
   * Output: DirectoryDemo.java DirList.java DirList2.java DirList3.java
   */// :~
