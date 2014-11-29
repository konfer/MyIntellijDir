package com.shegnsiyuan;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-6
 * Time: 11:02:44
 * To change this template use File | Settings | File Templates.
 */
public class EnumSetDemo3
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
        List<FontConstant> list=new ArrayList<FontConstant>();

        list.add(FontConstant.Bold);
        list.add(FontConstant.Italic);
        list.add(FontConstant.Plain);

        EnumSet<FontConstant> enumSet=EnumSet.copyOf(list);

        showEnumSet(enumSet);
        
    }

}
