package com.shegnsiyuan;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-15
 * Time: 18:11:56
 * To change this template use File | Settings | File Templates.
 */
public class MyQueue {

    private LinkedList list=new LinkedList();

    public void put(Object o)
    {
        list.addLast(o);
    }

    public Object get()
    {
        return list.getLast();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public static void main(String[] args)
    {
        MyQueue q=new MyQueue();
        q.put("one");
        q.put("second");
        
    }


}
