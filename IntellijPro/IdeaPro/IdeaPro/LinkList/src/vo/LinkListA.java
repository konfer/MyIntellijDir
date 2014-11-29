package vo;

import Iterators.ListIterator;

import java.sql.Array;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-5
 * Time: 16:53:26
 * To change this template use File | Settings | File Templates.
 */
public class LinkListA
{
    private LinkA first;

    public LinkListA()
    {
        first=null;
    }

    public LinkA getFirst()
    {
        return first;
    }

    public void setFirst(LinkA f)
    {
        first=f;
    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void insertFirst(long dd)
    {
        LinkA newLink=new LinkA(dd);
        if(!isEmpty())
        {
            newLink.next=first;
        }
        first=newLink;
    }

    public LinkA deleteFirst()
    {
        if(!isEmpty())
        {
            LinkA temp=first;
            first=first.next;
            return temp;
        }
        else
        {
            System.out.println("The LinkList is Empty");
            return null;
        }
    }

    public LinkA find(long key)
    {
        LinkA current=first;
        while(current.dData!=key)
        {
            if(current.next==null)
                return null;
            else
                current=current.next;
        }
        return current;
    }

    public LinkA delete(long key)
    {
        LinkA current=first;
        LinkA previous=first;
        while(current.dData!=key)
        {
            if(current.next==null)
            {
                return null;
            }
            else
            {
                previous=current;
                current=current.next;
            }
            if(current==first)
            {
                first=first.next;
            }
            else
            {
                previous.next=current.next;
            }
        }
        return current;
    }

    public ListIterator getIterator()
    {
        return new ListIterator(this);
    }

    public void displayList()
    {
        System.out.println("List(first-->last);");
        LinkA current=first;
        while(current!=null)
        {
            current.displayLink();
            current=current.next;
        }
        System.out.println(" ");
    } 

}
