package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-22
 * Time: 16:06:47
 * To change this template use File | Settings | File Templates.
 */
public class StackX
{
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int size)
    {
        maxSize=size;
        stackArray=new long[maxSize];
        top=-1;
    }

    public void push(long j)
    {
        if(!isFull())
        {
            stackArray[++top]=j;
        }
        else
        {
            System.out.println("Full,can't push");
        }
    }

    public long pop()
    {
        if(!isEmpty())
        {
            return stackArray[top--];
        }
        else
        {
            System.out.println("Empty,can't pop");
            return 0;
        }
    }

    public long peek()
    {
        return stackArray[top];
    }

    public boolean isEmpty()
    {
        return(top==-1);
    }

    public boolean isFull()
    {
        return(top==maxSize-1);
    }

    public int size()
    {
        return top+1;
    }

    public long peekN(int n)
    {
        return stackArray[n];
    }

    public void displayStack(String s)
    {
        System.out.print(s);
        System.out.print("Stack (bottom-->top)");
        for(int j=0;j<size();j++)
        {
            System.out.print(peekN(j));
            System.out.print(" ");
        }
        System.out.println(" ");
    }

}


