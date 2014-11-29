package com.shegnsiyuan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-29
 * Time: 22:09:19
 * To change this template use File | Settings | File Templates.
 */
public class GenericFoo<T>
{
    private T foo;

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public static void main(String[] args)
    {
        GenericFoo<? extends List >ge =null;

        ge=new GenericFoo<ArrayList>();
        ge=new GenericFoo<LinkedList>();

    }

}
