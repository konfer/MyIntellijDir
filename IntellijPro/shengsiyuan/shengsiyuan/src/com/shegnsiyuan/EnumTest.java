package com.shegnsiyuan;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-5
 * Time: 12:45:36
 * To change this template use File | Settings | File Templates.
 */
public class EnumTest
{
    public static void doOoop(opConstant op)
    {
        switch(op)
        {
            case TURN_LEFT:
                System.out.println("向左转");
                break;
            case TURN_RIGHT:
                System.out.println("向右转");
                break ;
            case SHOOT:
                System.out.println("射击");
                break ;


        }
    }

    public static void main(String[] args)
    {
        Color myColor=Color.Red;
        System.out.println(myColor);

        for(Color color:Color.values())
        {
            System.out.println(color) ;
        }

        doOoop(opConstant.SHOOT);
        

    }





}

enum opConstant
{
    TURN_LEFT,TURN_RIGHT,SHOOT
}
