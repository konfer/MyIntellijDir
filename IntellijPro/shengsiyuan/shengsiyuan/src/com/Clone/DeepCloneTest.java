package com.Clone;

import com.InputOutput.ByteInputOutput.ByteArrayOutputStreamTest;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-14
 * Time: 20:24:13
 * To change this template use File | Settings | File Templates.
 */
public class DeepCloneTest implements Serializable
{
    private int age;
    private String name;
    private Teacher3 tea;

    public Teacher3 getTea() {
        return tea;
    }

    public void setTea(Teacher3 tea) {
        this.tea = tea;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object deepCopy() throws IOException, ClassNotFoundException
    {
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return ois.readObject();
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException
    {
        Teacher3 t=new Teacher3();
        t.setAge(40);
        t.setName("Teacher li");

        DeepCloneTest d=new DeepCloneTest();

        d.setAge(20);
        d.setName("ZHANG");
        d.setTea(t);

        DeepCloneTest d1=(DeepCloneTest)d.deepCopy();
        System.out.println(d1.getTea().getName());
        System.out.println("---------");

        t.setName("rou");
        d.setTea(t);
        System.out.println(d.getTea().getName());
        System.out.println(d1.getTea().getName());

    }

}

class Teacher3 implements Serializable
{
    private int age;
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }



}
