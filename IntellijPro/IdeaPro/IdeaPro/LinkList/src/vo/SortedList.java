package vo;

import vo.LinkA;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-9
 * Time: 10:13:32
 * To change this template use File | Settings | File Templates.
 */
public class SortedList
{
    private LinkA first;

    public SortedList()
    {
        first=null;
    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void insert(long key)
    {
        LinkA newLink=new LinkA(key);
        LinkA previous=null;
        LinkA current=first;

        while(current!=null&&key>current.dData)
        {
            previous=current;
            current=current.next;
        }
        if(previous==null)
        {
            first=newLink;
        }
        else
        {
            previous.next=newLink;
        }
        newLink.next=current;
    }

    public LinkA remove()
    {
        if(!isEmpty())
        {
            LinkA temp=first;
            first=first.next;
            return temp;
        }
        else
        {
            System.out.println("Empty,can't remove");
            return null;
        }
    }

    public void displayList()
    {
        System.out.println("List (first-->last) :");
        LinkA current=first;
        while(current!=null)
        {
            current.displayLink();
            current=current.next;
        }
        System.out.println(" ");
    }
    
}
