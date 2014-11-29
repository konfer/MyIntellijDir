package com.shengsiyuan2;

import com.shegnsiyuan.LinkListTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-17
 * Time: 11:20:02
 * To change this template use File | Settings | File Templates.
 */
public class CollectionsTest {

    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();

        list.add(new Integer(-10));
        list.add(new Integer(-12));
        list.add(new Integer(-1));

        Comparator r= Collections.reverseOrder();

        Collections.sort(list,r);

        for(Iterator iter=list.iterator();iter.hasNext();)
        {
            System.out.println(iter.next());
        }

        System.out.println("minimum v"+Collections.min(list));
        System.out.println("maximum v"+Collections.max(list));

    }

}
