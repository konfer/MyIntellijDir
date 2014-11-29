package com.shegnsiyuan;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-27
 * Time: 13:56:00
 * To change this template use File | Settings | File Templates.
 */
public class SetTest
{

    public static void main(String[] args)
    {
        Set<String> s=new HashSet<String>();

        s.add("a");
        s.add("bb");
        s.add("cc");
        s.add("dd");

        for(Iterator<String> iter=s.iterator();iter.hasNext();)
        {
            String V=iter.next();
            System.out.println(V);
        }

        Set<People> set2=new HashSet<People>();

        set2.add(new People("zhangsan",20,"beijing"));
        set2.add(new People("lisi",30,"shanghai"));
        set2.add(new People("wangwu",40,"tianjin"));

        for(Iterator<People> iter=set2.iterator();iter.hasNext();)
        {
            People p=iter.next();
            String name=p.getName();
            int age=p.getAge();
            String address=p.getAddress();

            System.out.println(name+","+age+","+address) ;

        }

    }

}


class People
{
    private String name;
    private int age;
    private String address;

    public People(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (age != people.age) return false;
        if (address != null ? !address.equals(people.address) : people.address != null) return false;
        if (name != null ? !name.equals(people.name) : people.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}

