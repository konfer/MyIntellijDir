package com.Clone;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-14
 * Time: 9:16:30
 * To change this template use File | Settings | File Templates.
 */
public class cloneTest
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Student stu=new Student();
        stu.setAge(20);
        stu.setName("lin");

        Student stu1=(Student)stu.clone();

        System.out.println(stu1.getAge()+" "+stu1.getName());

        System.out.println("____________");

        stu.setName("liny");
        System.out.println(stu.getName()) ;
        System.out.println(stu1.getName());

    }
}

class Student implements Cloneable
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

    protected Object clone() throws CloneNotSupportedException
    {
        Object obj=super.clone();
        return obj;
    }

}
