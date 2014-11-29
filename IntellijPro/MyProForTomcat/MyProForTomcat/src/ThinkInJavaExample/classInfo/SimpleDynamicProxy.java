package ThinkInJavaExample.classInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;


public class SimpleDynamicProxy<T extends List> implements InvocationHandler
{
	private T t;

	public SimpleDynamicProxy(T t)
	{
		this.t=t;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		System.out.println(t.getClass().getSimpleName());
		int i=(Integer)args[0];
		
		return method.invoke(t, i+10);
	} 
	
	public static void main(String[] args)
	{
		List<Integer> arr=new ArrayList<Integer>();
		List obj=(List)Proxy.newProxyInstance(List.class.getClassLoader(), new Class[] { List.class }, new SimpleDynamicProxy(arr));
		obj.add(5);
		obj.add(12);
		obj.add(13);
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}


}
