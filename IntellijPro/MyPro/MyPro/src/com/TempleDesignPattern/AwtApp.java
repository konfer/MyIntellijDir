package com.TempleDesignPattern;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtApp
{

	  /**
	   * @param args
	   */
	  public static void main(String[] args)
	  {
			Frame f=new Frame("title");
			f.addMouseMotionListener(new MouseMotionAdapter()
			{
				  @Override
				  public void mouseMoved(MouseEvent e)
				  {
						System.out.println("x: "+e.getX()+"y: "+e.getY());
				  }
			});
			
			f.addWindowListener(new WindowAdapter()
			{
				  public void WindowClosing(WindowEvent e)
				  {
						System.out.println("¹Ø±Õ´°¿Ú");
						System.exit(0);
				  }
			});
			
			f.setSize(new Dimension(50,100));
			f.setVisible(true);
			

	  }

}
