package com.shegnsiyuan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-28
 * Time: 21:53:11
 * To change this template use File | Settings | File Templates.
 */
public class ListenGenericFoo<T extends List<String>> 
{
    private T[]  fooArray;

    public T[] getFooArray() {
        return fooArray;
    }

    public void setFooArray(T[] fooArray) {
        this.fooArray = fooArray;
    }

    public static void main(String[] args)
    {
        ListenGenericFoo<LinkedList<String>> foo1=new ListenGenericFoo<LinkedList<String>>();
        ListenGenericFoo<ArrayList<String>> foo2=new ListenGenericFoo<ArrayList<String>>();

        LinkedList[] linkedList=new LinkedList[10];
        foo1.setFooArray(linkedList);

        ArrayList[] arr=new ArrayList[10] ;
        foo2.setFooArray(arr);

    }

}
