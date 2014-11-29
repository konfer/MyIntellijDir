package com.InputOutput.File;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-30
 * Time: 20:57:48
 * To change this template use File | Settings | File Templates.
 */
public class FileTest2
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("d://shengsiyuan/");
        File f1=new File(f,"xyz/abc.txt") ;
        f1.createNewFile();
    }
}
