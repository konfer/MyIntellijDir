package com.annotation;

import com.annotation.myAnnotation.MyAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-10-21
 * Time: 11:27:01
 * To change this template use File | Settings | File Templates.
 */
public class MyReflection
{
    public static void main(String[] args) throws Exception
    {
        MyTest myTest=new MyTest();
        Class<MyTest> c=MyTest.class;
//        Method m=c.getMethod("output",new Class[]{});
//        if(m.isAnnotationPresent(MyAnnotation.class))
//        {
//            m.invoke(myTest,new Object[]{});
//            MyAnnotation my=m.getAnnotation(MyAnnotation.class);
//            String val=my.val();
//            String _val=my._val();
//            System.out.println(val+" "+_val);
//        }
        if(c.isAnnotationPresent(MyAnnotation.class))
        {
           // Class<MyTest> c=MyTest.class;
            Method m=c.getMethod("output",new Class[]{});
            m.invoke(myTest,new Object[]{});
            Annotation[] anno=m.getAnnotations();
            for(Annotation a:anno)
            {
                System.out.println(a.annotationType().getName());
            }
        }

    }
}
