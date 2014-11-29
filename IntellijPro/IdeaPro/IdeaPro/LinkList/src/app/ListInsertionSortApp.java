package app;

import vo.LinkA;
import vo.SortedListA;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-9
 * Time: 16:19:43
 * To change this template use File | Settings | File Templates.
 */
public class ListInsertionSortApp
{
    public static void main(String[] args)
    {
        int size=10;
        LinkA[] linkArray=new LinkA[size];
        for(int j=0;j<size;j++)
        {
            int n=(int)(java.lang.Math.random()*99);
            LinkA newLink=new LinkA(n);
            linkArray[j]=newLink;
        }
        System.out.println("Unsorted array: ");
        for(int j=0;j<size;j++)
        {
            System.out.println(linkArray[j].dData);
        }
        System.out.println(" ");
        SortedListA theSortedList=new SortedListA(linkArray);
        for(int j=0;j<size-1;j++)
        {
            linkArray[j]=theSortedList.remove();            
        }
        for(int j=0;j<size;j++)
        {
            System.out.println(linkArray[j].dData);
        }
    }

}
