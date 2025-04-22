import java.util.*;
public class hashset {   
     public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        System.out.println(hs);//it prints in a square braces seperated by commas
        boolean x=hs.contains(1);
        System.out.println(x);
        hs.remove(1);
        boolean x1=hs.contains(1);
        System.out.println(x1);
        System.out.println(hs);
        for(int y:hs)
        {
            System.out.println(y);//it prints values in new line one by one
        }
    }
}
