package com.shegnsiyuan;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-6
 * Time: 11:33:50
 * To change this template use File | Settings | File Templates.
 */
public class EnumMapDemo
{
    public static void main(String[] args)
    {
        Map<Action,String> map=new EnumMap<Action,String>(Action.class);

        map.put(Action.TURN_LEFT,"×ó");
        map.put(Action.TURN_RIGHT,"ÓÒ");
        map.put(Action.SHOOT,"Éä»÷");

        for(Action action:Action.values())
        {
            System.out.println(map.get(action));
        }

    }
}

enum Action
{
    TURN_LEFT,TURN_RIGHT,SHOOT;
}
