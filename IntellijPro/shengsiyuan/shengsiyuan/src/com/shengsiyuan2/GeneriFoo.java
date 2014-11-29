package com.shengsiyuan2;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-26
 * Time: 13:59:17
 * To change this template use File | Settings | File Templates.
 */
public class GeneriFoo<T>
{
    private T foo;

    public T getFoo()
    {
        return foo;
    }

    public void setFoo(T foo)
    {
        this.foo=foo;
    }

    public static void main(String[] args)
    {
        GeneriFoo<Boolean> foo1=new GeneriFoo<Boolean>();
        GeneriFoo<Integer> foo2=new GeneriFoo<Integer>();

        GeneriFoo a=new GeneriFoo();

        foo1.setFoo(new Boolean(false));
        foo2.setFoo(new Integer(3));

        Boolean b=foo1.getFoo();
        Integer i=foo2.getFoo();

        System.out.println(b+" "+i)    ;

    }

}
