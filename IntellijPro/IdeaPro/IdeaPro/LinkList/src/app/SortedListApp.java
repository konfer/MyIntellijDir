package app;

import vo.SortedList;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-9
 * Time: 11:09:01
 * To change this template use File | Settings | File Templates.
 */
public class SortedListApp
{
    public static void main(String[] args)
    {
        SortedList theSortedList=new SortedList();
        theSortedList.insert(20);
        theSortedList.insert(40);
        theSortedList.insert(30);

        theSortedList.displayList();
                                                
        theSortedList.insert(10);
        theSortedList.insert(35);

        theSortedList.displayList();

        theSortedList.remove();

        theSortedList.displayList();

    }

}
