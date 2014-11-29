package com.shegnsiyuan;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-6
 * Time: 12:22:38
 * To change this template use File | Settings | File Templates.
 */
public enum AccessRight
{
    MANAGE,NORMAL,EMPLOYEE;
}

class AccessControl
{
    public static boolean check(AccessRight ac)
    {
        if(ac==AccessRight.MANAGE)
        {
            return true;
        }
        else if(ac==AccessRight.NORMAL)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        AccessRight ac=AccessRight.valueOf("MANAGE") ;
        System.out.println(check(ac));
    }

}
