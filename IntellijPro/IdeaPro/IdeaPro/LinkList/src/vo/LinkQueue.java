package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-8
 * Time: 16:51:19
 * To change this template use File | Settings | File Templates.
 */
public class LinkQueue
{
    private FirstLastListA theList;

    public LinkQueue()
    {
        theList=new FirstLastListA();
    }

    public boolean isEmpty()
    {
        return theList.isEmpty();
    }

    public void insert(long j)
    {
        theList.insertLast(j);
    }

    public long remove()
    {
        if(!isEmpty())
        {
            return theList.deleteFirst();
        }
        else
            return 0;
    }

    public void displayQueue()
    {
        System.out.println("Queue (front-->rear): ");
        theList.displayList();
    }

}
