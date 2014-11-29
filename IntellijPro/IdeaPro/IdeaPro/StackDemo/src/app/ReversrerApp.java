package app;

import vo.Reverser;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-22
 * Time: 17:12:31
 * To change this template use File | Settings | File Templates.
 */
public class ReversrerApp
{
    public static void main(String[] args)  throws IOException
    {
        String input,output;
        input="Hello world";
        Reverser theReverser=new Reverser(input);
        output=theReverser.doRev();
        System.out.println("Reversed: "+output);
        
    }

}
