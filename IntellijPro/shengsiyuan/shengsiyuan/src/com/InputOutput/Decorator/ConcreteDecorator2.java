package com.InputOutput.Decorator;

import com.InputOutput.Decorator.Decorator;
import com.InputOutput.Decorator.InterFaces.Component;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-7
 * Time: 12:09:02
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteDecorator2 extends Decorator
{
    public ConcreteDecorator2(Component c)
    {
        super(c);
    }

    @Override
    public void doSometing()
    {
        super.doSometing();    //To change body of overridden methods use File | Settings | File Templates.
        this.doAnotherThing();
    }

    public void doAnotherThing()
    {
        System.out.println("2 other");
    }

}
