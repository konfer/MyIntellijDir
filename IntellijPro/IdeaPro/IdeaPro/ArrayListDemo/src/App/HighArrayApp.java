package App;

import vo.HighArray;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-20
 * Time: 11:00:58
 * To change this template use File | Settings | File Templates.
 */
public class HighArrayApp
{
    public static void main(String[] args)
    {
        int maxSize=12;

        HighArray arr;
        arr=new HighArray(maxSize);

        arr.insert(67);
        arr.insert(79);
        arr.insert(54);
        arr.insert(2);
        arr.insert(6);
        arr.insert(11);
        arr.insert(49);
        arr.insert(8);
        arr.insert(25);
        arr.insert(34);

        arr.display();

        int searchKey=34;
        if(arr.find(searchKey))
        {
            System.out.println("Found "+searchKey);
        }
        else
        {
            System.out.println("Can't Found "+searchKey);
        }

        arr.delete(11);
        arr.delete(54);
        arr.delete(34);

        arr.findAndTell(11);
        arr.findAndTell(8);

        arr.display();

        //arr.bubbleSort();
        arr.selectionSort();
        //arr.insertSort();
        arr.display();

    }

}
