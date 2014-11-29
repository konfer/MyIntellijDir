package com.MultiThread;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-11-11
 * Time: 21:10:12
 * To change this template use File | Settings | File Templates.
 */
class MoneyThread extends Thread
{
    private Bank bank;

    public MoneyThread(Bank b)
    {
        this.bank=b;
    }

    public void run()
    {
        try {
            System.out.println(bank.getMoney(800));
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}

