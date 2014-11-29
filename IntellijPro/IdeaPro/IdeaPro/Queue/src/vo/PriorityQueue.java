package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-27
 * Time: 11:11:17
 * To change this template use File | Settings | File Templates.
 */
public class PriorityQueue
{
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQueue(int s)
    {
        maxSize=s;
        queArray=new long[maxSize];
        nItems=0;
    }

    public void insert(long item)
    {
        int j;
        if(!isFull())
        {
            if(nItems==0)
            {
                queArray[nItems++]=item;
            }
            else
            {
                for(j=nItems-1;j>=0;j--)
                {
                    if(item>queArray[j])
                    {
                        queArray[j+1]=queArray[j] ;
                    }
                    else
                        break;
                }
                queArray[j+1]=item;
                nItems++;
            }
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
            return queArray[--nItems];
        }
        else
        {
            System.out.println("Empty,can't remove");
            return 0;
        }
    }

    public boolean isEmpty()
    {
        return (nItems==0);
    }

    public boolean isFull()
    {
        return (maxSize==nItems);
    }

    public long peekMin()
    {
        return queArray[nItems-1];
    }

}
