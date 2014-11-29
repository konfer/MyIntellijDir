package com.shengsiyuan2.interfaces;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-4
 * Time: 21:51:47
 * To change this template use File | Settings | File Templates.
 */
public interface ParentInterface <T1,T2>
{
    public void setFoo1(T1 foo1);

    public void setFoo2(T2 foo2);

    public T1 getFoo1();

    public T2 getFoo2();

}
