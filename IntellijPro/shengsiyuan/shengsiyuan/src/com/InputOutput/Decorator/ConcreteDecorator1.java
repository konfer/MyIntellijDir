package com.InputOutput.Decorator;

import com.InputOutput.Decorator.InterFaces.Component;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-7
 * Time: 11:50:41
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteDecorator1 extends Decorator
{
    public ConcreteDecorator1(Component c)
    {
        super(c);
    }

    @Override
    public void doSometing()
    {
        super.doSometing();
        this.doAnotherThing();
        //To change body of overridden methods use File | Settings | File Templates.
    }

    private void doAnotherThing()
    {
        System.out.println("other");
    }

}
