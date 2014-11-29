package com.shengsiyuan2.Implements;

import com.shengsiyuan2.interfaces.ParentInterface;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-4
 * Time: 21:53:46
 * To change this template use File | Settings | File Templates.
 */
public class ChildClass<T1,T2> implements ParentInterface<T1,T2>
{
    private T1 foo1;

    private T2 foo2;

    public T1 getFoo1() {
        return foo1;
    }

    public void setFoo1(T1 foo1) {
        this.foo1 = foo1;
    }

    public T2 getFoo2() {
        return foo2;
    }

    public void setFoo2(T2 foo2) {
        this.foo2 = foo2;
    }
}
