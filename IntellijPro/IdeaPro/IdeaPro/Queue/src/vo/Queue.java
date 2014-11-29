package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-23
 * Time: 23:58:23
 * To change this template use File | Settings | File Templates.
 */
public class Queue
{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int _size)
    {
        maxSize=_size;
        queArray=new long[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }

    public void insert(long j)
    {
        if(isFull())
        {
            System.out.println("Full,can't insert");
        }
        else
        {
            if(rear==maxSize-1)
            {
                rear=-1;
            }
            queArray[++rear]=j;
            nItems++;
            System.out.println("insert,rear="+rear+" front="+front+" nItems="+nItems);
        }

    }

    public long remove()
    {
        if(!isEmpty())
        {
            long temp=queArray[front++];
            if(front==maxSize)
            {
                front=0;
            }
            nItems--;
            System.out.println("remove,rear="+rear+" front="+front+" nItems="+nItems);
            return temp;
        }
        else
        {
            System.out.println("Empty,can't remove");
            return 0;
        }
    }

    public long peekFront()
    {
        return queArray[front];
    }

    public boolean isEmpty()
    {
        return (nItems==0);
    }

    public boolean isFull()
    {
        return (nItems==maxSize);
    }

    public int size()
    {
        return nItems;
    }


}
