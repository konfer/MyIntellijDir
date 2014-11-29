package com.InputOutput.StringIo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-8
 * Time: 12:26:32
 * To change this template use File | Settings | File Templates.
 */
public class RandomAccessFileTest
{
    public static void main(String[] args) throws IOException
    {
       // RandomAccessFile ran=new RandomAccessFile()
        ClassTest ct=new ClassTest(1,"liny",5.5);
        RandomAccessFile raf=new RandomAccessFile("test.txt","rw");
        ct.write(raf);
        raf.seek(0);
        ClassTest ct1=new ClassTest();
        ct1.read(raf);
        System.out.println(ct1.getId()+ " "+ct1.getName()+" "+ct1.getHeight());
    }
}
