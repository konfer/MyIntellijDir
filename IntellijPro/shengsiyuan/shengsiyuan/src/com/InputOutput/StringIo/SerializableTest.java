package com.InputOutput.StringIo;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-9
 * Time: 23:29:13
 * To change this template use File | Settings | File Templates.
 */
public class SerializableTest
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Person1 p1=new Person1(20,"super",4.44);
        Person1 p2=new Person1(21,"uper",4.94);

        OutputStream fos=new FileOutputStream("person.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(p1);
        oos.writeObject(p2);

        oos.close();

        InputStream fis=new FileInputStream("person.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Person1 p=null;
        for(int i=0;i<2;i++)
        {
            p=(Person1)ois.readObject();
            System.out.println(p.getAge()+" "+p.getName()+" "+p.getHeight());
        }

    }
}

class Person implements Serializable
{
    int age;
    transient String name;
    double height;

    public Person(int age,String n,double h)
    {
        this.age=age;
        this.name=n;
        this.height=h;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Person1 implements Serializable
{
    int age;
    transient String name;
    double height;

    public Person1(int age,String n,double h)
    {
        this.age=age;
        this.name=n;
        this.height=h;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void writeObject(java.io.ObjectOutputStream out)  throws IOException
    {
        System.out.println("changed");

    }

    private void readObject(java.io.ObjectOutputStream out)  throws IOException
    {
        System.out.println("changed");
    }

}

