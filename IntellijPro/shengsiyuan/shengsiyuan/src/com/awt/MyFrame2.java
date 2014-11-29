package com.awt;

import java.awt.*;
import java.awt.event.*;
import java.sql.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-27
 * Time: 13:06:52
 * To change this template use File | Settings | File Templates.
 */
public class MyFrame2
{
    public static void main(String[] args)
    {
        Frame f=new Frame("Test Button");
        Button b=new Button("Press Me");
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("invoke");
            }
        });
        f.add(b,BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }

}

class ButtonClicHandler implements ActionListener
{
    @SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent e)
    {
        long _time=e.getWhen();
        Date date=new Date(_time);
        System.out.println(date.toLocaleString());
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

class MyWindowListener extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
//class MyWindowListener implements WindowListener
//{
//
//    public void windowOpened(WindowEvent e) {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    public void windowClosing(WindowEvent e)
//    {
//        System.exit(0);
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    public void windowClosed(WindowEvent e) {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    public void windowIconified(WindowEvent e) {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    public void windowDeiconified(WindowEvent e) {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    public void windowActivated(WindowEvent e) {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
//
//    public void windowDeactivated(WindowEvent e) {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
//}