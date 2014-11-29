package com.shegnsiyuan;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-6
 * Time: 10:57:54
 * To change this template use File | Settings | File Templates.
 */
public class EnumSetDemo2
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
        EnumSet<FontConstant> fonSet=EnumSet.noneOf(FontConstant.class);
        fonSet.add(FontConstant.Bold);
        fonSet.add(FontConstant.Italic);

        showEnumSet(fonSet);
    }

}
