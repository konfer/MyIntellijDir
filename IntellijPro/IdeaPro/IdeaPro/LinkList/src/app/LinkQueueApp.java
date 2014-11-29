package app;

import vo.LinkQueue;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-8
 * Time: 17:14:37
 * To change this template use File | Settings | File Templates.
 */
public class LinkQueueApp
{
    public static void main(String[] args)
    {
        LinkQueue theQueue=new LinkQueue();

        theQueue.insert(20);
        theQueue.insert(40);

        theQueue.displayQueue();

        theQueue.insert(60);
        theQueue.insert(80);

        theQueue.displayQueue();

        theQueue.remove();
        theQueue.remove();

        theQueue.displayQueue();

    }

}
