package com.InputOutput.StringIo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-7
 * Time: 21:46:46
 * To change this template use File | Settings | File Templates.
 */
public class SystemIn
{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bis=new BufferedReader(isr);

        String str;
        while((str=bis.readLine())!=null)
        {
            System.out.println(str);
        }
        bis.close();
    }
}
