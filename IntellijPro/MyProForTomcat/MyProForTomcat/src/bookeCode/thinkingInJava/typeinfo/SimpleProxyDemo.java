package bookeCode.thinkingInJava.typeinfo;

// : typeinfo/SimpleProxyDemo.java
import static bookeCode.thinkingInJava.net.mindview.util.Print.*;

interface Interface
{
	void doSomething();

	void somethingElse(String arg);
}

class RealObject implements Interface
{
	public void doSomething()
	{
		print("RealObject doSomething");
	}

	public void somethingElse(String arg)
	{
		print("RealObject somethingElse " + arg);
	}
}

class SimpleProxy implements Interface
{
	private Interface proxied;

	public SimpleProxy(Interface proxied)
	{
		this.proxied = proxied;
	}

	public void doSomething()
	{
		print("SimpleProxy doSomething");
		proxied.doSomething();
	}

	public void somethingElse(String arg)
	{
		print("SimpleProxy somethingElse " + arg);
		proxied.somethingElse(arg);
	}
}

class SimpleProxyDemo
{
	public static void consumer(Interface iface)
	{
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args)
	{
		consumer(new RealObject());
		System.out.println("---------------------------------------");
		consumer(new SimpleProxy(new RealObject()));
	}
} /*
   * Output: doSomething somethingElse bonobo SimpleProxy doSomething
   * doSomething SimpleProxy somethingElse bonobo somethingElse bonobo
   */// :~
