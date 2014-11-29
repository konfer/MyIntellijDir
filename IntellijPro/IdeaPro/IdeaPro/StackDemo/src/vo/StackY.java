package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-22
 * Time: 16:06:47
 * To change this template use File | Settings | File Templates.
 */
public class StackY
{
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackY(int size)
    {
        maxSize=size;
        stackArray=new char[maxSize];
        top=-1;
    }

    public void push(char j)
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

    public char pop()
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

    public char peek()
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

    public char peekN(int n)
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


