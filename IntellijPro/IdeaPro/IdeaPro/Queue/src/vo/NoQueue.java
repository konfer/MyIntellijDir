package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-26
 * Time: 10:50:51
 * To change this template use File | Settings | File Templates.
 */
public class NoQueue
{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int n;

    public NoQueue(int s)
    {
        maxSize=s+1;
        queArray=new long[maxSize];
        front=0;
        rear=-1;
    }
                                        
    public void insert(long j)
    {
        if(!isFull())
        {
            if(rear==maxSize-1)
            {
                rear=-1;
            }
            queArray[++rear]=j;
            ++n;
            System.out.println("insert,rear="+rear+" front="+front+" nItems="+n);
        }
        else
        {
            System.out.println("Full,can't insert");
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
            --n;
            System.out.println("remove,rear="+rear+" front="+front+" nItems="+n);
            return temp;
        }
        else
        {
            System.out.println("Empty,can't remove");
            return 0;
        }
    }

    public long peek()
    {
        return queArray[front];
    }

    public boolean isEmpty()
    {
        return  (rear+1==front||(front+maxSize-1==rear));
    }

    public boolean isFull()
    {
        return(rear+2==front||(front+maxSize-2==rear));
    }

    public int size()
    {
        if(rear>=front)
        {
            return rear-front+1;
        }
        else         
        {
            return (maxSize-front)+(rear+1);
        }
    }

}
