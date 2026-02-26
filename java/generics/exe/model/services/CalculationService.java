package generics.exe.model.services;

import java.util.List;

public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> list){ //metodo trabalha com tipo T desde que seja qualquer subtipo de comparable T
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be emoty");
        }
        T max = list.get(0);
        for(T item : list){
            if(item.compareTo(max) > 0){ //se for true, retorna numero maior que zero, pelo que me lembro
                max = item;
            }
        }
        return max;
    }
}
