package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-11
 * Time: 10:34:16
 * To change this template use File | Settings | File Templates.
 */
public class DoubleLink
{
    public long dData;
    public DoubleLink next;
    public DoubleLink previous;

    public DoubleLink(long d)
    {
        dData=d;
    }

    public void displayLink()
    {
        System.out.println(dData+" ");
    }

}
