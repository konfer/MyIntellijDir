package app;

import vo.StackX;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-22
 * Time: 16:16:35
 * To change this template use File | Settings | File Templates.
 */
public class StackApp
{
    public static void main(String[] args)
    {
        StackX theStack=new StackX(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);

        while(!theStack.isEmpty())
        {
            long value=theStack.pop();
            System.out.println(value);
            System.out.println(" ");
            
        }

    }

}
