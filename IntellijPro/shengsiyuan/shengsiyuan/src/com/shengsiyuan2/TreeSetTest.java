package com.shengsiyuan2;

import com.shengsiyuan2.Implements.Mycomparator;
import com.shengsiyuan2.Implements.PersomComparator;

import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-16
 * Time: 18:45:09
 * To change this template use File | Settings | File Templates.
 */
public class TreeSetTest {

    public static void main(String[] args)
    {

        Person p1=new Person(1);
        Person p2=new Person(5);
        Person p3=new Person(3);
        Person p4=new Person(2);
        

        TreeSet set=new TreeSet(new PersomComparator());

       // TreeSet set=new TreeSet();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

//        set.add("c");
//        set.add("a");
//        set.add("b") ;
//        set.add("d");

        System.out.println(set);

    }

}
