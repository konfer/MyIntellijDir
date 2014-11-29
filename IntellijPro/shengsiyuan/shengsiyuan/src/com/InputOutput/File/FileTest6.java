package com.InputOutput.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-30
 * Time: 22:18:53
 * To change this template use File | Settings | File Templates.
 */
public class FileTest6
{
    public static void main(String[] args)
    {
        File f=new File("D:\\JqueryTrain\\JqueryTrain");
        String[] names=f.list(new FilenameFilter()
        {
            public boolean accept(File dir,String name)
            {
                if(name.endsWith(".java"))
                {
                    return true;
                }
                return false;
            }
        });
        String n=names[0];
        System.out.print(n);
        for(String name:names)
        {
            System.out.println(name);
        }
    }

   
}
