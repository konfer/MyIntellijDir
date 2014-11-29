package com.InputOutput.Decorator;

import com.InputOutput.Decorator.InterFaces.Component;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-7
 * Time: 11:41:00
 * To change this template use File | Settings | File Templates.
 */
public class Decorator implements Component
{
    private Component c;

    public Decorator(Component com)
    {
        this.c=com;
    }

    public void doSometing()
    {
        c.doSometing();
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
