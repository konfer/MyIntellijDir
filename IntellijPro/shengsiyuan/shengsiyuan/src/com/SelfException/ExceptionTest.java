package com.SelfException;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-22
 * Time: 22:18:39
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTest
{
    public void method(String str) throws MyException,MyException2
    {
        if(null==str)
        {
            throw new MyException("���벻��Ϊ��");
        }
        else if("test".equals(str))
        {
            throw new MyException2("test");
        }
        else
        {
            System.out.println(str);
        }
    }

        public static void main(String[] args)
        {

            try
            {
                ExceptionTest e=new ExceptionTest();
                e.method("test");
            }
            catch(MyException e)
            {
                e.printStackTrace();
            }
            catch(MyException2 e)
            {
                e.printStackTrace();
            }
            finally
            {
                System.out.println("�쳣�������");
            }
            System.out.println("����������");

        }
}
