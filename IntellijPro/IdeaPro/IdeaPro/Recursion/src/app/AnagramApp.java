package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-15
 * Time: 15:29:40
 * To change this template use File | Settings | File Templates.
 */
public class AnagramApp
{
    public static int size;
    public static int count;
    public char[] arrChar=new char[100];

    public static void main(String[] args)throws IOException
    {
        System.out.println("Enter a word: ");
        String input=getString();
    }

    public static void doAnagram(int newSize)
    {
        if(newSize==1)
        {
            return;
        }
        for(int j=0;j<newSize;j++)
        {
            doAnagram(newSize-1);
            if(newSize==2)
            {
                
            }
        }
    }

    public static String getString() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }

}
