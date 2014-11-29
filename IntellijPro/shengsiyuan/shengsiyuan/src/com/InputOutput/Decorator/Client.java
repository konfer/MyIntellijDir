package com.InputOutput.Decorator;

import com.InputOutput.Decorator.InterFaces.Component;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-7
 * Time: 12:06:25
 * To change this template use File | Settings | File Templates.
 */
public class Client
{
    public static void main(String[] args)
    {
        Component c=new ConcreteComponent();
        Component com=new ConcreteDecorator1(c);
        Component com1=new ConcreteDecorator2(com);
        com1.doSometing();

    }
}
