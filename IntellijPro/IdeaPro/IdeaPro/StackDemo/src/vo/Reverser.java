package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-22
 * Time: 16:34:34
 * To change this template use File | Settings | File Templates.
 */
public class Reverser
{
    private String input;
    private String output;

    public Reverser(String in)
    {
        input=in;
    }

    public String doRev()
    {
        int stackSize=input.length();
        StackX theStack=new StackX(stackSize);

        for(int j=0;j<input.length();j++)
        {
            char ch=input.charAt(j);
            theStack.push(ch);
        }

        output="";
        while(!theStack.isEmpty())
        {
            char ch=(char)theStack.pop();
            output+=ch;
        }
        return output;
    }

}
