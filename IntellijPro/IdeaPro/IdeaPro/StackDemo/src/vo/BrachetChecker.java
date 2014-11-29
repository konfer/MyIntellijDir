package vo;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2011-7-22
 * Time: 17:42:41
 * To change this template use File | Settings | File Templates.
 */
public class BrachetChecker
{
    private String input;

    public BrachetChecker(String in)
    {
        input=in;
    }

    public void check()
    {
        int stackSize=input.length();
        StackX theStack=new StackX(stackSize);

        for(int j=0;j<stackSize;j++)
        {
            char ch=input.charAt(j);
            switch(ch)
            {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!theStack.isEmpty())
                    {
                        char chOut=(char)theStack.pop();
                         if((chOut=='{'&&ch=='}')||(chOut=='['&&ch==']')||(chOut=='('&&ch==')'))
                         {
                             System.out.println("Error: "+ch+" at"+j);
                         }
                    }
                    else
                    {
                        System.out.println("Error: "+ch+" at"+j);
                    }
                    break;
                default:
                    break;
            }
        }
        if(!theStack.isEmpty())
        {
            System.out.println("Error: missing right delimiter");
        }
    }

}
