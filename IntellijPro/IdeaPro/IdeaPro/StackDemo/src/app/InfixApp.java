package app;

import fix.InToPost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-29
 * Time: 10:50:46
 * To change this template use File | Settings | File Templates.
 */
public class InfixApp
{
    public static void main(String[] args) throws IOException
    {
        String input,output;
        while(true)
        {
            System.out.print("Enter infix: ");
            System.out.flush();
            input=getString();
            if(input.equals(" "))
                break;
            InToPost theTrans=new InToPost(input);
            output=theTrans.doTrans();
            System.out.println("Postfix is "+output+'\n');
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
