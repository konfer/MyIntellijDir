package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.*;


/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-7
 * Time: 18:07:48
 * To change this template use File | Settings | File Templates.
 */
public class ReflectTest
{
    public Object copy(Object obj) throws Exception
    {
        Class<?> classType = obj.getClass();
//        Constructor con=classType.getConstructor(new Class[]{String.class,int.class});
//        Object _obj=con.newInstance(new Object[]{"hello",3});
        Object _obj=classType.getConstructor(new Class[]{}).newInstance();

        Field[] fields=classType.getDeclaredFields();

        for(Field f:fields)
        {
            String name=f.getName();
            String firstLetter=name.substring(0,1).toUpperCase();
            String getMethodName="get"+firstLetter+name.substring(1);
            String setMethodName="set"+firstLetter+name.substring(1);
            System.out.println(getMethodName+" "+setMethodName);

            Method getMethod=classType.getMethod(getMethodName,new Class[]{});
            Method setMethod=classType.getMethod(setMethodName,new Class[]{f.getType()});

            Object value=getMethod.invoke(obj,new Object[]{});

            setMethod.invoke(_obj,new Object[]{value});


        }


        System.out.println(_obj);
        return _obj;
    }

    public static void main(String[] args) throws Exception
    {
        ReflectTest test=new ReflectTest();
        Customer cu=new Customer("lin",10);
        cu.setId(1L);
        Customer c=(Customer)test.copy(cu);
        System.out.println(c.getAge()+" "+c.getName()+" "+c.getId());

    }

}

class Customer
{
    private Long id;
    private String name;
    private int age;

    public Customer()
    {
        
    }

    public Customer(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}

