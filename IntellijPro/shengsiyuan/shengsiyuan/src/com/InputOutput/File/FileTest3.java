package com.InputOutput.File;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-30
 * Time: 21:36:19
 * To change this template use File | Settings | File Templates.
 */
public class FileTest3
{
    public static void main(String[] args)
    {
        File f=new File("d://shengsiyuan/abc");
        System.out.println(f.mkdir());
    }
}
