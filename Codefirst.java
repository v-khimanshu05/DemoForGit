
package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C2 {
    
    public static void main(String[] args) {
        
        List li  = new LinkedList();
        li.add("java");
        li.add("android");
        li.add("php");
        li.add("j2ee");
        System.out.println("list of subjects");
        for (Object o : li) {
            System.out.println(o);
        }
        System.out.println("size 1  : " + li.size());
        System.out.println("adding data in 2nd position advance php");
        li.add(1,"advance php");
        System.out.println("size 2  : " + li.size());
        System.out.println("search j2ee " + li.contains("j2ee"));
        System.out.println("remove php " );
        li.remove("php");
        System.out.println("size 3  : " + li.size());
        System.out.println("search php " + li.contains("php"));
        System.out.println("list of subjects");
        for (Object o : li) {
            System.out.println(o);
        }
    }
}


