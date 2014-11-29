package app;

import vo.Link;
import vo.LinkList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-3
 * Time: 11:01:14
 * To change this template use File | Settings | File Templates.
 */
public class LinklistApp
{
    public static void main(String[] args)
    {
        LinkList theList=new LinkList();
        theList.insertFirst(22,2.99);
        theList.insertFirst(44,2.99);
        theList.insertFirst(66,6.99);
        theList.insertFirst(55,5.99);

        theList.displayList();

        Link aLink=theList.deleteFirst();
        System.out.println("Deleted");
        aLink.displayLink();
        System.out.println(" ");
        theList.displayList();

        Link f=theList.find(44);
        if(f!=null)
        {
            System.out.println("Found link with key "+f.iData);
        }
        else
        {
            System.out.println("Cant't find link");
        }

        Link d=theList.delete(66);
        if(d!=null)
        {
            System.out.println("Delete link with key "+d.iData);
        }
        else
        {
            System.out.println("Cant't find link");
        }

        theList.displayList();

    }


}
