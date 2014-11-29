package com.InputOutput.StringIo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-8
 * Time: 12:29:04
 * To change this template use File | Settings | File Templates.
 */
public class ClassTest
{
    private int id;
    private String name;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClassTest()
    {
        
    }

    public ClassTest(int id,String n,double h)
    {
        this.id=id;
        this.name=n;                                         
        this.height=h;
    }

    public void write(RandomAccessFile raf) throws IOException
    {
        raf.writeInt(id);
        raf.writeUTF(name);
        raf.writeDouble(height);
    }

    public void read(RandomAccessFile raf) throws IOException
    {
        this.id=raf.readInt();
        this.name=raf.readUTF();
        this.height=raf.readDouble();
    }

    public static void main(String[] args)
    {
        
    }

}
