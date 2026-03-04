package set_.application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program2 {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union:
        Set<Integer> c = new TreeSet<>(a); //c vai ser copia do conjunto a
        c.addAll(b); //faz a uniao do conjunto c com o b
        System.out.println(c);

        //intersection:
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b); //pega so os que tem em comum
        System.out.println(d);

        //difference:
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b); //remove do conjunto e os que estao no conjunto b
        System.out.println(e);
    }
}
