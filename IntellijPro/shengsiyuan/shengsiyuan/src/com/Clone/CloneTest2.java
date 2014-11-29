package com.Clone;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-14
 * Time: 9:25:41
 * To change this template use File | Settings | File Templates.
 */
public class CloneTest2
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Teacher t=new Teacher();
        t.setAge(40);
        t.setName("linyu");
        Student2 stu=new Student2();
        stu.setAge(10);
        stu.setName("me");
        stu.setTea(t);
        Student2 stu1=(Student2)stu.clone();
        System.out.println(stu1.getTea().getName());
        System.out.println("__________");
        t.setName("changed");
        System.out.println(stu.getTea().getName());
        System.out.println(stu1.getTea().getName());
    }

}

class Teacher implements Cloneable
{
    private int age;
    private String name;

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

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();

    }

}

class Student2 implements Cloneable
{
    private int age;
    private String name;
    private Teacher tea;

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

    public Teacher getTea() {
        return tea;
    }

    public void setTea(Teacher tea) {
        this.tea = tea;
    }

    public Object clone() throws CloneNotSupportedException
    {
        Student2 stu=(Student2)super.clone();
        stu.setTea((Teacher)stu.getTea().clone());
        return stu;
    }

}
