package generics.tipoCuringa.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> myNumbers = Arrays.asList(5,2,10);
        printList(myNumbers);
        List<String> myStrings = Arrays.asList("pedro", "alessandra");
        printList(myStrings);
        //porem, nao é possivel adicionar dados a uma colecao de tipo curinga, pois o interpretador nao sabe dizer de que tipo será. ex:
        //lista.add(3); -> o programa nao sabe dizer se é integer, string, por isso da erro.
    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}

/*
1. o List<?> é o supertipo de qualquer tipo de lista
2. com tipos curinga podemos fazer metodos que recebem um generico de "qualquer tipo"
3. toda classe herda de object, mas List<Object> NAO é supertipo de List<Integer>
    3.1 Generics em java nao sao covariantes (covariante = se a herda de b entao algo de b pode ser usado como algo de a)
*/