package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-9
 * Time: 15:59:30
 * To change this template use File | Settings | File Templates.
 */
public class SortedListA
{
    private LinkA first;

    public SortedListA()
    {
        first=null;
    }

    public SortedListA(LinkA[] LinkArr)
    {
        first=null;
        for(int j=0;j<LinkArr.length;j++)
        {
            insert(LinkArr[j]);
        }
    }

    public void insert(LinkA lin)
    {
        LinkA previous=null;
        LinkA current=first;

        while(current!=null&&lin.dData>current.dData)
        {
            previous=current;
            current=current.next;
        }

        if(previous==null)
        {
            first=lin;
        }
        else
        {
            previous.next=lin;
        }
        lin.next=current;
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

    public boolean isEmpty()
    {
        return (first==null);
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
