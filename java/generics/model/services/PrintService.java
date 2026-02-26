package generics.model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Integer> list = new ArrayList<>();

    public void addValue(int value){
        list.add(value);
    }

    public int first(){
        return list.get(0);
    }

    public void print(){
        System.out.println(list);
    }
}

/*
essa resolucao serve apenas para numeros, mas e caso eu queira fazer essas mesmas acoes com strings, por exemplo?
*/