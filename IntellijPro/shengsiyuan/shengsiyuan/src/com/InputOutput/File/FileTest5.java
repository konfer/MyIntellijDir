package com.InputOutput.File;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-30
 * Time: 21:59:15
 * To change this template use File | Settings | File Templates.
 */
public class FileTest5
{
    public static void main(String[] args)
    {
        File f=new File("D:\\shengsiyuan\\xyz\\abc.txt");
        f.delete();
    }
}
