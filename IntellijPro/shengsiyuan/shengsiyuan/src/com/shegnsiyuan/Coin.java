package com.shegnsiyuan;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-5
 * Time: 23:22:19
 * To change this template use File | Settings | File Templates.
 */
public enum Coin
{
    penny("hello") ,nikel("world"),dime("welcom") ,quarter("hello world") ;

    private String value;

    public String getValue()
    {
        return value;    
    }

    Coin(String value)
    {
        this.value=value;
    }

    public static void main(String[] args)
    {
        Coin coin=Coin.quarter;

        System.out.println(coin.getValue());
    }

}
