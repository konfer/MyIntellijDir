package com.shengsiyuan2;

/**
 * Created by IntelliJ IDEA.
 * User: ly_kof
 * Date: 2012-9-16
 * Time: 13:15:57
 * To change this template use File | Settings | File Templates.
 */
public class People {

    String name;

    public People(String name)
    {
        this.name=name;
    }

    public boolean equals(Object obj)
    {
       if(this==obj)
       {
           return true;
       }
       if(null!=obj&&obj instanceof People)
       {
           People p=(People)obj;
           System.out.println(this.name+"   "+p.name);
           if(p.name.equals(this.name))
           {

               System.out.println("trur called");
                return true;
           }
       }
       System.out.println("false");
       return false;
    }

    public int hashCode()
    {
        return this.name.hashCode();
    }


    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        if (name != null ? !name.equals(people.name) : people.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
    */
}

