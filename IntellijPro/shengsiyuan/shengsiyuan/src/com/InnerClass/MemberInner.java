package com.InnerClass;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-29
 * Time: 13:22:20
 * To change this template use File | Settings | File Templates.
 */
public class MemberInner
{
    private int a=4;

    public void invokeInner()
    {
        //new Inner2().doSomeThing();
        Inner2 inn=this.new Inner2();
        inn.doSomeThing();
    }

    public class Inner2
    {
        public void doSomeThing()
        {
            System.out.println("Inner class");
            System.out.println(MemberInner.this.a);
        }
    }
}

class MemberInnerClassTest
{
    public static void main(String[] args)
    {
        MemberInner.Inner2 Inn=new MemberInner().new Inner2();
        Inn.doSomeThing();
        MemberInner inn=new MemberInner();
        inn.invokeInner();
    }
}
