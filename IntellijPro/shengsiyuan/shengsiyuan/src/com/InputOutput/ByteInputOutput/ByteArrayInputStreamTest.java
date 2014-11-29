package com.InputOutput.ByteInputOutput;

import java.io.ByteArrayInputStream;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-4
 * Time: 12:53:11
 * To change this template use File | Settings | File Templates.
 */
public class ByteArrayInputStreamTest
{
    public static void main(String[] args)
    {
        String temp="abcde" ;
        byte[] b=temp.getBytes();
        ByteArrayInputStream in=new ByteArrayInputStream(b);
        for(int i=0;i<2;i++)
        {
            int c;
            while(-1!=(c=in.read()) )
            {
                if(0==i)
                {
                    System.out.println((char)c);
                }
                else
                {
                    System.out.println(Character.toUpperCase((char)c));
                }
             //   in.reset();
            }
            in.reset();
        }
    }

}
