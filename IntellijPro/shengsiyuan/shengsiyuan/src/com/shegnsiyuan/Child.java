package com.shegnsiyuan;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-4
 * Time: 21:49:37
 * To change this template use File | Settings | File Templates.
 */
public class Child<T1,T2,T3> extends Generic
{
    private T3 foo3;

    public T3 getFoo3() {
        return foo3;
    }

    public void setFoo3(T3 foo3) {
        this.foo3 = foo3;
    }
}
