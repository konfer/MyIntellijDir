package app;

import vo.PriorityQueue;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-27
 * Time: 15:14:13
 * To change this template use File | Settings | File Templates.
 */
public class PriorityApp
{
    public static void main(String[] args) throws IOException
    {
        PriorityQueue thePriQueue=new PriorityQueue(5);
        thePriQueue.insert(50);
        thePriQueue.insert(40);
        thePriQueue.insert(30);
        thePriQueue.insert(20);
        thePriQueue.insert(10);

        while(!thePriQueue.isEmpty())
        {
            long term=thePriQueue.remove();
            System.out.println(term+" ");
        }
        System.out.println(" ");

    }

}
