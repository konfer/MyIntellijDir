package app;

import vo.FirstLastList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-5
 * Time: 15:10:47
 * To change this template use File | Settings | File Templates.
 */
public class FirstLastApp
{
    public static void main(String[] args)
    {
        FirstLastList theList=new FirstLastList();

        theList.insertFirst(22,22.2);
        theList.insertFirst(33,33.3);
        theList.insertFirst(44,44.4);
        theList.insertFirst(55,55.5);

        theList.insertLast(11,11.1);

        theList.displayList();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.displayList();
        
    }

}
