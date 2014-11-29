package app;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import vo.BrachetChecker;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-22
 * Time: 22:18:27
 * To change this template use File | Settings | File Templates.
 */
public class BrackerApp
{
    public static void main(String[] args) throws IOException
    {
        String input;
        while(true)
        {
            System.out.println("Enter String containing delimiters:");
            System.out.flush();
            input=getString();
            if(input.equals(""))
                break;

            BrachetChecker theChecker=new BrachetChecker(input);
            theChecker.check();
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
