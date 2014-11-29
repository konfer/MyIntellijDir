package ThinkInJavaExample.holdingObjet;

import java.util.AbstractCollection;
import java.util.Iterator;

import bookeCode.thinkingInJava.holding.InterfaceVsIterator;
import bookeCode.thinkingInJava.typeinfo.pets.Pet;
import bookeCode.thinkingInJava.typeinfo.pets.Pets;

public class CollectionSequence extends AbstractCollection<Pet>
{
	private Pet[] pets=Pets.createArray(8);

	@Override
	public Iterator<Pet> iterator()
	{
		// TODO Auto-generated method stub
		return new Iterator<Pet>()
		{
			private int index=0;

			@Override
			public boolean hasNext()
			{
				return index<pets.length;
			}

			@Override
			public Pet next()
			{
				return pets[index++];
			}

			@Override
			public void remove()
			{
				throw new UnsupportedOperationException();
				
			}
		};
	}

	@Override
	public int size()
	{
		return pets.length;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		CollectionSequence c=new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
		

	}

}
