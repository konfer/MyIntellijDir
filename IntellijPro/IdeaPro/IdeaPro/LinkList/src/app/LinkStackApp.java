package app;

import vo.LinkStack;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-8-5
 * Time: 16:47:06
 * To change this template use File | Settings | File Templates.
 */
public class LinkStackApp
{
    public static void main(String[] args)
    {
        LinkStack theStack =new LinkStack();

        theStack.push(20);
        theStack.push(30);
        theStack.push(40);

        theStack.displayStack();

        theStack.push(50);
        theStack.push(60);
        theStack.push(70);

        theStack.displayStack();

        theStack.pop();
        theStack.pop();

        theStack.displayStack();

    }

}
