package com.shegnsiyuan;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-14
 * Time: 21:45:48
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListTest {

    public static void main(String[] args)
    {

        ArrayList arr=new ArrayList();

        arr.add("hello ");
        arr.add("world");
        arr.add(" welcome");

        String s1=(String)arr.get(0);
        String s2=(String)arr.get(1);
        String s3=(String)arr.get(2);
    //	String s4=(String)arr.get(3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("--------------");



      //  arr.clear();
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());

        arr.remove(0);

        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }

        arr.add("aaa");
        arr.add("bbb");

        System.out.println(arr.indexOf("aaa"));
//        sysout




    }

}
