package com.ChatProject.util;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-18
 * Time: 13:42:51
 * To change this template use File | Settings | File Templates.
 */
public class CharacterUtil
{
    public static final String ERROR="ERROR";
    public static final String SUCCESS="SUCCESS";
    public static String SERVER_HOST;
    public static String SERVER_PORT;
    public static String CLIENT_NAME;
    public static int randomPort=generatePort();
    public static int ramdomUserListPort= generatePort();

    public static boolean isEmpty(String str)
    {
        return "".equals(str)?true:false;
    }

    public static boolean isNumber(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPortCorrect(String port)
    {
        int num=Integer.parseInt(port);
        if(num<=1024||num>65535)
        {
            return false;
        }
        return true;
    }

    public static boolean isUserNameCorrect(String str)
    {
        return true;
    }

    public static int generatePort()
    {
        int port =(int)(Math.random()*60000+1025);
        return port;
    }

    public static boolean isUserNameDuplicated(Map<String ,Integer> map,String userName)
    {
        return true;
    }


}
