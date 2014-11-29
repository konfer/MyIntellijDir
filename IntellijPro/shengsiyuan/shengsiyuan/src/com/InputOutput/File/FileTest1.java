package com.InputOutput.File;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-29
 * Time: 21:34:10
 * To change this template use File | Settings | File Templates.
 */
public class FileTest1
{
    public static void main(String[] args) throws IOException
    {
        File f=new File(File.separator);
        File f1=new File(f,"bcd.txt");
        f1.createNewFile();
    }

}
