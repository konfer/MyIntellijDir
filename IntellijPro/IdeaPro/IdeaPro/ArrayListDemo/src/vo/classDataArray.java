package vo;

import vo.Person;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-20
 * Time: 16:40:10
 * To change this template use File | Settings | File Templates.
 */
public class classDataArray
{
    private Person[] a;
    private int nElems;

    public classDataArray(int max)
    {
        a=new Person[max];
        nElems=0;
    }

    public Person find(String searchName)
    {
        int j;
        for(j=0;j<nElems;j++)
        {
            if(a[j].getLast().equals(searchName))
                break;
        }
        if(j==nElems)
            return null;
        else
            return a[j];
    }

    public void insert(String last,String first,int age)
    {
        a[nElems]=new Person(last,first,age);
        nElems++;
    }

    public boolean delete(String searchName)
    {
        int j;
        for(j=0;j<nElems;j++)
        {
            if(a[j].getLast().equals(searchName))
                break;
        }
        if(j==nElems)
        {
            System.out.println("Can't find "+searchName);
            return false;
        }
        else
        {
            for(int k=j;k<nElems;k++)
            {
                a[k]=a[k+1];
            }
            nElems--;
            return true ;
        }
    }

    public void insertSort()
    {
        int cur,left;
        for(cur=1;cur<nElems;cur++)
        {
            left=cur;
            Person per=a[cur];
            while(left>0&&a[left-1].getLast().compareTo(per.getLast())>0)
            {
                a[left]=a[left-1];
                --left;
            }
            a[left]=per;
        }
    }

    public void displayA()
    {
        for(int j=0;j<nElems;j++)
        {
            a[j].displayPerson();
        }
    }

}
