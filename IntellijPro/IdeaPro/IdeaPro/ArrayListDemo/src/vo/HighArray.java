package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-20
 * Time: 10:47:35
 * To change this template use File | Settings | File Templates.
 */
public class HighArray
{
    private long[] a;
    private int nElems;

    public HighArray(int max)
    {
        a=new long[max];
        nElems=0;
    }
    
    public boolean find(long searchKey)
    {
        int j;
        for(j=0;j<nElems;j++)
        {
            if(a[j]==searchKey)
               break;
        }
        if(j==nElems)
           return false;
        else
           return true;
    }

    public void findAndTell(long searchKey)
    {
        int j;
        for(j=0;j<nElems;j++)
        {
            if(a[j]==searchKey)
               break;
        }
        int i=j+1;
        if(j==nElems)
           System.out.println("Can't find "+searchKey);
        else
            System.out.println("Found "+searchKey+", the number of ¡°"+searchKey+"¡± is "+i);
    }

    public void insert(long value)
    {
        a[nElems++]=value;
        //nElems++;
    }

    public boolean delete(long value)
    {
        int j;
        for(j=0;j<nElems;j++)
        {
            if(a[j]==value)
               break;
        }
        if(j==nElems)
        {
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

    public void bubbleSort()
    {
        int out,in;
        for(out=nElems-1;out>1;out--)
        {
            for(in=0;in<out;in++)
            {
                if(a[in]>a[in+1])
                {
                    swap(in,in+1);
                }
            }
        }
    }

    public void selectionSort()
    {
       for(int k=0;k<nElems-1;k++)
       {
           int min=k;
           for(int j=k+1;j<nElems;j++)
           {
               if(a[j]<a[min])
               {
                   min=j;
               }
           }
           swap(k,min);
       }
    }

    public void insertSort()
    {
        int cur,left;
        for(cur=1;cur<nElems;cur++)
        {
            long temp=a[cur];
            left=cur;
            while(left>0&&a[left-1]>=temp)
            {
                a[left]=a[left-1];
                --left;
            }
            a[left]=temp;
        }
    }

    public void swap(int i,int j)
    {
        long temp=a[i];
        a[i]=a[j];
        a[j]=temp;
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
