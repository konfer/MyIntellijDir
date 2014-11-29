package App;

import vo.Person;
import vo.classDataArray;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-20
 * Time: 16:55:52
 * To change this template use File | Settings | File Templates.
 */
public class ClassDataApp
{
    public static void main(String[] args)
    {
        int maxSize=100;
        classDataArray arr;
        arr=new classDataArray(maxSize);

        arr.insert("Evans","Party",24);
        arr.insert("Smith","lorraine",36);
        arr.insert("Yee","Tom",43);
        arr.insert("Adams","Henry",43);
        arr.insert("ly","kof",65);
        arr.insert("mm","kfi",42);

        arr.displayA();

        String searchKey="Evans";
        Person found=arr.find(searchKey) ;
        if(found!=null)
        {
            System.out.println("Found ");
            found.displayPerson();
        }
        else
        {
            System.out.println("Can't find "+searchKey);
        }

        System.out.println("Deleting Henry,kof,and li");
        arr.delete("ly");
        arr.delete("mm");
        arr.delete("li");

        arr.displayA();
        System.out.println("Sort");

        arr.insertSort();
        arr.displayA();

    }

}
