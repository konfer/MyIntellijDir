package com.shegnsiyuan;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-27
 * Time: 12:34:57
 * To change this template use File | Settings | File Templates.
 */
public class SimpleCollection <T>
{
    private T[] objArr;

    private int index=0;

    public SimpleCollection()
    {
       objArr=(T[])new Object[10];
    }

    public SimpleCollection(int capcity)
    {
        objArr=(T[])new Object[capcity];
    }

    public void add(T t)
    {
        objArr[index++]=t;
    }

    public int getLength()
    {
        return this.index;
    }

    public T get(int i)
    {
        return objArr[i];
    }

    public static void main(String[] args)
    {
        SimpleCollection<Integer> s=new SimpleCollection();

        for(int i=0;i<10;i++)
        {
            s.add(new Integer(i));
        }

        for(int i=0;i<10;i++)
        {
            System.out.println(s.get(i)) ;
        }

    }

}
