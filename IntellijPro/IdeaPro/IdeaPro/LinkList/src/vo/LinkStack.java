package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-5
 * Time: 16:15:54
 * To change this template use File | Settings | File Templates.
 */
public class LinkStack
{
    private LinkListA theList;

    public LinkStack()
    {
        theList=new LinkListA();
    }

    public void push(long dData)
    {
        theList.insertFirst(dData);
    }

    public double pop()
    {
        return theList.deleteFirst().dData;
    }

    public boolean isEmpty()
    {
        return (theList.isEmpty());
    }

    public void displayStack()
    {
        System.out.println("Stack(top-->bottom):");
        theList.displayList();
    }

}
