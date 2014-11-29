package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-11
 * Time: 10:37:29
 * To change this template use File | Settings | File Templates.
 */
public class DoubleLinkedList
{
    private DoubleLink first;
    private DoubleLink last;

    public DoubleLinkedList()
    {
        first=null;
        last=null;
    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void insertFirst(long data)
    {
        DoubleLink newLink=new DoubleLink(data);
        if(isEmpty())
        {
            last=newLink;
        }
        else
        {
            first.previous=newLink;
        }
        newLink.next=first;
        newLink.previous=null;
        first=newLink;
    }

    public void insertLast(long data)
    {
        DoubleLink newLink=new DoubleLink(data);
        if(isEmpty())
        {
            first=newLink;
        }
        else
        {
            last.next=newLink;
            newLink.previous=last;
        }
        last=newLink;
        newLink.next=null;
    }

    public DoubleLink deleteFirst()
    {
        if(!isEmpty())
        {
            DoubleLink temp=first;
            if(first.next==null)
            {
                last=null;
            }
            else
            {
                first.next.previous=null;
            }
            first=first.next;
            return temp;
        }
        else
        {
            System.out.println("Empty,can't delete");
            return null;
        }
    }

    public DoubleLink deleteLast()
    {
        if(!isEmpty())
        {
            DoubleLink temp=last;
            if(first.next==null)
            {
                first=null;
            }
            else
            {
                last.previous.next=null;
            }
            last=last.previous;
            return temp;
        }
        else
        {
            System.out.println("Empty,can't delete");
            return null;
        }
    }

    public boolean insertAfter(long key,long data)
    {
        DoubleLink current=first;
        while(current.dData!=key)
        {
            current=current.next;
            if(current.next==null)
            {
                return false;
            }
        }
        
        DoubleLink newLink=new DoubleLink(data);
        if(current==last)
        {
            last=current;
            current.next=null;
        }
        else
        {
            newLink.next=current.next;
            newLink.next.previous=newLink;
        }
        newLink.previous=current;
        current.next=newLink;
        return true;
    }

    public DoubleLink deleteKey(long key)
    {
        DoubleLink current=first;
        while(current.dData!=key)
        {
            current=current.next;
            if(current==null)
            {
                return null;
            }
            if(current==first)
            {
                first=current.next;
            }
            else
            {
                current.previous.next=current.next;
            }
            if(current==last)
            {
                last=last.previous;
            }
            else
            {
                current.next.previous=current.previous;
            }
        }
        return current;
    }

}
