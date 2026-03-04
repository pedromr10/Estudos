package equals_hashcode.equals_.application;

import equals_hashcode.equals_.model.entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Pedro", "Xxpedro_masterxX");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Alex", "alex@gmail.com");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c2 == c3); //aqui da false pois ele nao enxerga o conteudo, enxerga a posicao na memoria. Como sao dois objetos diferentes, ocupam lugares diferentes na memoria

        /*
        Caso vc faça:
        String s1 = "teste";
        String s2 = "teste";

        Vai dar true ao usar o ==, pois vc esta digital o valor literal. O compilador trata a digitacao literal de uma forma especial

        Caso vc faça:
        String s1 = new String ("Teste");
        String s2 = new String ("Teste");

        Ai da false, pois vc instanciou completamente o objeto
        */
    }
}
/*

1. Quando quiser comparar objetos por igualdade pelo conteudo, realizar pelo equals;
2. se quiser comparar sua referencia na memoria, usar o ==

*/
