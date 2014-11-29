package com.shengsiyuan2;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-27
 * Time: 12:50:26
 * To change this template use File | Settings | File Templates.
 */
public class WrapperFoo<T>
{
    private GenericFoo3<T> foo  ;

    public GenericFoo3<T> getFoo() {
        return foo;
    }

    public void setFoo(GenericFoo3<T> foo) {
        this.foo = foo;
    }

    public static void main(String[] args)
    {
        GenericFoo3<Integer> foo=new GenericFoo3<Integer>();
        foo.setFoo(new Integer(10));

        WrapperFoo<Integer> wrapper=new WrapperFoo<Integer>();
        wrapper.setFoo(foo);

        GenericFoo3<Integer> i=wrapper.getFoo();
        System.out.println(i.getFoo());

    }

}

class GenericFoo3<T>
{
    private T foo;

    public GenericFoo3()
    {
        
    }

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }
}