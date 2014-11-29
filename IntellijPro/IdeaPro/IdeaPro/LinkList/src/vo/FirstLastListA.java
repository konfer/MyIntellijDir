package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-5
 * Time: 10:56:30
 * To change this template use File | Settings | File Templates.
 */
public class FirstLastListA
{
    private LinkA first;
    private LinkA last;

    public FirstLastListA()
    {
        first=null;
        last=null;
    }

    public boolean isEmpty()
    {
        return (first==null);
    }

    public void insertFirst(long dData)
    {
        LinkA newLink=new LinkA(dData);
        if( isEmpty())
        {
             last=newLink;
        }
        newLink.next=first;
        first=newLink;
    }

    public void insertLast(long dData)
    {
        LinkA newLink=new LinkA(dData);
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

    public long deleteFirst()
    {
        long temp=first.dData;
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
        LinkA current=first;
        while(current!=null)
        {
            current.displayLink();
            current=current.next;
        }
        System.out.println(" ");
    }

}
