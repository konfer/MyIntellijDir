package com.shengsiyuan2.Implements;

import com.shengsiyuan2.interfaces.Strategy;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-18
 * Time: 19:23:25
 * To change this template use File | Settings | File Templates.
 */
public class Substract implements Strategy
{
    public int calculate(int a, int b)
    {
        return a-b;
    }
}
