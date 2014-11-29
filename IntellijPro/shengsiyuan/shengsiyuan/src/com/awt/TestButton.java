package com.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-25
 * Time: 21:22:38
 * To change this template use File | Settings | File Templates.
 */
public class TestButton
{
    public static void main(String[] args)
    {
        Frame f=new Frame("Test Button");
        Button b=new Button("Press Me");
        b.addActionListener(new ButtonHandler());
        f.add(b,BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }



}

class ButtonHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Button is pressed");
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
