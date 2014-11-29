package app;

import Iterators.ListIterator;
import vo.LinkListA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-29
 * Time: 14:52:45
 * To change this template use File | Settings | File Templates.
 */
public class InterIterApp
{
    public static void main(String[] args) throws IOException
    {
        LinkListA theList=new LinkListA();
        ListIterator iter=theList.getIterator();
        long value;

        iter.insertBefore(10);
        iter.insertAfter(20);
        iter.insertAfter(80);
        iter.insertBefore(55);

        theList.displayList();

        iter.locate(55);
        theList.displayList();

        iter.insertAfter(70);
        theList.displayList();

        iter.locate(55);
        iter.insertBefore(40);
        theList.displayList();

        iter.reset();
        iter.insertBefore(5);

        theList.displayList();

        

       /* while(true)
        {
            System.out.println("Enter first letter of show,reset: ");
            System.out.println("next,get,before,after,delete: ");
            System.out.flush();
            int choice=getChar();
        }       */

    }

    public static String getString() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }

    public static char getChar() throws IOException
    {
        String s=getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException
    {
        String s=getString();
        return Integer.parseInt(s);
    }


}
