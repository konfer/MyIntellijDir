package com.ClassLoaderPro;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-24
 * Time: 23:24:43
 * To change this template use File | Settings | File Templates.
 */
public class MyClassLoader extends ClassLoader
{
    private String name;
    private String path="d:\\";
    private final String fileType=".Class";

    public MyClassLoader(String name)
    {
        super();

        this.name=name;
    }

    public MyClassLoader(ClassLoader parent,String name)
    {
        super(parent);
    }

    public String toString()
    {
        return this.name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private byte[]  loadClassData(String name)
    {
        InputStream is=null;
        byte[] data=null;
        ByteArrayOutputStream baos=null;
        try
        {
            this.name=this.name.replace(".","\\");
            is=new FileInputStream(new File(path+name+fileType));
            baos=new ByteArrayOutputStream();
            int ch=0;
            while(-1!=(ch=is.read()))
            {
                baos.write(ch);
            }
            data=baos.toByteArray();

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally
        {
            try
            {
                is.close();
                baos.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return data;
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException
    {
        byte[] data=this.loadClassData(name);
        return this.defineClass(name,data,0,data.length);
        //return super.findClass(name);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public static void main(String[] args) throws Exception
    {
        MyClassLoader myLoader=new MyClassLoader("myLoader");
        myLoader.setPath("F:\\shengsiyuan\\serverlib\\ ");
        MyClassLoader myLoa=new MyClassLoader(myLoader,"myLoa");
        myLoa.setPath("F:\\shengsiyuan\\serverlib\\");
        MyClassLoader loader3=new MyClassLoader(null,"loader3");
        loader3.setPath("F:\\shengsiyuan\\otherlib\\");
        test(myLoa);
        test(loader3);
    }

    public static void test(ClassLoader loa) throws Exception
    {
        Class clazz=loa.loadClass("com.ClassLoader.Sample");
        Object obj=clazz.newInstance();
    }

}
