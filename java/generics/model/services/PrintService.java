package generics.model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Object> list = new ArrayList<>();

    public void addValue(Object value){
        list.add(value);
    }

    public Object first(){
        return list.get(0);
    }

    public void print(){
        System.out.println(list);
    }
}

/*
ao utilizar o object, há problemas como type safety e de performance, uma vez q temos de usar casting, etc;

nao é a melhor solucao!!
*/