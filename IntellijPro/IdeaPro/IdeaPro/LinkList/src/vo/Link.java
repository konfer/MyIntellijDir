package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-3
 * Time: 10:17:41
 * To change this template use File | Settings | File Templates.
 */
public class Link
{
    public int iData;
    public double dData;
    public Link next;

    public Link(int id,double dd)
    {
        this.iData=id;
        this.dData=dd;
    }

    public void displayLink()
    {
        System.out.print("{"+iData+", "+dData+"} ");
    }

}
