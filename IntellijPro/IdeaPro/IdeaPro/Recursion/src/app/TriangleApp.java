package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-15
 * Time: 10:01:45
 * To change this template use File | Settings | File Templates.
 */
public class TriangleApp
{
    public static int theNumber;

    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a number :");
        theNumber=getInt();                       
        int theAnswer=triangle(theNumber);
        System.out.println("Triangle= "+theAnswer);
    }

    public static int triangle(int n)
    {
        System.out.println("Entering:n= "+n);
        if(n==1)
        {
            System.out.println("Returning 1");
            return 1;
        }
        else
        {
            int temp=n+triangle(n-1);
            System.out.println("Returning a:"+temp);
            return(n+triangle(n-1));
        }
    }

    public static String getString() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }

    public static int getInt() throws IOException
    {
        String s= getString();
        return Integer.parseInt(s);
    }

}
