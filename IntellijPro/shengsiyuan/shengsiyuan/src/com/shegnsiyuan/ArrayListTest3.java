package com.shegnsiyuan;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-15
 * Time: 12:10:01
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListTest3 {

    public static void main(String[] args)
    {
        ArrayList arr=new ArrayList();

        arr.add(new Point(3,4));
        arr.add(new Point(5,6));
        arr.add(new Point(6,7));

        for(int i=0;i<arr.size();i++)
        {
           System.out.println(arr.get(i)); 
        }
        

        System.out.println(arr);

    }

}
