package DataStructureExampleCode_Weiss;

public class Node<T>
{
	private T data;
	private Node<T> pre;
	private Node<T> next;

	public T getData()
	{
		return data;
	}

	public void setData(T data)
	{
		this.data = data;
	}

	public Node<T> getPre()
	{
		return pre;
	}

	public void setPre(Node<T> pre)
	{
		this.pre = pre;
	}

	public Node<T> getNext()
	{
		return next;
	}

	public void setNext(Node<T> next)
	{
		this.next = next;
	}

	public Node(T t, Node<T> p, Node<T> n)
	{
		this.data = t;
		this.pre = p;
		this.next = n;
	}

}
