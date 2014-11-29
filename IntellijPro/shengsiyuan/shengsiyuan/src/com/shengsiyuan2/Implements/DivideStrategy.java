package com.shengsiyuan2.Implements;

import com.shengsiyuan2.interfaces.Strategy;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-18
 * Time: 19:25:29
 * To change this template use File | Settings | File Templates.
 */
public class DivideStrategy implements Strategy {
    public int calculate(int a, int b) {
        return a/b;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
