package set_.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {
    public static void main(String[] args) {
        //hashset é o mais rapido, mas nao garante a ordem:
        //Set<String> set = new HashSet<>();
        
        //treeset é o mais lento, ordena: 
        //Set<String> set = new TreeSet<>();

        //linkedhashset mantem a ordem de insercao:
        Set<String> set = new LinkedHashSet<>();
        
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        //removeIf: remove o elemento caso satisfaca alguma condicao
        set.removeIf(x -> x.charAt(0) == 'T'); //para cada elemento x de set...
        
        System.out.println(set.contains("Notebook"));

        for(String p: set){
            System.out.println(p);
        }
    }
}
