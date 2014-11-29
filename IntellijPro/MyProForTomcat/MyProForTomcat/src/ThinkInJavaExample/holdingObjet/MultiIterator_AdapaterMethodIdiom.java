package ThinkInJavaExample.holdingObjet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MultiIterator_AdapaterMethodIdiom<T> extends ArrayList<T>
{
	public MultiIterator_AdapaterMethodIdiom(Collection<T> c)
	{
		super(c);
	}

	public Iterable<T> reverse()
	{
		return new Iterable<T>()
		{

			@Override
			public Iterator<T> iterator()
			{
				return new Iterator<T>()
				{
					int current = size() - 1;

					@Override
					public boolean hasNext()
					{
						return current > -1;
					}

					@Override
					public T next()
					{
						return get(current--);
					}

					@Override
					public void remove()
					{
						throw new UnsupportedOperationException();

					}
				};
			}

		};
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{ 
		MultiIterator_AdapaterMethodIdiom<String> mami = new MultiIterator_AdapaterMethodIdiom<String>(
				Arrays.asList("To be reverse ! go go go ".split(" ")));

		for(String s : mami)
		{
			System.out.println(s);
		}
		
		System.out.println("___________");

		for(String s : mami.reverse())
		{
			System.out.println(s);
		}

	}

}
