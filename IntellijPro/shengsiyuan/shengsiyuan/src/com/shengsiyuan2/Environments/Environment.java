package com.shengsiyuan2.Environments;

import com.shengsiyuan2.Implements.AddStrategy;
import com.shengsiyuan2.interfaces.Strategy;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-18
 * Time: 19:26:28
 * To change this template use File | Settings | File Templates.
 */
public class Environment
{
    private Strategy stra;

    public Environment()
    {
       // this.stra=stra;
    }

    public Strategy getStra()
    {
        return stra;
    }

    public void setStra(Strategy stra)
    {
        this.stra = stra;
    }

    public int count(int a ,int b)
    {
        return stra.calculate(a,b);
    }

    public static void main(String[] args)
    {
        Strategy stra=new AddStrategy();
        Environment en=new Environment();
        en.setStra(stra);
        System.out.println(en.count(4,5));

    }

}
