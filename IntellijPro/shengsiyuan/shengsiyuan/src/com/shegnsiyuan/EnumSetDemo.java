package com.shegnsiyuan;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-5
 * Time: 23:50:36
 * To change this template use File | Settings | File Templates.
 */
public class EnumSetDemo
{
    public static void showEnumSet(EnumSet<FontConstant> enumSet)
    {
         for(Iterator<FontConstant> iter=enumSet.iterator();iter.hasNext();)
         {
             System.out.println(iter.next());
         }
    }

    public static void main(String[] args)
    {
        EnumSet<FontConstant> enumSet=EnumSet.of(FontConstant.Plain);
        showEnumSet(enumSet);
        showEnumSet(EnumSet.complementOf(enumSet));
    }

}

enum FontConstant
{
    Plain,Bold,Italic
}
