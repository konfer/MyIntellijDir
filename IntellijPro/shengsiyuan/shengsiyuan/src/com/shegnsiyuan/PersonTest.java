package com.shegnsiyuan;

import com.shegnsiyuan.Imp.ageSort;
import com.shegnsiyuan.Imp.nameSort;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-4
 * Time: 10:59:45
 * To change this template use File | Settings | File Templates.
 */
public class PersonTest
{
    private int id;
    private String name;
    private int age;

    public PersonTest(int _id,int _age,String _name)
    {
        this.id=_id;
        this.name=_name;
        this.age=_age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String toString()
    {
        return "id:"+id+" age:"+age+" name:"+name;
    }

    public static void main(String[] args)
    {
        List<PersonTest> list=new ArrayList<PersonTest>();

        PersonTest p1=new PersonTest(1,20,"lin");
        PersonTest p2=new PersonTest(2,40,"liny") ;
        PersonTest p3=new PersonTest(7,23,"lei");
        PersonTest p4=new PersonTest(4,30,"conf");
        PersonTest p5=new PersonTest(5,30,"conf");
        PersonTest p6=new PersonTest(3,23,"conf");

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);

        ageSort agesort=new ageSort();
        agesort.setDesc(false);

        Collections.sort(list,agesort);

        for(Iterator<PersonTest> iter=list.iterator();iter.hasNext();)
        {
            PersonTest p=iter.next();
            System.out.println(p);
        }

        nameSort n=new nameSort();

        Collections.sort(list,n);

        for(Iterator<PersonTest> iter=list.iterator();iter.hasNext();)
        {
            PersonTest p=iter.next();
            System.out.println(p);
        }

    }
    
}