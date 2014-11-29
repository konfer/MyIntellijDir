package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-5
 * Time: 10:56:30
 * To change this template use File | Settings | File Templates.
 */
public class FirstLastList
{
    private Link first;
    private Link last;

    public FirstLastList()
    {
        first=null;
        last=null;
    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void insertFirst(int id,double dData)
    {
        Link newLink=new Link(id,dData);
        if( isEmpty())
        {
             last=newLink;
        }
        newLink.next=first;
        first=newLink;
    }

    public void insertLast(int id,double dData)
    {
        Link newLink=new Link(id,dData);
        if(isEmpty())
        {
            first=newLink;
        }
        else
        {
            last.next=newLink;
        }
        last=newLink;
    }

    public Link deleteFirst()
    {
        Link temp=first;
        if(first.next==null)
        {
            last=null;
        }
        first=first.next;
        return temp;
    }

    public void displayList()
    {
        System.out.println("List (first-->last) ");
        Link current=first;
        while(current!=null)
        {
            current.displayLink();
            current=current.next;
        }
        System.out.println(" ");
    }

}
