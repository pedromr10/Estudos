package lista;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(); //usamos arraylist pois é mais otimizada, aparentemente pega as melhores caracteristicas da lista e do vetor

        list.add("Pedro");
        list.add("Pietro");
        list.add("Alex");
        list.add("Bob");
        list.add("Alessandra");
        //adicionando um elemento em um index especifico da lista:
        list.add(2, "Romulo");
        for(String element : list){
            System.out.println(element);
        }

        //imprimindo tamanho da lista:
        System.out.println(list.size());

        //removendo da lista:
        list.remove("Bob");
        for(String element : list){
            System.out.println(element);
        }

        System.out.println("------------");

        //removendo com predicado (ex: removendo todo mundo que comeca com a letra p):
        list.removeIf(element -> element.charAt(0) == 'P');
        for(String element : list){
            System.out.println(element);
        }
    }
}

/*
obs:
1. Tamanho da lista: size()
2. Inserir elemento na lista: add(obj), add(int, obj)
3. Remover elementos na lista: remove(obj), remove(int), removeIf(Predicate)
4. Encontrar posicao do elemento: indexOf(obj), lastIndexOf(obj)

*/