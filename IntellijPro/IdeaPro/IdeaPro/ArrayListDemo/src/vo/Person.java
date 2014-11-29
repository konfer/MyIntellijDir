package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-20
 * Time: 16:23:31
 * To change this template use File | Settings | File Templates.
 */
public class Person
{
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last,String first,int a)
    {
        lastName=last;
        firstName=first;
        age=a;
    }

    public void displayPerson()
    {
        System.out.println(" last name:"+lastName+" ,first name:"+firstName+" , Age:"+age);
    }

    public String getLast()
    {
        return lastName;
    }

}
