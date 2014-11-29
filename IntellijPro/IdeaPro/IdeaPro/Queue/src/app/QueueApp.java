package app;

import vo.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-25
 * Time: 16:16:02
 * To change this template use File | Settings | File Templates.
 */
public class QueueApp
{
    public static void main(String[] args)
    {
        Queue theQueue=new Queue(5);

        theQueue.remove();
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(79);
        theQueue.insert(80);

        while(!theQueue.isEmpty())
        {
            long n=theQueue.remove();
            System.out.println(n);
            System.out.println(" ");
        }

        System.out.println(" ");

    }

}
