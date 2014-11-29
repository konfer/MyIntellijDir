package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-20
 * Time: 11:40:23
 * To change this template use File | Settings | File Templates.
 */
public class OrdArray
{
    private long[] a;
    private int nElems;

    public OrdArray(int max)
    {
        a=new long[max];
        nElems=0;
    }

    public int Size()
    {
        return nElems;
    }

    public int find(long searchKey)
    {
        int lowerBound=0;
        int upperBound=nElems-1;
        int curIn;

        while(true)
        {
            curIn=(lowerBound+upperBound)/2;
            if(a[curIn]==searchKey)
            {
                return curIn;
            }
            else if(lowerBound>upperBound)
            {
                return nElems;
            }
            else
            {
                if(a[curIn]>searchKey)
                {
                    upperBound=curIn-1;
                }
                else if(a[curIn]<searchKey)
                {
                    lowerBound=curIn+1;
                }
            }
        }
    }

    public void insert(long value)
    {
        int j;
        for(j=0;j<nElems;j++)
        {
            if(a[j]>value)
               break;
        }
        for(int k=nElems;k>j;k--)
        {
            a[k]=a[k-1];
        }
        a[j]=value;
        nElems++;
    }

    public boolean delete(long value)
    {
        int j=find(value);
        if(j==nElems)
        {
            System.out.println("¡°"+value+"¡± is not in the array");
            return false;
        }
        else
        {
            for(int k=j;k<nElems;k++)
            {
                a[k]=a[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void display()
    {
        for(int i=0;i<nElems;i++)
        {
            System.out.println(a[i]+"");
        }
        System.out.println("");
    }

}
