package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-5
 * Time: 16:48:28
 * To change this template use File | Settings | File Templates.
 */
public class LinkA
{
    public long dData;
    public LinkA next;

    public LinkA(long dd)
    {
        dData=dd;
    }

   public void displayLink()
    {
        System.out.println(dData+" ");
    }

}
