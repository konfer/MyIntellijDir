package App;

import vo.OrdArray;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-20
 * Time: 15:21:35
 * To change this template use File | Settings | File Templates.
 */
public class OrderApp
{
    public static void main(String[] args)
    {
        int maxSize=100;
        OrdArray arr;
        arr=new OrdArray(maxSize);

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

        int searchKey=55;

        if(arr.find(searchKey)!=arr.Size())
        {
            System.out.println("Found "+searchKey+", the number of ¡°"+searchKey+"¡± is "+arr.find(searchKey));
        }
        else
        {
            System.out.println("Can't Found "+searchKey);
        }
        arr.display();

        arr.delete(25);
        arr.delete(34);
        arr.delete(35);

        arr.display();

    }

}
