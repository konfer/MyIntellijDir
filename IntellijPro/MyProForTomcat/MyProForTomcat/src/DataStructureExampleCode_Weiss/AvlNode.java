package DataStructureExampleCode_Weiss;

public class AvlNode<T>
{
	private T element;
	private AvlNode<T> left;
	private AvlNode<T> right;
	private int length;

	public AvlNode(T theElement)
	{
		this(theElement,null,null);
	}
	
	public AvlNode(T theElement,AvlNode<T> leftTree,AvlNode<T> rightTree)
	{
		this.element=theElement;
		this.left=leftTree;
		this.right=rightTree;
	}

	public T getElement()
	{
		return element;
	}

	public void setElement(T element)
	{
		this.element = element;
	}

	public AvlNode<T> getLeft()
	{
		return left;
	}

	public void setLeft(AvlNode<T> left)
	{
		this.left = left;
	}

	public AvlNode<T> getRight()
	{
		return right;
	}

	public void setRight(AvlNode<T> right)
	{
		this.right = right;
	}

	public int getLength()
	{
		return length;
	}

	public void setLength(int length)
	{
		this.length = length;
	}
	
	

}
