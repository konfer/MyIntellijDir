package Iterators;

import vo.LinkA;
import vo.LinkListA;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-29
 * Time: 10:08:43
 * To change this template use File | Settings | File Templates.
 */
public class ListIterator
{
    public LinkA current;
    public LinkA previous;
    private LinkListA ourList;

    public ListIterator(LinkListA list)
    {
        ourList=list;
        reset();
    }

    public void reset()
    {
        current=ourList.getFirst();
        previous=null;
    }

    public boolean atEnd()
    {
        return (current.next==null) ;
    }

    public void nextLink()
    {
        previous=current;
        current=current.next;
    }

    public LinkA getCurrent()
    {
        return current;
    }

    public void insertAfter(long dd)
    {
        LinkA newLink=new LinkA(dd);
        if(ourList.isEmpty())
        {
            ourList.setFirst(newLink);
            current=newLink;
        }
        else
        {
            newLink.next=current.next;
            current.next=newLink;
            nextLink();
        }
    }

    public void insertBefore(long dd)
    {
        LinkA newLink=new LinkA(dd);
        newLink.next=current;
        if(previous==null)
        {
            ourList.setFirst(newLink);
            reset();
        }
        else
        {
            previous.next=newLink;
            current=newLink;
        }
    }

    public long deleteCurrent()
    {
        long value=current.dData;
        if(!ourList.isEmpty())
        {
            if(previous==null)
            {
                ourList.setFirst(current.next);
                reset();
            }
            else
            {
                previous.next=current.next;
                if(atEnd())
                    reset();
                else
                    current=current.next;
            }
        }
        else
        {
            return -1;
        }
        return value;
    }

    /*public find(long key)
    {
        LinkA cur=ourList.getFirst();
        while(cur.dData!=key)
        {
            if(cur.next==null)
               return null;
            else
            {
                previous=cur;
            }
                cur=cur.next;
        }
        return current;
    }
    */

    public void locate(long dData)
    {
        LinkA cur=ourList.getFirst();
        //reset();
        while(cur.dData!=dData)
        {
            if(cur.next!=null)
            {
                previous=cur;
                cur=cur.next;
                current=cur;
            }
        }
    }

}
