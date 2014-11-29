package com.InputOutput.File;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-30
 * Time: 21:41:09
 * To change this template use File | Settings | File Templates.
 */
public class FileTest4
{
    public static void main(String[] args)
    {
        File f=new File("D:\\JqueryTrain\\JqueryTrain");
        String[] s=f.list();
        for(String str:s)
        {
            System.out.println(str);
        }
        System.out.println("----------");
        File[] files=f.listFiles();
        for(File ff:files)
        {
            System.out.println(ff.getParent());
        }
        System.out.println("-------------");
        String[] names=f.list();
        for(String str:names)
        {
            if(str.endsWith(".java"))
            {
                System.out.println(str);
            }
        }
    }
}
