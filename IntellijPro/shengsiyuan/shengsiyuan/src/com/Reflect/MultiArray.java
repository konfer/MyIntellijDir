package com.Reflect;

import java.lang.reflect.Array;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-7
 * Time: 21:15:12
 * To change this template use File | Settings | File Templates.
 */
public class MultiArray
{
    public static void main(String[] args)
    {
        int[] dims=new int[]{5,10,15};
        Object array=Array.newInstance(Integer.TYPE,dims);
        Object arrObj=Array.get(array,3);
       // Class<?> classType=arrObj.getClass().getComponentType();
        arrObj=Array.get(arrObj,5);
        Array.setInt(arrObj,10,37);
        int[][][] arrayCast=(int[][][])array;
        System.out.println(arrayCast[3][5][10]);
      //  System.out.println(classType);
//        System.out.println(Integer.TYPE);
//        System.out.println(Integer.class);
    }

}
