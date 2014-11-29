package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-3
 * Time: 10:23:34
 * To change this template use File | Settings | File Templates.
 */
public class LinkList
{
    private Link first;

    public void LinkList()
    {
        first=null;
    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void insertFirst(int id,double dd)
    {
        Link newLink=new Link(id,dd);
        if(!isEmpty())
        {
            newLink.next=first;
        }
        first=newLink;
    }

    public Link deleteFirst()
    {
        if(!isEmpty())
        {
            Link temp=first;
            first=first.next;
            return temp;
        }
        else
        {
            System.out.println("The LinkList is Empty");
            return null;
        }
    }

    public Link find(int key)
    {
        Link current=first;
        while(current.iData!=key)
        {
            if(current.next==null)
                return null;
            else
                current=current.next;      
        }
        return current;
    }

    public Link delete(int key)
    {
        Link current=first;
        Link previous=first;
        while(current.iData!=key)
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

    public void displayList()
    {
        System.out.println("List(first-->last);");
        Link current=first;
        while(current!=null)
        {
            current.displayLink();
            current=current.next;
        }
        System.out.println(" ");
    }

}
