package com.InputOutput.File;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-2
 * Time: 20:59:08
 * To change this template use File | Settings | File Templates.
 */
public class ListAllTest
{
    public static int time;

    public static void main(String[] args)
    {
        File f=new File("D:\\shengsiyuan\\abc");
        deepList(f);
    }

    public static void deepList(File f)
    {
        File[] files=f.listFiles();
        //files=sort(files);
        if(f.isFile()||files.length==0)
        {
            System.out.println(getTabs(++time)+f.getName());
            time--;
        }
        else 
        {
            time++;
            System.out.println(getTabs(time--)+"//"+f.getName());
            for(File ff:files)
            {
                deepList(ff);
            }
        }
    }

    public static File[] sort(File[] files)
    {
        ArrayList<File> sortedList=new ArrayList<File>();
        if(files.length==0)
        {
            return new File[0];
        }
        for(File f:files)
        {
            if(f.isFile())
            {
                sortedList.add(f);
            }
        }
        for(File f:files)
        {
            if(f.isDirectory())
            {
                sortedList.add(f);
            }
        }
        return sortedList.toArray(new File[files.length]);
    }

    public static String getTabs(int time)
    {
        StringBuffer buf=new StringBuffer();
        for(int i=0;i<time;i++)
        {
            buf.append("\t");
        }
        return buf.toString();
    }

}
