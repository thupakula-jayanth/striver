import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,2);
        hm.put(2,4);
        hm.put(3,6);
        hm.put(4,8);
        System.out.println(hm.size());//prints the size
        System.out.println(hm.get(1));//gets the value of key
        System.out.println(hm);
        boolean x=hm.containsKey(1);
        System.out.println(x);
        hm.remove(1);//removes the elment
        boolean x1=hm.containsKey(1);//check whether the element is present or not
        System.out.println(x1);
        System.out.println(hm);
        for(Map.Entry<Integer,Integer> i:hm.entrySet())
        {
            System.out.println("key:"+i.getKey()+"  "+"value:"+i.getValue());
        }

    }
}
