package com.shegnsiyuan;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-5
 * Time: 11:10:10
 * To change this template use File | Settings | File Templates.
 */
public class VarargsTest
{
    private static int sum(int... nums)
    {
        int sum=0;

        for(int num:nums)
        {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int result=sum(1,2);

        System.out.println(result);

        result=sum(1,2,3,4);

        System.out.println(result);

         result=sum(new int[]{1,2,3,4});

        System.out.println(result);

    }

}
