package com.InputOutput.File;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-1
 * Time: 11:18:01
 * To change this template use File | Settings | File Templates.
 */
public class FileTest7
{
    public static void deleteAll(File f)
    {
        if(f.isFile()||f.list().length==0)
        {
            f.delete();
        }
        else
        {
            File[] files=f.listFiles();
            for(File ff:files)
            {
                deleteAll(ff);
                ff.delete();
            }
        }
        f.delete();
    }

    public static void main(String[] args)
    {
        deleteAll(new File("f:\\abc"));
    }

}
